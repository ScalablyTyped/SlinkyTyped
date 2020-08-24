package typingsSlinky.awsSdkClientS3Browser.typesAccessControlPolicyMod

import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlPolicy extends js.Object {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesOwnerMod.Owner] = js.native
}

object AccessControlPolicy {
  @scala.inline
  def apply(): AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlPolicy]
  }
  @scala.inline
  implicit class AccessControlPolicyOps[Self <: AccessControlPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrantsVarargs(value: Grant*): Self = this.set("Grants", js.Array(value :_*))
    @scala.inline
    def setGrantsIterable(value: js.Iterable[Grant]): Self = this.set("Grants", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrants(value: js.Array[Grant] | js.Iterable[Grant]): Self = this.set("Grants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrants: Self = this.set("Grants", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
  
}

