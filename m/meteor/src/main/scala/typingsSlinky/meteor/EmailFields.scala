package typingsSlinky.meteor

import typingsSlinky.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[String]] = js.native
  var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
  var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.native
  var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.native
}

object EmailFields {
  @scala.inline
  def apply(): EmailFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFields]
  }
  @scala.inline
  implicit class EmailFieldsOps[Self <: EmailFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: (/* user */ User, /* url */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: /* user */ User => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: (/* user */ User, /* url */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

