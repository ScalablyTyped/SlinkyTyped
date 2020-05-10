package typingsSlinky.pulumiAws.accessKeyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyArgs extends js.Object {
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:some_person_that_exists`, for use
    * in the `encryptedSecret` output attribute.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The access key status to apply. Defaults to `Active`.
    * Valid values are `Active` and `Inactive`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user to associate with this access key.
    */
  val user: Input[String] = js.native
}

object AccessKeyArgs {
  @scala.inline
  def apply(user: Input[String]): AccessKeyArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyArgs]
  }
  @scala.inline
  implicit class AccessKeyArgsOps[Self <: AccessKeyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgpKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgpKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

