package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activation extends js.Object {
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ActivationId] = js.native
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A name for the managed instance when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DefaultInstanceName] = js.native
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.native
  /**
    * The date when this activation can no longer be used to register managed instances.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
    */
  var IamRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.IamRole] = js.native
  /**
    * The maximum number of managed instances that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RegistrationLimit] = js.native
  /**
    * The number of managed instances already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RegistrationsCount] = js.native
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Activation {
  @scala.inline
  def apply(): Activation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activation]
  }
  @scala.inline
  implicit class ActivationOps[Self <: Activation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationId(value: ActivationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultInstanceName(value: DefaultInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ActivationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expired")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRole(value: IamRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationLimit(value: RegistrationLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationsCount(value: RegistrationsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

