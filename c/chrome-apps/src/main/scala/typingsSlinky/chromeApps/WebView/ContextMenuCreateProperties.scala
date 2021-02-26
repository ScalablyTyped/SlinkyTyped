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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuCreateProperties extends StObject {
  
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
  implicit class ContextMenuCreatePropertiesMutableBuilder[Self <: ContextMenuCreateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setContexts(value: js.Array[_]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: js.Any*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[_]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
    
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: js.Any*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* info */ js.Any => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[_]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
    
    @scala.inline
    def setTargetUrlPatternsVarargs(value: js.Any*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(
      value: ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          Exclude[
            /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsSlinky.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
            normal_ | checkbox_ | radio_ | separator_
          ]
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
