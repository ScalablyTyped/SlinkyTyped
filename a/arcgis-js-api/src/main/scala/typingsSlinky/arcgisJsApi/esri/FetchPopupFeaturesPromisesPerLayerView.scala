package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPopupFeaturesPromisesPerLayerView extends Object {
  /**
    * The associated [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) in which the features are fetched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var layerView: LayerView = js.native
  /**
    * A promise containing an array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) for the selected location associated with a specific [layerview](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchPopupFeaturesPromisesPerLayerView)
    */
  var promise: js.Promise[js.Array[Graphic]] = js.native
}

object FetchPopupFeaturesPromisesPerLayerView {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layerView: LayerView,
    promise: js.Promise[js.Array[Graphic]],
    propertyIsEnumerable: PropertyKey => Boolean
  ): FetchPopupFeaturesPromisesPerLayerView = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerView = layerView.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FetchPopupFeaturesPromisesPerLayerView]
  }
  @scala.inline
  implicit class FetchPopupFeaturesPromisesPerLayerViewOps[Self <: FetchPopupFeaturesPromisesPerLayerView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerView(value: LayerView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[js.Array[Graphic]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

