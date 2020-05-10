package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandProperties extends WidgetProperties {
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
    *
    * @default false
    */
  var autoCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
    */
  var collapseIconClass: js.UndefOr[String] = js.native
  /**
    * Tooltip to display to indicate Expand widget can be collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
    *
    * @default "Collapse" (English locale)
    */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
    * The content to display within the expanded Expand widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
    */
  var content: js.UndefOr[Node | String | WidgetProperties] = js.native
  /**
    * Icon font used to style the Expand button. Will automatically use the [content's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content) iconClass if it has one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
    */
  var expandIconClass: js.UndefOr[String] = js.native
  /**
    * Tooltip to display to indicate Expand widget can be expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
    *
    * @default "Expand" (English locale)
    */
  var expandTooltip: js.UndefOr[String] = js.native
  /**
    * Indicates whether the widget is currently expanded or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
    *
    * @default false
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded. For auto collapsing to take effect, all instances of the group must be included in the [view.ui](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ui).  For example, if you place multiple Expand instances in the top-left of the view's ui, you can assign them to a group called `top-left`. If one Expand instance is expanded and the user clicks on a different instance in the `top-left` group, then the first instance is collapsed, allowing the content of the second instance to be fully visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
    */
  var group: js.UndefOr[String] = js.native
  /**
    * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.  ![expand widget icon number](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/expand-with-iconnumber.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
    */
  var iconNumber: js.UndefOr[Double] = js.native
  /**
    * The mode in which the widget displays. These modes are listed below.
    *
    * mode | description
    * ---------------|------------
    * auto | This is the default mode. It is responsive to browser size changes and will update based on whether the widget is viewed in a desktop or mobile application.
    * floating | Use this mode if you wish to always display the widget as floating regardless of browser size.
    * drawer | Use this mode if you wish to always display the widget in a panel regardless of browser size.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#mode)
    *
    * @default "auto"
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ExpandViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
    */
  var viewModel: js.UndefOr[ExpandViewModelProperties] = js.native
}

object ExpandProperties {
  @scala.inline
  def apply(): ExpandProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandProperties]
  }
  @scala.inline
  implicit class ExpandPropertiesOps[Self <: ExpandProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Node | String | WidgetProperties): Self = {
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
    def withExpandIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
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
    def withViewModel(value: ExpandViewModelProperties): Self = {
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

