package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.anon.CHECKBOX
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.NORMAL
import typingsSlinky.chromeApps.chromeAppsStrings.RADIO
import typingsSlinky.chromeApps.chromeAppsStrings.SEPARATOR
import typingsSlinky.chromeApps.chromeAppsStrings.checkbox_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.radio_
import typingsSlinky.chromeApps.chromeAppsStrings.separator_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuCreateProperties extends js.Object {
  /**
    * The initial state of a checkbox or radio item:
    * true for selected and false for unselected.
    * Only one radio item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * List of contexts this menu item will appear in.
    * Defaults to ['page'] if not specified.
    */
  var contexts: js.UndefOr[js.Array[_]] = js.native
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see <a href='match_patterns'>Match Patterns</a>.
    */
  var documentUrlPatterns: js.UndefOr[js.Array[_]] = js.native
  /**
    * Whether this context menu item is enabled or disabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A function that will be called back when the menu item is clicked.
    */
  var onclick: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.native
  /**
    * The ID of a parent menu item; this makes the item a child of a previously added item.
    */
  var parentId: js.UndefOr[integer | String] = js.native
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[_]] = js.native
  /**
    * The text to be displayed in the item; this is -required- unless type is 'separator'.
    * When the context is 'selection', you can use %s within the string to show the selected text.
    * For example, if this parameter's value is 'Translate '%s' to Pig Latin' and the user selects
    * the word 'cool', the context menu item for the selection is 'Translate 'cool' to Pig Latin'.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of menu item. Defaults to 'normal' if not specified.
    */
  var `type`: js.UndefOr[
    ToStringLiteral[
      CHECKBOX, 
      /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
      Exclude[
        /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
        normal_ | checkbox_ | radio_ | separator_
      ]
    ]
  ] = js.native
}

object ContextMenuCreateProperties {
  @scala.inline
  def apply(): ContextMenuCreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuCreateProperties]
  }
  @scala.inline
  implicit class ContextMenuCreatePropertiesOps[Self <: ContextMenuCreateProperties] (val x: Self) extends AnyVal {
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
    def withContexts(value: js.Array[_]): Self = {
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
    def withDocumentUrlPatterns(value: js.Array[_]): Self = {
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
    def withOnclick(value: /* info */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: integer | String): Self = {
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
    def withTargetUrlPatterns(value: js.Array[_]): Self = {
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
    def withType(
      value: ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          Exclude[
            /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
            normal_ | checkbox_ | radio_ | separator_
          ]
        ]
    ): Self = {
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

