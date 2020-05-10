package typingsSlinky.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextTranslation extends js.Object {
  var comments: js.UndefOr[GetTextComment] = js.native
  var msgctxt: js.UndefOr[String] = js.native
  var msgid: String = js.native
  var msgid_plural: js.UndefOr[js.Any] = js.native
  var msgstr: js.Array[String] = js.native
}

object GetTextTranslation {
  @scala.inline
  def apply(msgid: String, msgstr: js.Array[String]): GetTextTranslation = {
    val __obj = js.Dynamic.literal(msgid = msgid.asInstanceOf[js.Any], msgstr = msgstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextTranslation]
  }
  @scala.inline
  implicit class GetTextTranslationOps[Self <: GetTextTranslation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsgid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgstr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgstr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: GetTextComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgctxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgctxt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgctxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgctxt")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgid_plural(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid_plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgid_plural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid_plural")(js.undefined)
        ret
    }
  }
  
}

