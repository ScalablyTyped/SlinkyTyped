package typingsSlinky.awsSdkClientS3Node.typesAccessControlPolicyMod

import typingsSlinky.awsSdkClientS3Node.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlPolicy extends js.Object {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner] = js.undefined
}

object AccessControlPolicy {
  @scala.inline
  def apply(Grants: js.Array[Grant] | js.Iterable[Grant] = null, Owner: Owner = null): AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlPolicy]
  }
}

