package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentGroup extends js.Object {
  /** Specifies the Syncfusion button members, events by using this buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  /** It is used to set the count of gallery contents in a row.
    * @Default {null}
    */
  var columns: js.UndefOr[Double] = js.native
  /** Specifies the custom items such as div, table, controls as custom controls with the type &quot;ej.Ribbon.Type.Custom&quot; in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  /** Specifies the CSS class property to apply styles to the button, split, dropdown controls in the groups.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies the Syncfusion button and menu as gallery extra items.
    * @Default {Array}
    */
  var customGalleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsCustomGalleryItem]] = js.native
  /** Provides custom tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups. Text and HTML support are also provided for title and content.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[TabsGroupsContentGroupsCustomToolTip] = js.native
  /** Specifies the Syncfusion dropdown list members, events by using this dropdownSettings.
    * @Default {Object}
    */
  var dropdownSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the separator to the control that is in row type group. The separator separates the control from the next control in the group. Set &quot;true&quot; to enable the
    * separator.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  /** Sets the count of gallery contents in a row, when the gallery is in expanded state.
    * @Default {null}
    */
  var expandedColumns: js.UndefOr[Double] = js.native
  /** Defines each gallery content.
    * @Default {Array}
    */
  var galleryItems: js.UndefOr[js.Array[TabsGroupsContentGroupsGalleryItem]] = js.native
  /** Specifies the Id for button, split button, dropdown list, toggle button, gallery, custom controls in the sub groups.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Specifies the size for button, split button controls. Set &quot;true&quot; for big size and &quot;false&quot; for small size.
    * @Default {null}
    */
  var isBig: js.UndefOr[Boolean] = js.native
  /** When isMobileOnly is true,its shows in mobile toolbar.isResponsive should be true for using this property.
    * @Default {false}
    */
  var isMobileOnly: js.UndefOr[Boolean] = js.native
  /** Sets the height of each gallery content.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String | Double] = js.native
  /** Sets the width of each gallery content.
    * @Default {null}
    */
  var itemWidth: js.UndefOr[String | Double] = js.native
  /** To add,show and hide controls in Quick Access toolbar.
    * @Default {ej.Ribbon.QuickAccessMode.None}
    */
  var quickAccessMode: js.UndefOr[QuickAccessMode | String] = js.native
  /** Specifies the Syncfusion split button members, events by using this splitButtonSettings.
    * @Default {Object}
    */
  var splitButtonSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the text for button, split button, toggle button controls in the sub groups.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the Syncfusion toggle button members, events by using toggleButtonSettings.
    * @Default {Object}
    */
  var toggleButtonSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the tooltip for button, split button, dropdown list, toggle button, custom controls in the sub groups.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
  /** Specifies the type as &quot;ej.Ribbon.Type.Button&quot; or &quot;ej.Ribbon.Type.SplitButton&quot; or &quot;ej.Ribbon.Type.DropDownList&quot; or
    * &quot;ej.Ribbon.Type.ToggleButton&quot; or &quot;ej.Ribbon.Type.Custom&quot; or &quot;ej.Ribbon.Type.Gallery&quot; to render button, split, dropdown, toggle button, gallery,
    * custom controls.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[Type | String] = js.native
}

object TabsGroupsContentGroup {
  @scala.inline
  def apply(): TabsGroupsContentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroup]
  }
  @scala.inline
  implicit class TabsGroupsContentGroupOps[Self <: TabsGroupsContentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContentID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentID")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomGalleryItems(value: js.Array[TabsGroupsContentGroupsCustomGalleryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGalleryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomGalleryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGalleryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolTip(value: TabsGroupsContentGroupsCustomToolTip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryItems(value: js.Array[TabsGroupsContentGroupsGalleryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBig")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobileOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobileOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickAccessMode(value: QuickAccessMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickAccessMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickAccessMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickAccessMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitButtonSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitButtonSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButtonSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleButtonSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleButtonSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleButtonSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

