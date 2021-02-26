package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.loading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplatesViewModel
  extends Accessor
     with Evented {
  
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  def filterFunction(filterName: js.Any): Boolean = js.native
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  @JSName("filterFunction")
  var filterFunction_Original: FilterFunction = js.native
  
  /**
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
    */
  var groupBy: String | GroupByFunction = js.native
  
  /**
    * The template items or grouped template items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#items)
    */
  val items: js.Array[TemplateItem | TemplateItemGroup] = js.native
  
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
    */
  var layers: js.Array[FeatureLayer] = js.native
  
  @JSName("on")
  def on_select(name: select, eventHandler: FeatureTemplatesViewModelSelectEventHandler): IHandle = js.native
  
  /**
    * This method updates the [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) with the provided filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#refresh)
    */
  def refresh(): Unit = js.native
  
  /**
    * Selects the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#select)
    */
  def select(): Unit = js.native
  def select(item: TemplateItem): Unit = js.native
  
  /**
    * The widget's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#state)
    */
  val state: ready | loading | disabled = js.native
}
