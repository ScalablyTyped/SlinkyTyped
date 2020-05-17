package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMContainer extends js.Object {
  /**
    * The `id` or node representing the DOM element containing the view. This is typically set in the view's constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  var container: HTMLDivElement = js.native
  /**
    * Indicates if the browser focus is on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
    */
  val focused: Boolean = js.native
  /**
    * The height of the view in pixels read from the view container element.  The view container needs to have a height greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
    *
    * @default 0
    */
  val height: Double = js.native
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).  The view has a default instance of [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) with predefined styles and a template for defining content. The content in this default instance may be modified directly in the [popup's content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) or in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  You may create a new [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) instance and set it to this property to customize the style, positioning, and content of the popup in favor of using the default popup instance on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  var popup: Popup = js.native
  /**
    * Indicates if the view is being resized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
    *
    * @default false
    */
  val resizing: Boolean = js.native
  /**
    * An array containing the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
    */
  val size: js.Array[Double] = js.native
  /**
    * Indicates if the view is visible on the page. Is `true` if the view has no [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container), a [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width) equal to 0, or the CSS `visibility` is `hidden`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
    *
    * @default true
    */
  val suspended: Boolean = js.native
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off. See [DefaultUI](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  var ui: DefaultUI = js.native
  /**
    * The width of the view in pixels read from the view container element.  The view container needs to have a width greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
    *
    * @default 0
    */
  val width: Double = js.native
}

object DOMContainer {
  @scala.inline
  def apply(
    container: HTMLDivElement,
    focused: Boolean,
    height: Double,
    popup: Popup,
    resizing: Boolean,
    size: js.Array[Double],
    suspended: Boolean,
    ui: DefaultUI,
    width: Double
  ): DOMContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMContainer]
  }
  @scala.inline
  implicit class DOMContainerOps[Self <: DOMContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: Popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi(value: DefaultUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

