package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLNamespace extends js.Object {
  @JSName("MSHTML.HTMLNamespace_typekey")
  var MSHTMLDotHTMLNamespace_typekey: HTMLNamespace = js.native
  val constructor: js.Any = js.native
  val name: String = js.native
  var onreadystatechange: js.Any = js.native
  val readyState: js.Any = js.native
  val tagNames: js.Any = js.native
  val urn: String = js.native
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  def doImport(bstrImplementationUrl: String): Unit = js.native
}

object HTMLNamespace {
  @scala.inline
  def apply(
    MSHTMLDotHTMLNamespace_typekey: HTMLNamespace,
    attachEvent: (String, js.Any) => Boolean,
    constructor: js.Any,
    detachEvent: (String, js.Any) => Unit,
    doImport: String => Unit,
    name: String,
    onreadystatechange: js.Any,
    readyState: js.Any,
    tagNames: js.Any,
    urn: String
  ): HTMLNamespace = {
    val __obj = js.Dynamic.literal(attachEvent = js.Any.fromFunction2(attachEvent), constructor = constructor.asInstanceOf[js.Any], detachEvent = js.Any.fromFunction2(detachEvent), doImport = js.Any.fromFunction1(doImport), name = name.asInstanceOf[js.Any], onreadystatechange = onreadystatechange.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNamespace_typekey")(MSHTMLDotHTMLNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNamespace]
  }
  @scala.inline
  implicit class HTMLNamespaceOps[Self <: HTMLNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLNamespace_typekey(value: HTMLNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLNamespace_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachEvent(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachEvent(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDoImport(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doImport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnreadystatechange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

