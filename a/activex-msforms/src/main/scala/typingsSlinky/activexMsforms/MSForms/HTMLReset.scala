package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLReset extends js.Object {
  var Caption: String = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLReset_typekey")
  var MSFormsDotHTMLReset_typekey: HTMLReset = js.native
}

object HTMLReset {
  @scala.inline
  def apply(Caption: String, HTMLName: String, HTMLType: String, MSFormsDotHTMLReset_typekey: HTMLReset): HTMLReset = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLReset_typekey")(MSFormsDotHTMLReset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLReset]
  }
  @scala.inline
  implicit class HTMLResetOps[Self <: HTMLReset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotHTMLReset_typekey(value: HTMLReset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLReset_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

