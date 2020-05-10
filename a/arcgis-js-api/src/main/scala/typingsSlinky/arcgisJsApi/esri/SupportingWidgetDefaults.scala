package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportingWidgetDefaults extends Object {
  /**
    * An object containing properties specific for customizing the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureForm: js.UndefOr[SupportingWidgetDefaultsFeatureForm] = js.native
  /**
    * An object containing properties specific for customizing the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureTemplates: js.UndefOr[SupportingWidgetDefaultsFeatureTemplates] = js.native
  /**
    * An object containing properties specific for customizng the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var sketch: js.UndefOr[SupportingWidgetDefaultsSketch] = js.native
}

object SupportingWidgetDefaults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaults]
  }
  @scala.inline
  implicit class SupportingWidgetDefaultsOps[Self <: SupportingWidgetDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureForm(value: SupportingWidgetDefaultsFeatureForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureForm")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureTemplates(value: SupportingWidgetDefaultsFeatureTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withSketch(value: SupportingWidgetDefaultsSketch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sketch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSketch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sketch")(js.undefined)
        ret
    }
  }
  
}

