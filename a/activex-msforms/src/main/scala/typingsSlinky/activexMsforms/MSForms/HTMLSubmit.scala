package typingsSlinky.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSubmit extends js.Object {
  var Action: String = js.native
  var Caption: String = js.native
  var Encoding: String = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLSubmit_typekey")
  var MSFormsDotHTMLSubmit_typekey: HTMLSubmit = js.native
  var Method: String = js.native
}

object HTMLSubmit {
  @scala.inline
  def apply(
    Action: String,
    Caption: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLSubmit_typekey: HTMLSubmit,
    Method: String
  ): HTMLSubmit = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSubmit_typekey")(MSFormsDotHTMLSubmit_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSubmit]
  }
  @scala.inline
  implicit class HTMLSubmitOps[Self <: HTMLSubmit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(value.asInstanceOf[js.Any])
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
    def withMSFormsDotHTMLSubmit_typekey(value: HTMLSubmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.HTMLSubmit_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

