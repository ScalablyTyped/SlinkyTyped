package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibleElementsMenuItems extends Object {
  /**
    * Indicates whether to display the `Clear selection` menu item. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var clearSelection: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display the `Refresh data` menu item. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var refreshData: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to enable toggling column visibility within the menu. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#VisibleElements)
    */
  var toggleColumns: js.UndefOr[js.Any] = js.native
}

object VisibleElementsMenuItems {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElementsMenuItems = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElementsMenuItems]
  }
  @scala.inline
  implicit class VisibleElementsMenuItemsOps[Self <: VisibleElementsMenuItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshData")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleColumns")(js.undefined)
        ret
    }
  }
  
}

