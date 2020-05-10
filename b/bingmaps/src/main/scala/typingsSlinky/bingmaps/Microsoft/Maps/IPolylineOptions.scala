package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolylineOptions extends IPrimitiveOptions {
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[Boolean] = js.native
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[String | Color] = js.native
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[Double] | String] = js.native
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[Double] = js.native
}

object IPolylineOptions {
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  @scala.inline
  implicit class IPolylineOptionsOps[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneralizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneralizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generalizable")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String | Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashArray(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
  }
  
}

