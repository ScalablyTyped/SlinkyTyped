package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRouteTableAssociationResult extends js.Object {
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.native
}

object ReplaceRouteTableAssociationResult {
  @scala.inline
  def apply(): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
  @scala.inline
  implicit class ReplaceRouteTableAssociationResultOps[Self <: ReplaceRouteTableAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationState(value: RouteTableAssociationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationState")(js.undefined)
        ret
    }
    @scala.inline
    def withNewAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewAssociationId")(js.undefined)
        ret
    }
  }
  
}

