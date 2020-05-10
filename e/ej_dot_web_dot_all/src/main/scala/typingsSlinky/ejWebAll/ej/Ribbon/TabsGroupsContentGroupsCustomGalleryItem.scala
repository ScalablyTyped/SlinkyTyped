package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentGroupsCustomGalleryItem extends js.Object {
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the type as ej.Ribbon.CustomItemType.Menu or ej.Ribbon.CustomItemType.Button to render Syncfusion button and menu.
    * @Default {ej.Ribbon.CustomItemType.Button}
    */
  var customItemType: js.UndefOr[CustomItemType | String] = js.native
  /** Specifies the custom tooltip for gallery extra item's button. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  /** Specifies the UL list id to render menu as gallery extra item.
    * @Default {null}
    */
  var menuId: js.UndefOr[String] = js.native
  /** Specifies the Syncfusion menu members, events by using menuSettings.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the text for gallery extra item's button.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the tooltip for gallery extra item's button.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}

object TabsGroupsContentGroupsCustomGalleryItem {
  @scala.inline
  def apply(): TabsGroupsContentGroupsCustomGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomGalleryItem]
  }
  @scala.inline
  implicit class TabsGroupsContentGroupsCustomGalleryItemOps[Self <: TabsGroupsContentGroupsCustomGalleryItem] (val x: Self) extends AnyVal {
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
    def withCustomItemType(value: CustomItemType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItemType")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomToolTip(value: js.Any): Self = {
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
    def withMenuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuId")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuSettings")(js.undefined)
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
  }
  
}

