package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ReplyFormData object that contains body or attachment data and a callback function. Used when displaying a reply form.
  */
@js.native
trait ReplyFormData extends js.Object {
  /**
    * An array of {@link Office.ReplyFormAttachment | ReplyFormAttachment} that are either file or item attachments.
    */
  var attachments: js.UndefOr[js.Array[ReplyFormAttachment]] = js.native
  /**
    * When the reply display call completes, the function passed in the callback parameter is called with a single parameter, 
    * `asyncResult`, which is an `Office.AsyncResult` object.
    */
  var callback: js.UndefOr[js.Function1[/* asyncResult */ AsyncResult[_], Unit]] = js.native
  /**
    * A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB.
    */
  var htmlBody: js.UndefOr[String] = js.native
  /**
    * An object literal that contains the following property.
    * `asyncContext`: Developers can provide any object they wish to access in the callback method.
    */
  var options: js.UndefOr[AsyncContextOptions] = js.native
}

object ReplyFormData {
  @scala.inline
  def apply(): ReplyFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyFormData]
  }
  @scala.inline
  implicit class ReplyFormDataOps[Self <: ReplyFormData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[ReplyFormAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: /* asyncResult */ AsyncResult[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AsyncContextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

