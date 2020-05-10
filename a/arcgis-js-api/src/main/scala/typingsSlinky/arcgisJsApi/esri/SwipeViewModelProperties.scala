package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeViewModelProperties extends js.Object {
  /**
    * The direction the Swipe widget moves across the view. If `"horizontal"`, the widget will move left and right and if `"vertical"`, the widget will move up and down.
    *
    * | horizontal | vertical |
    * |------------|----------|
    * |[![widgets-swipe-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-horizontal.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html) |[![widgets-swipe-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-vertical.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html)|
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#direction)
    *
    * @default "horizontal"
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * The position of the Swipe widget. This determines what percentage of the view will be taken up by the [leadingLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    *
    * @default 25
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object SwipeViewModelProperties {
  @scala.inline
  def apply(): SwipeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewModelProperties]
  }
  @scala.inline
  implicit class SwipeViewModelPropertiesOps[Self <: SwipeViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingLayers(value: CollectionProperties[LayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingLayers(value: CollectionProperties[LayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties): Self = {
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
  }
  
}

