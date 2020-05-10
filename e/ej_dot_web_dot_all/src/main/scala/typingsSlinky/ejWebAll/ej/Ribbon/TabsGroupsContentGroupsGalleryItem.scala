package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentGroupsGalleryItem extends js.Object {
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the custom tooltip for gallery content. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  /** Sets text for the gallery content.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Sets tooltip for the gallery content.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}

object TabsGroupsContentGroupsGalleryItem {
  @scala.inline
  def apply(): TabsGroupsContentGroupsGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsGalleryItem]
  }
  @scala.inline
  implicit class TabsGroupsContentGroupsGalleryItemOps[Self <: TabsGroupsContentGroupsGalleryItem] (val x: Self) extends AnyVal {
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

