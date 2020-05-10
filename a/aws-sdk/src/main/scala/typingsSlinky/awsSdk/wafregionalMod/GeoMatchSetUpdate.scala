package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a country with UpdateGeoMatchSet.
    */
  var Action: ChangeAction = js.native
  /**
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  var GeoMatchConstraint: typingsSlinky.awsSdk.wafregionalMod.GeoMatchConstraint = js.native
}

object GeoMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, GeoMatchConstraint: GeoMatchConstraint): GeoMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], GeoMatchConstraint = GeoMatchConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetUpdate]
  }
  @scala.inline
  implicit class GeoMatchSetUpdateOps[Self <: GeoMatchSetUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ChangeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeoMatchConstraint(value: GeoMatchConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchConstraint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

