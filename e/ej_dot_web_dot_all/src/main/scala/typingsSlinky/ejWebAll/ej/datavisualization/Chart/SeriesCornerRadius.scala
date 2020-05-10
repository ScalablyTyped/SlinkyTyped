package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesCornerRadius extends js.Object {
  /** Specifies the radius for the bottom left corner.
    * @Default {0}
    */
  var bottomLeft: js.UndefOr[Double] = js.native
  /** Specifies the radius for the bottom right corner.
    * @Default {0}
    */
  var bottomRight: js.UndefOr[Double] = js.native
  /** Specifies the radius for the top left corner.
    * @Default {0}
    */
  var topLeft: js.UndefOr[Double] = js.native
  /** Specifies the radius for the top right corner.
    * @Default {0}
    */
  var topRight: js.UndefOr[Double] = js.native
}

object SeriesCornerRadius {
  @scala.inline
  def apply(): SeriesCornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCornerRadius]
  }
  @scala.inline
  implicit class SeriesCornerRadiusOps[Self <: SeriesCornerRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.undefined)
        ret
    }
  }
  
}

