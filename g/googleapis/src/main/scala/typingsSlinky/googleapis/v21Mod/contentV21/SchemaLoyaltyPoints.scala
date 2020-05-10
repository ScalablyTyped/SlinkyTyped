package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLoyaltyPoints extends js.Object {
  /**
    * Name of loyalty points program. It is recommended to limit the name to 12
    * full-width characters or 24 Roman characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The retailer&#39;s loyalty points in absolute value.
    */
  var pointsValue: js.UndefOr[String] = js.native
  /**
    * The ratio of a point when converted to currency. Google assumes currency
    * based on Merchant Center settings. If ratio is left out, it defaults
    * to 1.0.
    */
  var ratio: js.UndefOr[Double] = js.native
}

object SchemaLoyaltyPoints {
  @scala.inline
  def apply(): SchemaLoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoyaltyPoints]
  }
  @scala.inline
  implicit class SchemaLoyaltyPointsOps[Self <: SchemaLoyaltyPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
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
    def withPointsValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
  }
  
}

