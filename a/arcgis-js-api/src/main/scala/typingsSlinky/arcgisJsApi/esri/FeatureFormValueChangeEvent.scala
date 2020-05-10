package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormValueChangeEvent extends js.Object {
  var feature: Graphic = js.native
  var fieldName: String = js.native
  var layer: FeatureLayer = js.native
  var valid: Boolean = js.native
  var value: Double | String | js.Any = js.native
}

object FeatureFormValueChangeEvent {
  @scala.inline
  def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | js.Any
  ): FeatureFormValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormValueChangeEvent]
  }
  @scala.inline
  implicit class FeatureFormValueChangeEventOps[Self <: FeatureFormValueChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: Graphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: FeatureLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

