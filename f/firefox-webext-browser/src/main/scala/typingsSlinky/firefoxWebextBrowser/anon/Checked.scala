package typingsSlinky.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.ContextType
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.ItemType
import typingsSlinky.firefoxWebextBrowser.browser.contextMenus.OnClickData
import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checked extends js.Object {
  /**
    * The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio
    * item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a command to issue for the context click. Currently supports internal commands
    * _execute_page_action, _execute_browser_action and _execute_sidebar_action.
    */
  var command: js.UndefOr[String] = js.native
  /** List of contexts this menu item will appear in. Defaults to ['page'] if not specified. */
  var contexts: js.UndefOr[js.Array[ContextType]] = js.native
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This
    * applies to frames as well.) For details on the format of a pattern, see Match Patterns.
    */
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  /** Whether this context menu item is enabled or disabled. Defaults to true. */
  var enabled: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[NumberDictionary[String]] = js.native
  /**
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this
    * extension.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead,
    * they should register a listener for `contextMenus.onClicked`.
    * @param info Information about the item clicked and the context where the click happened.
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.native
  /** The ID of a parent menu item; this makes the item a child of a previously added item. */
  var parentId: js.UndefOr[Double | String] = js.native
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and
    * the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * The text to be displayed in the item; this is _required_ unless `type` is 'separator'. When the context is
    * 'selection', you can use `%s` within the string to show the selected text. For example, if this parameter's
    * value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the
    * selection is "Translate 'cool' to Pig Latin".
    */
  var title: js.UndefOr[String] = js.native
  /** The type of menu item. Defaults to 'normal' if not specified. */
  var `type`: js.UndefOr[ItemType] = js.native
  /**
    * List of view types where the menu item will be shown. Defaults to any view, including those without a
    * viewType.
    */
  var viewTypes: js.UndefOr[js.Array[ViewType]] = js.native
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[Boolean] = js.native
}

object Checked {
  @scala.inline
  def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
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
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
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

