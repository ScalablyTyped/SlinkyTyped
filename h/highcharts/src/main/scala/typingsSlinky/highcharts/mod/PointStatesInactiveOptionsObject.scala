package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesInactiveOptionsObject extends js.Object {
  /**
    * Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PointStatesInactiveOptionsObject {
  @scala.inline
  def apply(opacity: js.UndefOr[Double] = js.undefined): PointStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesInactiveOptionsObject]
  }
}

