package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.continuous
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.update
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchProperties extends WidgetProperties {
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    *
    * @default ["point", "polyline", "polygon", "rectangle", "circle"]
    */
  var availableCreateTools: js.UndefOr[js.Array[String]] = js.native
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed. By default, the user will be able to continuously create graphics with same geometry types.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * continuous | This is the default. Users can continue creating graphics with same geometry types.
    * single | User can create a single graphic with the specified geometry type. User must choose an operation once the graphic is created.
    * update | The graphic will be selected for an [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) operation once the `create` operation is completed.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    *
    * @default continuous
    */
  var creationMode: js.UndefOr[single | continuous | update] = js.native
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchDefaultCreateOptions] = js.native
  /**
    * Default update options set for the Sketch widget. Update options set on this property will be overwritten if the update options are changed when [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchDefaultUpdateOptions] = js.native
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget. The Sketch widget adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.native
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[vertical | horizontal] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the Sketch widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for the Sketch widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) class to access all properties and methods on the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: js.UndefOr[SketchViewModelProperties] = js.native
}

object SketchProperties {
  @scala.inline
  def apply(): SketchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchProperties]
  }
  @scala.inline
  implicit class SketchPropertiesOps[Self <: SketchProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableCreateTools(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableCreateTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableCreateTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableCreateTools")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationMode(value: single | continuous | update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCreateOptions(value: SketchDefaultCreateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCreateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCreateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCreateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUpdateOptions(value: SketchDefaultUpdateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpdateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUpdateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpdateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: GraphicsLayerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: SketchViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

