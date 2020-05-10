package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationTabBackstageSettingsPage extends js.Object {
  /** Specifies the id of HTML elements like div,ul, etc., as ribbon backstage page's tab content.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  /** Specifies the separator between backstage page's tab and button elements.
    * @Default {false}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies the id for ribbon backstage page's tab and button elements.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  /** Specifies the type for ribbon backstage page's contents. Set &quot;ej.Ribbon.BackStageItemType.Tab&quot; to render the tab or &quot;ej.Ribbon.BackStageItemType.Button&quot; to
    * render the button.
    * @Default {ej.Ribbon.ItemType.Tab}
    */
  var itemType: js.UndefOr[ItemType | String] = js.native
  /** Specifies the text for ribbon backstage page's tab header and button elements.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}

object ApplicationTabBackstageSettingsPage {
  @scala.inline
  def apply(): ApplicationTabBackstageSettingsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTabBackstageSettingsPage]
  }
  @scala.inline
  implicit class ApplicationTabBackstageSettingsPageOps[Self <: ApplicationTabBackstageSettingsPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withItemType(value: ItemType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
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
  }
  
}

