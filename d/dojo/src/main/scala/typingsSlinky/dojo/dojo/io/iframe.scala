package typingsSlinky.dojo.dojo.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/io/iframe.html
  *
  * Deprecated, use dojo/request/iframe instead.
  * Sends an Ajax I/O call using and Iframe (for instance, to upload files)
  *
  */
@js.native
trait iframe extends js.Object {
  /**
    * Creates a hidden iframe in the page. Used mostly for IO
    * transports.  You do not need to call this to start a
    * dojo/io/iframe request. Just call send().
    *
    * @param fname The name of the iframe. Used for the name attribute on theiframe.
    * @param onloadstr A string of JavaScript that will be executed when the contentin the iframe loads.
    * @param uri The value of the src attribute on the iframe element. If avalue is not given, then dojo/resources/blank.html will beused.
    */
  def create(fname: String, onloadstr: String, uri: String): Unit = js.native
  /**
    * Returns the document object associated with the iframe DOM Node argument.
    *
    * @param iframeNode
    */
  def doc(iframeNode: js.Any): Unit = js.native
  /**
    * Sets the URL that is loaded in an IFrame. The replace parameter
    * indicates whether location.replace() should be used when
    * changing the location of the iframe.
    *
    * @param iframe
    * @param src
    * @param replace
    */
  def setSrc(iframe: js.Any, src: js.Any, replace: js.Any): Unit = js.native
}

object iframe {
  @scala.inline
  def apply(
    create: (String, String, String) => Unit,
    doc: js.Any => Unit,
    setSrc: (js.Any, js.Any, js.Any) => Unit
  ): iframe = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), doc = js.Any.fromFunction1(doc), setSrc = js.Any.fromFunction3(setSrc))
    __obj.asInstanceOf[iframe]
  }
  @scala.inline
  implicit class iframeOps[Self <: iframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDoc(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSrc(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSrc")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

