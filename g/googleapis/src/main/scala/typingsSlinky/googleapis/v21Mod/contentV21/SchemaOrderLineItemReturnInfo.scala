package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemReturnInfo extends js.Object {
  /**
    * How many days later the item can be returned.
    */
  var daysToReturn: js.UndefOr[Double] = js.native
  /**
    * Whether the item is returnable.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * URL of the item return policy.
    */
  var policyUrl: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemReturnInfo {
  @scala.inline
  def apply(): SchemaOrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemReturnInfo]
  }
  @scala.inline
  implicit class SchemaOrderLineItemReturnInfoOps[Self <: SchemaOrderLineItemReturnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToReturn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysToReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReturnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReturnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(js.undefined)
        ret
    }
  }
  
}

