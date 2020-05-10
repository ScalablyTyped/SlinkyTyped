package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWaypointOptions extends js.Object {
  /** 
    * The address string of the waypoint. For example, the following strings are valid for this parameter: "Seattle", "1 Microsoft Way, Redmond, WA". Either the address or location property must be specified.
    */
  var address: js.UndefOr[String] = js.native
  /** 
    * A boolean indicating whether the waypoint is a via point. A via point is a point along the route that is not a stop point. Set this property to
    * true if you just want the route to pass through this location. Default: false
    */
  var isViaPoint: js.UndefOr[Boolean] = js.native
  /** The location of the waypoint. Either the address or location property must be specified. */
  var location: js.UndefOr[Location] = js.native
}

object IWaypointOptions {
  @scala.inline
  def apply(): IWaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaypointOptions]
  }
  @scala.inline
  implicit class IWaypointOptionsOps[Self <: IWaypointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withIsViaPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViaPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsViaPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViaPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

