package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldGroupConfigProperties extends js.Object {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The field configurations belonging to a group. For an example of grouped field configurations, please refer to the [Update Feature Attributes](https://developers.arcgis.com/javascript/latest/sample-code/editing-groupedfeatureform/index.html) sample.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties]] = js.native
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that controls this field's visibility. The field will only display if this expression is `true`.  [![featureFormFieldVisibility](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureform-fieldvisilbility.png)](https://developers.arcgis.com/javascript/latest/sample-code/sandbox/sandbox.html?sample=editing-featureform-fieldvisibility)
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[String] = js.native
}

object FieldGroupConfigProperties {
  @scala.inline
  def apply(): FieldGroupConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldGroupConfigProperties]
  }
  @scala.inline
  implicit class FieldGroupConfigPropertiesOps[Self <: FieldGroupConfigProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldConfig(value: js.Array[FieldConfigProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityExpression")(js.undefined)
        ret
    }
  }
  
}

