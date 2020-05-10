package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOpenOptions extends Object {
  /**
    * **Since:** 4.5    When `true`, indicates that only the popup header will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Sets the the [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var content: js.UndefOr[String | HTMLElement | Widget_] = js.native
  /**
    * **Since:** 4.5    This property enables multiple features in a popup to display in a list rather than displaying the first selected feature. Setting this to `true` allows the user to scroll through the list of features returned from the query and choose the selection they want to display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var featureMenuOpen: js.UndefOr[Boolean] = js.native
  /**
    * Sets the popup's [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#features), which populate the title and content of the popup based on each graphic's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.native
  /**
    * When `true`, indicates the popup should fetch the content of this feature and display it. If no [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) exists, a default template is created for the layer if [defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) = `true`. In order for this option to work, there must be a valid `view` and `location` set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var fetchFeatures: js.UndefOr[Boolean] = js.native
  /**
    * Sets the popup's [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location), which is the geometry used to position the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var location: js.UndefOr[Geometry_] = js.native
  /**
    * Sets pending [promises](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#promises) on the popup. The popup will display once the promises resolve. Each promise must resolve to an array of [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var promises: js.UndefOr[js.Array[js.Promise[_]]] = js.native
  /**
    * Sets the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#title) of the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * When `true` indicates the popup should update its [location](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#location) for each paginated feature based on the [selected feature's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#selectedFeature) geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#open)
    *
    * @default false
    */
  var updateLocationEnabled: js.UndefOr[Boolean] = js.native
}

object PopupOpenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PopupOpenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PopupOpenOptions]
  }
  @scala.inline
  implicit class PopupOpenOptionsOps[Self <: PopupOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | HTMLElement | Widget_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureMenuOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMenuOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Geometry_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPromises(value: js.Array[js.Promise[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promises")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromises: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promises")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLocationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLocationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateLocationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLocationEnabled")(js.undefined)
        ret
    }
  }
  
}

