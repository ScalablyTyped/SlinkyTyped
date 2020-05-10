package typingsSlinky.emailTemplates.mod

import typingsSlinky.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions[T] extends js.Object {
  /**
    * The Template Variables
    */
  var locals: js.UndefOr[T] = js.native
  /**
    * Nodemailer Message <Nodemailer.com/message/>
    *
    * Overrides what is given for constructor
    */
  var message: Options = js.native
  /**
    * The template name
    */
  var template: String = js.native
}

object EmailOptions {
  @scala.inline
  def apply[T](message: Options, template: String): EmailOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions[T]]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self[t] <: EmailOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMessage(value: Options): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocals(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
  }
  
}

