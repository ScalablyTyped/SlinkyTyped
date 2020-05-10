package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSymbol3DVerticalOffsetProperties extends Object {
  /**
    * The maximum vertical symbol offset in world units. It acts as an upper bound to avoid vertical offset becoming too big.  In the following animation the green symbols have `maxWorldLength = 50` and orange symbols don't have `maxWorldLength` set:  ![maxWorldLength](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-maxWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.native
  /**
    * The minimum vertical symbol offset in world units. It acts as a lower bound to avoid the vertical offset becoming too small.  In the following animation the green symbol on the left has `minWorldLength = 20` and for the orange symbol on the right `minWorldLength` has not been set:  ![minWorldLength-on](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-minWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.native
  /**
    * The vertical symbol offset in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.native
}

object LabelSymbol3DVerticalOffsetProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LabelSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LabelSymbol3DVerticalOffsetProperties]
  }
  @scala.inline
  implicit class LabelSymbol3DVerticalOffsetPropertiesOps[Self <: LabelSymbol3DVerticalOffsetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWorldLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorldLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorldLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorldLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWorldLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWorldLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWorldLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWorldLength")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenLength")(js.undefined)
        ret
    }
  }
  
}

