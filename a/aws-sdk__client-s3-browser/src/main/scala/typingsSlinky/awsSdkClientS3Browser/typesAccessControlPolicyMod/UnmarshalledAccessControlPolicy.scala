package typingsSlinky.awsSdkClientS3Browser.typesAccessControlPolicyMod

import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAccessControlPolicy extends AccessControlPolicy {
  /**
    * <p>A list of grants.</p>
    */
  @JSName("Grants")
  var Grants_UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledAccessControlPolicy: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledAccessControlPolicy {
  @scala.inline
  def apply(): UnmarshalledAccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAccessControlPolicy]
  }
  @scala.inline
  implicit class UnmarshalledAccessControlPolicyOps[Self <: UnmarshalledAccessControlPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrants(value: js.Array[UnmarshalledGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: UnmarshalledOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

