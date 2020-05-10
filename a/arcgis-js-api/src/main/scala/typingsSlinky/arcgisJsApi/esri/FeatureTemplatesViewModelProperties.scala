package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplatesViewModelProperties extends js.Object {
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  var filterFunction: js.UndefOr[FilterFunction] = js.native
  /**
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html). This can aid in managing various template items and how they display within the widget. The values are discussed below.
    *
    * Type | Description | Example
    * ----- | ----------- | -------
    * layer | This is the *default* grouping. Groups template items by layers. | ![featureTemplatesGroupByLayer](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByLayers.png)
    * geometry | Groups template items by geometry type. | ![FeatureTemplatesGroupByGeometry](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByGeometry.png)
    * none | The widget displays everything in one list with no grouping. | ![featureTemplatesGroupByLayer](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByNone.png)
    * [GroupByFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#GroupByFunction) | Custom function that takes an object containing a [FeatureTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) and [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). | ![FeatureTemplatesGroupByCustomGroupFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupCustomGroup.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
    *
    * @default layer
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.native
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget. The order in which these layers are set in the array dictates how they display within the widget.
    * > The widget is designed to only display layers that are enabled for editing. It will not display layers that are enabled to only edit attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.native
}

object FeatureTemplatesViewModelProperties {
  @scala.inline
  def apply(): FeatureTemplatesViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesViewModelProperties]
  }
  @scala.inline
  implicit class FeatureTemplatesViewModelPropertiesOps[Self <: FeatureTemplatesViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFunction(value: /* filterName */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupBy(value: String | GroupByFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[FeatureLayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

