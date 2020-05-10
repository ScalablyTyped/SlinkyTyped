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
    def withGrantsIterable(value: js.Iterable[Grant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrants(value: js.Array[Grant] | js.Iterable[Grant]): Self = {
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
    def withOwner(value: Owner): Self = {
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

