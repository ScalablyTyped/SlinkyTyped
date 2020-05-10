package typingsSlinky.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointRegionMouseClickEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** X-coordinate of point in pixel
    */
  var locationX: js.UndefOr[Double] = js.native
  /** Y-coordinate of point in pixel
    */
  var locationY: js.UndefOr[Double] = js.native
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Index of the point in series
    */
  var pointIndex: js.UndefOr[Double] = js.native
  /** Type of the series
    */
  var seriesType: js.UndefOr[String] = js.native
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object PointRegionMouseClickEventArgs {
  @scala.inline
  def apply(): PointRegionMouseClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointRegionMouseClickEventArgs]
  }
  @scala.inline
  implicit class PointRegionMouseClickEventArgsOps[Self <: PointRegionMouseClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationX")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationY")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPointIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(js.undefined)
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

