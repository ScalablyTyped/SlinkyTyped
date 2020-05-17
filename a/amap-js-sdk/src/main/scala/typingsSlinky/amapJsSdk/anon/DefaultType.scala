package typingsSlinky.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultType extends js.Object {
  var defaultType: js.UndefOr[Double] = js.native
  var showRoad: js.UndefOr[Boolean] = js.native
  var showTraffic: js.UndefOr[Boolean] = js.native
}

object DefaultType {
  @scala.inline
  def apply(): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultType]
  }
  @scala.inline
  implicit class DefaultTypeOps[Self <: DefaultType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(js.undefined)
        ret
    }
  }
  
}

