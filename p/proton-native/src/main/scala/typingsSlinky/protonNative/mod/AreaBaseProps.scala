package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.protonNativeStrings.bevel
import typingsSlinky.protonNative.protonNativeStrings.flat
import typingsSlinky.protonNative.protonNativeStrings.miter
import typingsSlinky.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaBaseProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The fill color for the component.
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * The opacity of the fill (between 0 and 1). Gets multiplied with the fill colors alpha value.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The stroke (line) color for the component.
    */
  var stroke: js.UndefOr[String] = js.native
  var strokeLinecap: js.UndefOr[flat | round | bevel] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel] = js.native
  /**
    * How far to extend the stroke at a sharp corner when using `strokeLinejoin='miter'`
    * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-miterlimit
    * for a more detailed explanation.
    */
  var strokeMiterlimit: js.UndefOr[Double] = js.native
  /**
    * The opacity of the stroke (between 0 and 1). Gets multiplied with the stroke colors alpha value.
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * List of transformations to apply to the component (are quite similar to SVG transformations). Example for multiple transformations: `transform="translate(100, 100) rotate(90)"`.
    *
    * All x and y coordinates specified in a transformation are relative _to the component itself_, meaning that `translate(-50%, 0)` will translate the component by 50% of it's own width to left.
    */
  var transform: js.UndefOr[String] = js.native
}

object AreaBaseProps {
  @scala.inline
  def apply(): AreaBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaBaseProps]
  }
  @scala.inline
  implicit class AreaBasePropsOps[Self <: AreaBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: flat | round | bevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinejoin(value: miter | round | bevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterlimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

