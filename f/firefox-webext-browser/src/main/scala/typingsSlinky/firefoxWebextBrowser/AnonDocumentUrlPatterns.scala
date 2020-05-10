package typingsSlinky.firefoxWebextBrowser

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import typingsSlinky.firefoxWebextBrowser.browser.menus.ContextType
import typingsSlinky.firefoxWebextBrowser.browser.menus.ItemType
import typingsSlinky.firefoxWebextBrowser.browser.menus.OnClickData
import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocumentUrlPatterns extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var contexts: js.UndefOr[js.Array[ContextType]] = js.native
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[NumberDictionary[String]] = js.native
  /**
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.native
  /** Note: You cannot change an item to be a child of one of its own descendants. */
  var parentId: js.UndefOr[Double | String] = js.native
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[ItemType] = js.native
  var viewTypes: js.UndefOr[js.Array[ViewType]] = js.native
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[Boolean] = js.native
}

object AnonDocumentUrlPatterns {
  @scala.inline
  def apply(): AnonDocumentUrlPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDocumentUrlPatterns]
  }
  @scala.inline
  implicit class AnonDocumentUrlPatternsOps[Self <: AnonDocumentUrlPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withContexts(value: js.Array[ContextType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentUrlPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentUrlPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrlPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: (/* info */ OnClickData, /* tab */ Tab) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUrlPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUrlPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrlPatterns")(js.undefined)
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
    def withType(value: ItemType): Self = {
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
    @scala.inline
    def withViewTypes(value: js.Array[ViewType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

