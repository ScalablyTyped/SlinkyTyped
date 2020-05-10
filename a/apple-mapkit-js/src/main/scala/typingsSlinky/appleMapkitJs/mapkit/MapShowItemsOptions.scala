package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that determine map parameters used when showing items.
  */
@js.native
trait MapShowItemsOptions extends js.Object {
  /**
    * A Boolean value that determines whether the map is animated as the map
    * region changes to show the items.
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Spacing that is added around the computed map region when showing items.
    */
  var minimumSpan: js.UndefOr[CoordinateSpan] = js.native
  /**
    * The minimum longitudinal and latitudinal span the map should display.
    */
  var padding: js.UndefOr[Padding] = js.native
}

object MapShowItemsOptions {
  @scala.inline
  def apply(): MapShowItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapShowItemsOptions]
  }
  @scala.inline
  implicit class MapShowItemsOptionsOps[Self <: MapShowItemsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSpan(value: CoordinateSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

