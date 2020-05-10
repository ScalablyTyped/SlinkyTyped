package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.doc.html
  *
  * Alias for the current document. 'doc' can be modified
  * for temporary context shifting. See also withDoc().
  * Use this rather than referring to 'window.document' to ensure your code runs
  * correctly in managed contexts.
  *
  */
@js.native
trait doc extends js.Object {
  /**
    *
    */
  var documentElement: js.Object = js.native
  /**
    *
    */
  var dojoClick: Boolean = js.native
}

object doc {
  @scala.inline
  def apply(documentElement: js.Object, dojoClick: Boolean): doc = {
    val __obj = js.Dynamic.literal(documentElement = documentElement.asInstanceOf[js.Any], dojoClick = dojoClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[doc]
  }
  @scala.inline
  implicit class docOps[Self <: doc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentElement(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDojoClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

