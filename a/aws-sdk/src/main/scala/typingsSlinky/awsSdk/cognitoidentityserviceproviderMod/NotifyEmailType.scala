package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyEmailType extends js.Object {
  /**
    * The HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.native
  /**
    * The subject.
    */
  var Subject: EmailNotificationSubjectType = js.native
  /**
    * The text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.native
}

object NotifyEmailType {
  @scala.inline
  def apply(Subject: EmailNotificationSubjectType): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyEmailType]
  }
  @scala.inline
  implicit class NotifyEmailTypeOps[Self <: NotifyEmailType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubject(value: EmailNotificationSubjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlBody(value: EmailNotificationBodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBody(value: EmailNotificationBodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBody")(js.undefined)
        ret
    }
  }
  
}

