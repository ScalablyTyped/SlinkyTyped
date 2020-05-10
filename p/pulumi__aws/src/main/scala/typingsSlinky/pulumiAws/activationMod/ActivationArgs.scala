package typingsSlinky.pulumiAws.activationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivationArgs extends js.Object {
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The date by which this activation request should expire. The default value is 24 hours.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: Input[String] = js.native
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ActivationArgs {
  @scala.inline
  def apply(iamRole: Input[String]): ActivationArgs = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationArgs]
  }
  @scala.inline
  implicit class ActivationArgsOps[Self <: ActivationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

