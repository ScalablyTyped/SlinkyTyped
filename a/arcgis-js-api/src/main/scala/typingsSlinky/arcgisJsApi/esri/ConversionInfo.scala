package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionInfo extends Object {
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def convert(): Unit = js.native
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def reverseConvert(): Unit = js.native
}

object ConversionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    convert: () => Unit,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reverseConvert: () => Unit
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], convert = js.Any.fromFunction0(convert), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reverseConvert = js.Any.fromFunction0(reverseConvert))
    __obj.asInstanceOf[ConversionInfo]
  }
  @scala.inline
  implicit class ConversionInfoOps[Self <: ConversionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverseConvert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseConvert")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

