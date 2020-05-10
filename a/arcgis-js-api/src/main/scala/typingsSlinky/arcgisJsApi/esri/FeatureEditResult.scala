package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureEditResult extends Object {
  /**
    * If the edit failed, the edit result includes an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var error: FeatureEditResultError = js.native
  /**
    * The globalId of the feature or the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var globalId: String = js.native
  /**
    * The objectId of the feature or the attachmentId of the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var objectId: Double = js.native
}

object FeatureEditResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    error: FeatureEditResultError,
    globalId: String,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureEditResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureEditResult]
  }
  @scala.inline
  implicit class FeatureEditResultOps[Self <: FeatureEditResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: FeatureEditResultError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

