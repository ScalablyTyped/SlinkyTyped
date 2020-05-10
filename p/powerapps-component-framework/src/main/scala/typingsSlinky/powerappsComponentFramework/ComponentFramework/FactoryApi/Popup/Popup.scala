package typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Types.PopupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends js.Object {
  /**
  			 * Indicates whether popup close on an outside mouse click.
  			 * When it's false, the popup will not be closed on an outside mouse click.
  			 */
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
  /**
  			 * Static DOM element to be inserted
  			 */
  var content: HTMLElement = js.native
  /**
  			 * The id to be set to the anchor control if any.
  			 */
  var id: js.UndefOr[String] = js.native
  /**
  			 * The name of the Popup. Used as the reference to open Popups.
  			 */
  var name: String = js.native
  /**
  			 * The name of Popup which should be opened.
  			 * Should be defined ONLY in a Root Popup.
  			 * To open nested Popups, should be provided string like "rootName.nestedName.[allOtherNestedNames]".
  			 * To close Popups, should be provided empty string.
  			 * This prop will be automatically propagated to children.
  			 */
  var popupToOpen: js.UndefOr[String] = js.native
  /**
  			 * The type of Popup, which is described in PopupType enum. Should be only one "root" Popup for each set of Popups.
  			 */
  var `type`: PopupType = js.native
}

object Popup {
  @scala.inline
  def apply(content: HTMLElement, name: String, `type`: PopupType): Popup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup]
  }
  @scala.inline
  implicit class PopupOps[Self <: typingsSlinky.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PopupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnOutsideClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutsideClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.undefined)
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
    def withPopupToOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupToOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupToOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupToOpen")(js.undefined)
        ret
    }
  }
  
}

