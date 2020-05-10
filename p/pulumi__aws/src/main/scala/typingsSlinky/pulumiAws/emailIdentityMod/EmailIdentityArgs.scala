package typingsSlinky.pulumiAws.emailIdentityMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailIdentityArgs extends js.Object {
  /**
    * The email address to assign to SES
    */
  val email: Input[String] = js.native
}

object EmailIdentityArgs {
  @scala.inline
  def apply(email: Input[String]): EmailIdentityArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIdentityArgs]
  }
  @scala.inline
  implicit class EmailIdentityArgsOps[Self <: EmailIdentityArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

