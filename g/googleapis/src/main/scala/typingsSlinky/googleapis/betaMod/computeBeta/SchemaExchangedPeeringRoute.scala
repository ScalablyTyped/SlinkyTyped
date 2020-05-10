package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExchangedPeeringRoute extends js.Object {
  /**
    * The destination range of the route.
    */
  var destRange: js.UndefOr[String] = js.native
  /**
    * If the peering route is imported if there is no confliction.
    */
  var imported: js.UndefOr[Boolean] = js.native
  /**
    * The region of peering route next hop, only applies to dynamic routes.
    */
  var nextHopRegion: js.UndefOr[String] = js.native
  /**
    * The priority of the peering route.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * The type of the peering route.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaExchangedPeeringRoute {
  @scala.inline
  def apply(): SchemaExchangedPeeringRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangedPeeringRoute]
  }
  @scala.inline
  implicit class SchemaExchangedPeeringRouteOps[Self <: SchemaExchangedPeeringRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destRange")(js.undefined)
        ret
    }
    @scala.inline
    def withImported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imported")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHopRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHopRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHopRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

