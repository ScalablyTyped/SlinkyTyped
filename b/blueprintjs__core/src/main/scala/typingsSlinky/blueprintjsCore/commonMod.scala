package typingsSlinky.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.blueprintjsCore.anon.Key
import typingsSlinky.blueprintjsCore.blueprintjsCoreNumbers.`0`
import typingsSlinky.blueprintjsCore.blueprintjsCoreNumbers.`1`
import typingsSlinky.blueprintjsCore.blueprintjsCoreNumbers.`2`
import typingsSlinky.blueprintjsCore.blueprintjsCoreNumbers.`3`
import typingsSlinky.blueprintjsCore.blueprintjsCoreNumbers.`4`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.center
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.danger
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.end
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.primary
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.start
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.success
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.warning
import typingsSlinky.blueprintjsCore.compareUtilsMod.IKeyAllowlist
import typingsSlinky.blueprintjsCore.compareUtilsMod.IKeyDenylist
import typingsSlinky.blueprintjsCore.domUtilsMod.IThrottledReactEventOptions
import typingsSlinky.blueprintjsCore.elevationMod.Elevation
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.positionMod.Position
import typingsSlinky.blueprintjsCore.reactUtilsMod.INamed
import typingsSlinky.blueprintjsCore.refsMod.IRef
import typingsSlinky.blueprintjsCore.refsMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common", "AbstractComponent")
  @js.native
  abstract class AbstractComponent[P, S] protected ()
    extends typingsSlinky.blueprintjsCore.abstractComponentMod.AbstractComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/core/lib/esm/common", "AbstractComponent2")
  @js.native
  abstract class AbstractComponent2[P, S, SS] protected ()
    extends typingsSlinky.blueprintjsCore.abstractComponent2Mod.AbstractComponent2[P, S, SS] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/core/lib/esm/common", "AbstractPureComponent")
  @js.native
  abstract class AbstractPureComponent[P, S] protected ()
    extends typingsSlinky.blueprintjsCore.abstractPureComponentMod.AbstractPureComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("@blueprintjs/core/lib/esm/common", "AbstractPureComponent2")
  @js.native
  abstract class AbstractPureComponent2[P, S, SS] protected ()
    extends typingsSlinky.blueprintjsCore.abstractPureComponent2Mod.AbstractPureComponent2[P, S, SS] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
  }
  
  object Alignment {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Alignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Alignment.CENTER")
    @js.native
    def CENTER: center = js.native
    @scala.inline
    def CENTER_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Alignment.LEFT")
    @js.native
    def LEFT: left = js.native
    @scala.inline
    def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Alignment.RIGHT")
    @js.native
    def RIGHT: right = js.native
    @scala.inline
    def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
  
  object Boundary {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Boundary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Boundary.END")
    @js.native
    def END: end = js.native
    @scala.inline
    def END_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Boundary.START")
    @js.native
    def START: start = js.native
    @scala.inline
    def START_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  }
  
  object Classes {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ACTIVE")
    @js.native
    val ACTIVE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALERT")
    @js.native
    val ALERT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALERT_BODY")
    @js.native
    val ALERT_BODY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALERT_CONTENTS")
    @js.native
    val ALERT_CONTENTS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALERT_FOOTER")
    @js.native
    val ALERT_FOOTER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALIGN_LEFT")
    @js.native
    val ALIGN_LEFT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ALIGN_RIGHT")
    @js.native
    val ALIGN_RIGHT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BLOCKQUOTE")
    @js.native
    val BLOCKQUOTE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BREADCRUMB")
    @js.native
    val BREADCRUMB: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BREADCRUMBS")
    @js.native
    val BREADCRUMBS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BREADCRUMBS_COLLAPSED")
    @js.native
    val BREADCRUMBS_COLLAPSED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BREADCRUMB_CURRENT")
    @js.native
    val BREADCRUMB_CURRENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BUTTON")
    @js.native
    val BUTTON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BUTTON_GROUP")
    @js.native
    val BUTTON_GROUP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BUTTON_SPINNER")
    @js.native
    val BUTTON_SPINNER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.BUTTON_TEXT")
    @js.native
    val BUTTON_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CALLOUT")
    @js.native
    val CALLOUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CALLOUT_ICON")
    @js.native
    val CALLOUT_ICON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CARD")
    @js.native
    val CARD: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CHECKBOX")
    @js.native
    val CHECKBOX: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CODE")
    @js.native
    val CODE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CODE_BLOCK")
    @js.native
    val CODE_BLOCK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.COLLAPSE")
    @js.native
    val COLLAPSE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.COLLAPSE_BODY")
    @js.native
    val COLLAPSE_BODY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.COLLAPSIBLE_LIST")
    @js.native
    val COLLAPSIBLE_LIST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTEXT_MENU")
    @js.native
    val CONTEXT_MENU: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTEXT_MENU_POPOVER_TARGET")
    @js.native
    val CONTEXT_MENU_POPOVER_TARGET: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTROL")
    @js.native
    val CONTROL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTROL_GROUP")
    @js.native
    val CONTROL_GROUP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTROL_INDICATOR")
    @js.native
    val CONTROL_INDICATOR: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.CONTROL_INDICATOR_CHILD")
    @js.native
    val CONTROL_INDICATOR_CHILD: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DARK")
    @js.native
    val DARK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG")
    @js.native
    val DIALOG: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_BODY")
    @js.native
    val DIALOG_BODY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_CLOSE_BUTTON")
    @js.native
    val DIALOG_CLOSE_BUTTON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_CONTAINER")
    @js.native
    val DIALOG_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_FOOTER")
    @js.native
    val DIALOG_FOOTER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_FOOTER_ACTIONS")
    @js.native
    val DIALOG_FOOTER_ACTIONS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIALOG_HEADER")
    @js.native
    val DIALOG_HEADER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DISABLED")
    @js.native
    val DISABLED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DIVIDER")
    @js.native
    val DIVIDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DRAWER")
    @js.native
    val DRAWER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DRAWER_BODY")
    @js.native
    val DRAWER_BODY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DRAWER_FOOTER")
    @js.native
    val DRAWER_FOOTER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.DRAWER_HEADER")
    @js.native
    val DRAWER_HEADER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.EDITABLE_TEXT")
    @js.native
    val EDITABLE_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.EDITABLE_TEXT_CONTENT")
    @js.native
    val EDITABLE_TEXT_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.EDITABLE_TEXT_EDITING")
    @js.native
    val EDITABLE_TEXT_EDITING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.EDITABLE_TEXT_INPUT")
    @js.native
    val EDITABLE_TEXT_INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.EDITABLE_TEXT_PLACEHOLDER")
    @js.native
    val EDITABLE_TEXT_PLACEHOLDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ELEVATION_0")
    @js.native
    val ELEVATION_0: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ELEVATION_1")
    @js.native
    val ELEVATION_1: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ELEVATION_2")
    @js.native
    val ELEVATION_2: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ELEVATION_3")
    @js.native
    val ELEVATION_3: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ELEVATION_4")
    @js.native
    val ELEVATION_4: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.END")
    @js.native
    val END: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FILE_INPUT")
    @js.native
    val FILE_INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FILE_INPUT_HAS_SELECTION")
    @js.native
    val FILE_INPUT_HAS_SELECTION: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FILE_UPLOAD_INPUT")
    @js.native
    val FILE_UPLOAD_INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FILE_UPLOAD_INPUT_CUSTOM_TEXT")
    @js.native
    val FILE_UPLOAD_INPUT_CUSTOM_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FILL")
    @js.native
    val FILL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FIXED")
    @js.native
    val FIXED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FIXED_TOP")
    @js.native
    val FIXED_TOP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FLEX_EXPANDER")
    @js.native
    val FLEX_EXPANDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FOCUS_DISABLED")
    @js.native
    val FOCUS_DISABLED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FORM_CONTENT")
    @js.native
    val FORM_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FORM_GROUP")
    @js.native
    val FORM_GROUP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.FORM_HELPER_TEXT")
    @js.native
    val FORM_HELPER_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HEADING")
    @js.native
    val HEADING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HOTKEY")
    @js.native
    val HOTKEY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HOTKEY_COLUMN")
    @js.native
    val HOTKEY_COLUMN: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HOTKEY_DIALOG")
    @js.native
    val HOTKEY_DIALOG: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HOTKEY_LABEL")
    @js.native
    val HOTKEY_LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HTML_SELECT")
    @js.native
    val HTML_SELECT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HTML_TABLE")
    @js.native
    val HTML_TABLE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HTML_TABLE_BORDERED")
    @js.native
    val HTML_TABLE_BORDERED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HTML_TABLE_CONDENSED")
    @js.native
    val HTML_TABLE_CONDENSED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.HTML_TABLE_STRIPED")
    @js.native
    val HTML_TABLE_STRIPED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ICON")
    @js.native
    val ICON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ICON_LARGE")
    @js.native
    val ICON_LARGE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ICON_STANDARD")
    @js.native
    val ICON_STANDARD: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INLINE")
    @js.native
    val INLINE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INPUT")
    @js.native
    val INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INPUT_ACTION")
    @js.native
    val INPUT_ACTION: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INPUT_GHOST")
    @js.native
    val INPUT_GHOST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INPUT_GROUP")
    @js.native
    val INPUT_GROUP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INPUT_LEFT_CONTAINER")
    @js.native
    val INPUT_LEFT_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INTENT_DANGER")
    @js.native
    val INTENT_DANGER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INTENT_PRIMARY")
    @js.native
    val INTENT_PRIMARY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INTENT_SUCCESS")
    @js.native
    val INTENT_SUCCESS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INTENT_WARNING")
    @js.native
    val INTENT_WARNING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.INTERACTIVE")
    @js.native
    val INTERACTIVE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.KEY")
    @js.native
    val KEY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.KEY_COMBO")
    @js.native
    val KEY_COMBO: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.LABEL")
    @js.native
    val LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.LARGE")
    @js.native
    val LARGE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.LIST")
    @js.native
    val LIST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.LIST_UNSTYLED")
    @js.native
    val LIST_UNSTYLED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.LOADING")
    @js.native
    val LOADING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU")
    @js.native
    val MENU: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU_DIVIDER")
    @js.native
    val MENU_DIVIDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU_HEADER")
    @js.native
    val MENU_HEADER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU_ITEM")
    @js.native
    val MENU_ITEM: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU_ITEM_LABEL")
    @js.native
    val MENU_ITEM_LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MENU_SUBMENU")
    @js.native
    val MENU_SUBMENU: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MINIMAL")
    @js.native
    val MINIMAL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MODIFIER_KEY")
    @js.native
    val MODIFIER_KEY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MONOSPACE_TEXT")
    @js.native
    val MONOSPACE_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.MULTILINE")
    @js.native
    val MULTILINE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NAVBAR")
    @js.native
    val NAVBAR: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NAVBAR_DIVIDER")
    @js.native
    val NAVBAR_DIVIDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NAVBAR_GROUP")
    @js.native
    val NAVBAR_GROUP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NAVBAR_HEADING")
    @js.native
    val NAVBAR_HEADING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NON_IDEAL_STATE")
    @js.native
    val NON_IDEAL_STATE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NON_IDEAL_STATE_VISUAL")
    @js.native
    val NON_IDEAL_STATE_VISUAL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.NUMERIC_INPUT")
    @js.native
    val NUMERIC_INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OUTLINED")
    @js.native
    val OUTLINED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERFLOW_LIST")
    @js.native
    val OVERFLOW_LIST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERFLOW_LIST_SPACER")
    @js.native
    val OVERFLOW_LIST_SPACER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY")
    @js.native
    val OVERLAY: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_BACKDROP")
    @js.native
    val OVERLAY_BACKDROP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_CONTAINER")
    @js.native
    val OVERLAY_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_CONTENT")
    @js.native
    val OVERLAY_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_INLINE")
    @js.native
    val OVERLAY_INLINE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_OPEN")
    @js.native
    val OVERLAY_OPEN: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.OVERLAY_SCROLL_CONTAINER")
    @js.native
    val OVERLAY_SCROLL_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PANEL_STACK")
    @js.native
    val PANEL_STACK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PANEL_STACK_HEADER")
    @js.native
    val PANEL_STACK_HEADER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PANEL_STACK_HEADER_BACK")
    @js.native
    val PANEL_STACK_HEADER_BACK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PANEL_STACK_VIEW")
    @js.native
    val PANEL_STACK_VIEW: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER")
    @js.native
    val POPOVER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_ARROW")
    @js.native
    val POPOVER_ARROW: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_BACKDROP")
    @js.native
    val POPOVER_BACKDROP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_CAPTURING_DISMISS")
    @js.native
    val POPOVER_CAPTURING_DISMISS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_CONTENT")
    @js.native
    val POPOVER_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_CONTENT_SIZING")
    @js.native
    val POPOVER_CONTENT_SIZING: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_DISMISS")
    @js.native
    val POPOVER_DISMISS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_DISMISS_OVERRIDE")
    @js.native
    val POPOVER_DISMISS_OVERRIDE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_OPEN")
    @js.native
    val POPOVER_OPEN: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_TARGET")
    @js.native
    val POPOVER_TARGET: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POPOVER_WRAPPER")
    @js.native
    val POPOVER_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PORTAL")
    @js.native
    val PORTAL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POSITION_BOTTOM")
    @js.native
    val POSITION_BOTTOM: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POSITION_LEFT")
    @js.native
    val POSITION_LEFT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POSITION_RIGHT")
    @js.native
    val POSITION_RIGHT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.POSITION_TOP")
    @js.native
    val POSITION_TOP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PROGRESS_BAR")
    @js.native
    val PROGRESS_BAR: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PROGRESS_METER")
    @js.native
    val PROGRESS_METER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PROGRESS_NO_ANIMATION")
    @js.native
    val PROGRESS_NO_ANIMATION: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.PROGRESS_NO_STRIPES")
    @js.native
    val PROGRESS_NO_STRIPES: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.RADIO")
    @js.native
    val RADIO: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.ROUND")
    @js.native
    val ROUND: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.RTL")
    @js.native
    val RTL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.RUNNING_TEXT")
    @js.native
    val RUNNING_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SELECT")
    @js.native
    val SELECT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SKELETON")
    @js.native
    val SKELETON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER")
    @js.native
    val SLIDER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER_AXIS")
    @js.native
    val SLIDER_AXIS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER_HANDLE")
    @js.native
    val SLIDER_HANDLE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER_LABEL")
    @js.native
    val SLIDER_LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER_PROGRESS")
    @js.native
    val SLIDER_PROGRESS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SLIDER_TRACK")
    @js.native
    val SLIDER_TRACK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SMALL")
    @js.native
    val SMALL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SPINNER")
    @js.native
    val SPINNER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SPINNER_ANIMATION")
    @js.native
    val SPINNER_ANIMATION: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SPINNER_HEAD")
    @js.native
    val SPINNER_HEAD: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SPINNER_NO_SPIN")
    @js.native
    val SPINNER_NO_SPIN: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SPINNER_TRACK")
    @js.native
    val SPINNER_TRACK: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.START")
    @js.native
    val START: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SWITCH")
    @js.native
    val SWITCH: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.SWITCH_INNER_TEXT")
    @js.native
    val SWITCH_INNER_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAB")
    @js.native
    val TAB: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TABS")
    @js.native
    val TABS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAB_INDICATOR")
    @js.native
    val TAB_INDICATOR: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAB_INDICATOR_WRAPPER")
    @js.native
    val TAB_INDICATOR_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAB_LIST")
    @js.native
    val TAB_LIST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAB_PANEL")
    @js.native
    val TAB_PANEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAG")
    @js.native
    val TAG: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAG_INPUT")
    @js.native
    val TAG_INPUT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAG_INPUT_ICON")
    @js.native
    val TAG_INPUT_ICON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAG_INPUT_VALUES")
    @js.native
    val TAG_INPUT_VALUES: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TAG_REMOVE")
    @js.native
    val TAG_REMOVE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TEXT_DISABLED")
    @js.native
    val TEXT_DISABLED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TEXT_LARGE")
    @js.native
    val TEXT_LARGE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TEXT_MUTED")
    @js.native
    val TEXT_MUTED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TEXT_OVERFLOW_ELLIPSIS")
    @js.native
    val TEXT_OVERFLOW_ELLIPSIS: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TEXT_SMALL")
    @js.native
    val TEXT_SMALL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TOAST")
    @js.native
    val TOAST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TOAST_CONTAINER")
    @js.native
    val TOAST_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TOAST_MESSAGE")
    @js.native
    val TOAST_MESSAGE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TOOLTIP")
    @js.native
    val TOOLTIP: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TOOLTIP_INDICATOR")
    @js.native
    val TOOLTIP_INDICATOR: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TRANSITION_CONTAINER")
    @js.native
    val TRANSITION_CONTAINER: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE")
    @js.native
    val TREE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE")
    @js.native
    val TREE_NODE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_CARET")
    @js.native
    val TREE_NODE_CARET: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_CARET_CLOSED")
    @js.native
    val TREE_NODE_CARET_CLOSED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_CARET_NONE")
    @js.native
    val TREE_NODE_CARET_NONE: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_CARET_OPEN")
    @js.native
    val TREE_NODE_CARET_OPEN: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_CONTENT")
    @js.native
    val TREE_NODE_CONTENT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_EXPANDED")
    @js.native
    val TREE_NODE_EXPANDED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_ICON")
    @js.native
    val TREE_NODE_ICON: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_LABEL")
    @js.native
    val TREE_NODE_LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_LIST")
    @js.native
    val TREE_NODE_LIST: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_SECONDARY_LABEL")
    @js.native
    val TREE_NODE_SECONDARY_LABEL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_NODE_SELECTED")
    @js.native
    val TREE_NODE_SELECTED: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.TREE_ROOT")
    @js.native
    val TREE_ROOT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.UI_TEXT")
    @js.native
    val UI_TEXT: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.VERTICAL")
    @js.native
    val VERTICAL: String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.alignmentClass")
    @js.native
    def alignmentClass(): js.UndefOr[String] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.alignmentClass")
    @js.native
    def alignmentClass(alignment: Alignment): js.UndefOr[String] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.elevationClass")
    @js.native
    def elevationClass(): js.UndefOr[String] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.elevationClass")
    @js.native
    def elevationClass(elevation: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.elevationClass")
    @js.native
    def elevationClass(elevation: Elevation): String = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.elevationClass")
    @js.native
    def elevationClass_Union(elevation: Elevation): js.UndefOr[String] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.getClassNamespace")
    @js.native
    def getClassNamespace(): String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.iconClass")
    @js.native
    def iconClass(): js.UndefOr[String] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.iconClass")
    @js.native
    def iconClass(iconName: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.iconClass")
    @js.native
    def iconClass(iconName: String): String = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.iconClass")
    @js.native
    def iconClass_Union(iconName: String): js.UndefOr[String] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.intentClass")
    @js.native
    def intentClass(): js.UndefOr[scala.Nothing] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.intentClass")
    @js.native
    def intentClass(intent: Intent): String = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.intentClass")
    @js.native
    def intentClass_Union(intent: Intent): js.UndefOr[Intent] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.intentClass")
    @js.native
    def intentClass_none(intent: none): js.UndefOr[scala.Nothing] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.positionClass")
    @js.native
    def positionClass(): js.UndefOr[String] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.positionClass")
    @js.native
    def positionClass(position: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.positionClass")
    @js.native
    def positionClass(position: Position): String = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Classes.positionClass")
    @js.native
    def positionClass_Union(position: Position): js.UndefOr[String] = js.native
  }
  
  object Colors {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLACK")
    @js.native
    def BLACK: String = js.native
    @scala.inline
    def BLACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLUE1")
    @js.native
    def BLUE1: String = js.native
    @scala.inline
    def BLUE1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLUE2")
    @js.native
    def BLUE2: String = js.native
    @scala.inline
    def BLUE2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLUE3")
    @js.native
    def BLUE3: String = js.native
    @scala.inline
    def BLUE3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLUE4")
    @js.native
    def BLUE4: String = js.native
    @scala.inline
    def BLUE4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.BLUE5")
    @js.native
    def BLUE5: String = js.native
    @scala.inline
    def BLUE5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.COBALT1")
    @js.native
    def COBALT1: String = js.native
    @scala.inline
    def COBALT1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COBALT1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.COBALT2")
    @js.native
    def COBALT2: String = js.native
    @scala.inline
    def COBALT2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COBALT2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.COBALT3")
    @js.native
    def COBALT3: String = js.native
    @scala.inline
    def COBALT3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COBALT3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.COBALT4")
    @js.native
    def COBALT4: String = js.native
    @scala.inline
    def COBALT4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COBALT4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.COBALT5")
    @js.native
    def COBALT5: String = js.native
    @scala.inline
    def COBALT5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COBALT5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.DARK_GRAY1")
    @js.native
    def DARK_GRAY1: String = js.native
    @scala.inline
    def DARK_GRAY1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK_GRAY1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.DARK_GRAY2")
    @js.native
    def DARK_GRAY2: String = js.native
    @scala.inline
    def DARK_GRAY2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK_GRAY2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.DARK_GRAY3")
    @js.native
    def DARK_GRAY3: String = js.native
    @scala.inline
    def DARK_GRAY3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK_GRAY3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.DARK_GRAY4")
    @js.native
    def DARK_GRAY4: String = js.native
    @scala.inline
    def DARK_GRAY4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK_GRAY4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.DARK_GRAY5")
    @js.native
    def DARK_GRAY5: String = js.native
    @scala.inline
    def DARK_GRAY5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK_GRAY5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.FOREST1")
    @js.native
    def FOREST1: String = js.native
    @scala.inline
    def FOREST1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREST1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.FOREST2")
    @js.native
    def FOREST2: String = js.native
    @scala.inline
    def FOREST2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREST2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.FOREST3")
    @js.native
    def FOREST3: String = js.native
    @scala.inline
    def FOREST3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREST3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.FOREST4")
    @js.native
    def FOREST4: String = js.native
    @scala.inline
    def FOREST4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREST4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.FOREST5")
    @js.native
    def FOREST5: String = js.native
    @scala.inline
    def FOREST5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOREST5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GOLD1")
    @js.native
    def GOLD1: String = js.native
    @scala.inline
    def GOLD1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GOLD2")
    @js.native
    def GOLD2: String = js.native
    @scala.inline
    def GOLD2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GOLD3")
    @js.native
    def GOLD3: String = js.native
    @scala.inline
    def GOLD3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GOLD4")
    @js.native
    def GOLD4: String = js.native
    @scala.inline
    def GOLD4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GOLD5")
    @js.native
    def GOLD5: String = js.native
    @scala.inline
    def GOLD5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GRAY1")
    @js.native
    def GRAY1: String = js.native
    @scala.inline
    def GRAY1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GRAY2")
    @js.native
    def GRAY2: String = js.native
    @scala.inline
    def GRAY2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GRAY3")
    @js.native
    def GRAY3: String = js.native
    @scala.inline
    def GRAY3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GRAY4")
    @js.native
    def GRAY4: String = js.native
    @scala.inline
    def GRAY4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GRAY5")
    @js.native
    def GRAY5: String = js.native
    @scala.inline
    def GRAY5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GREEN1")
    @js.native
    def GREEN1: String = js.native
    @scala.inline
    def GREEN1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GREEN2")
    @js.native
    def GREEN2: String = js.native
    @scala.inline
    def GREEN2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GREEN3")
    @js.native
    def GREEN3: String = js.native
    @scala.inline
    def GREEN3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GREEN4")
    @js.native
    def GREEN4: String = js.native
    @scala.inline
    def GREEN4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.GREEN5")
    @js.native
    def GREEN5: String = js.native
    @scala.inline
    def GREEN5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.INDIGO1")
    @js.native
    def INDIGO1: String = js.native
    @scala.inline
    def INDIGO1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.INDIGO2")
    @js.native
    def INDIGO2: String = js.native
    @scala.inline
    def INDIGO2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.INDIGO3")
    @js.native
    def INDIGO3: String = js.native
    @scala.inline
    def INDIGO3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.INDIGO4")
    @js.native
    def INDIGO4: String = js.native
    @scala.inline
    def INDIGO4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.INDIGO5")
    @js.native
    def INDIGO5: String = js.native
    @scala.inline
    def INDIGO5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIGHT_GRAY1")
    @js.native
    def LIGHT_GRAY1: String = js.native
    @scala.inline
    def LIGHT_GRAY1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIGHT_GRAY2")
    @js.native
    def LIGHT_GRAY2: String = js.native
    @scala.inline
    def LIGHT_GRAY2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIGHT_GRAY3")
    @js.native
    def LIGHT_GRAY3: String = js.native
    @scala.inline
    def LIGHT_GRAY3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIGHT_GRAY4")
    @js.native
    def LIGHT_GRAY4: String = js.native
    @scala.inline
    def LIGHT_GRAY4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIGHT_GRAY5")
    @js.native
    def LIGHT_GRAY5: String = js.native
    @scala.inline
    def LIGHT_GRAY5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHT_GRAY5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIME1")
    @js.native
    def LIME1: String = js.native
    @scala.inline
    def LIME1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIME2")
    @js.native
    def LIME2: String = js.native
    @scala.inline
    def LIME2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIME3")
    @js.native
    def LIME3: String = js.native
    @scala.inline
    def LIME3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIME4")
    @js.native
    def LIME4: String = js.native
    @scala.inline
    def LIME4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.LIME5")
    @js.native
    def LIME5: String = js.native
    @scala.inline
    def LIME5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ORANGE1")
    @js.native
    def ORANGE1: String = js.native
    @scala.inline
    def ORANGE1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ORANGE2")
    @js.native
    def ORANGE2: String = js.native
    @scala.inline
    def ORANGE2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ORANGE3")
    @js.native
    def ORANGE3: String = js.native
    @scala.inline
    def ORANGE3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ORANGE4")
    @js.native
    def ORANGE4: String = js.native
    @scala.inline
    def ORANGE4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ORANGE5")
    @js.native
    def ORANGE5: String = js.native
    @scala.inline
    def ORANGE5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.RED1")
    @js.native
    def RED1: String = js.native
    @scala.inline
    def RED1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.RED2")
    @js.native
    def RED2: String = js.native
    @scala.inline
    def RED2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.RED3")
    @js.native
    def RED3: String = js.native
    @scala.inline
    def RED3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.RED4")
    @js.native
    def RED4: String = js.native
    @scala.inline
    def RED4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.RED5")
    @js.native
    def RED5: String = js.native
    @scala.inline
    def RED5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ROSE1")
    @js.native
    def ROSE1: String = js.native
    @scala.inline
    def ROSE1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSE1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ROSE2")
    @js.native
    def ROSE2: String = js.native
    @scala.inline
    def ROSE2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSE2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ROSE3")
    @js.native
    def ROSE3: String = js.native
    @scala.inline
    def ROSE3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSE3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ROSE4")
    @js.native
    def ROSE4: String = js.native
    @scala.inline
    def ROSE4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSE4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.ROSE5")
    @js.native
    def ROSE5: String = js.native
    @scala.inline
    def ROSE5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSE5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.SEPIA1")
    @js.native
    def SEPIA1: String = js.native
    @scala.inline
    def SEPIA1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPIA1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.SEPIA2")
    @js.native
    def SEPIA2: String = js.native
    @scala.inline
    def SEPIA2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPIA2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.SEPIA3")
    @js.native
    def SEPIA3: String = js.native
    @scala.inline
    def SEPIA3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPIA3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.SEPIA4")
    @js.native
    def SEPIA4: String = js.native
    @scala.inline
    def SEPIA4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPIA4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.SEPIA5")
    @js.native
    def SEPIA5: String = js.native
    @scala.inline
    def SEPIA5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPIA5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.TURQUOISE1")
    @js.native
    def TURQUOISE1: String = js.native
    @scala.inline
    def TURQUOISE1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.TURQUOISE2")
    @js.native
    def TURQUOISE2: String = js.native
    @scala.inline
    def TURQUOISE2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.TURQUOISE3")
    @js.native
    def TURQUOISE3: String = js.native
    @scala.inline
    def TURQUOISE3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.TURQUOISE4")
    @js.native
    def TURQUOISE4: String = js.native
    @scala.inline
    def TURQUOISE4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.TURQUOISE5")
    @js.native
    def TURQUOISE5: String = js.native
    @scala.inline
    def TURQUOISE5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VERMILION1")
    @js.native
    def VERMILION1: String = js.native
    @scala.inline
    def VERMILION1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERMILION1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VERMILION2")
    @js.native
    def VERMILION2: String = js.native
    @scala.inline
    def VERMILION2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERMILION2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VERMILION3")
    @js.native
    def VERMILION3: String = js.native
    @scala.inline
    def VERMILION3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERMILION3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VERMILION4")
    @js.native
    def VERMILION4: String = js.native
    @scala.inline
    def VERMILION4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERMILION4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VERMILION5")
    @js.native
    def VERMILION5: String = js.native
    @scala.inline
    def VERMILION5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERMILION5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VIOLET1")
    @js.native
    def VIOLET1: String = js.native
    @scala.inline
    def VIOLET1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET1")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VIOLET2")
    @js.native
    def VIOLET2: String = js.native
    @scala.inline
    def VIOLET2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET2")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VIOLET3")
    @js.native
    def VIOLET3: String = js.native
    @scala.inline
    def VIOLET3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET3")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VIOLET4")
    @js.native
    def VIOLET4: String = js.native
    @scala.inline
    def VIOLET4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET4")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.VIOLET5")
    @js.native
    def VIOLET5: String = js.native
    @scala.inline
    def VIOLET5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET5")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Colors.WHITE")
    @js.native
    def WHITE: String = js.native
    @scala.inline
    def WHITE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/common", "DISPLAYNAME_PREFIX")
  @js.native
  val DISPLAYNAME_PREFIX: /* "Blueprint3" */ String = js.native
  
  object Elevation {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation.FOUR")
    @js.native
    def FOUR: `4` = js.native
    @scala.inline
    def FOUR_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOUR")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation.ONE")
    @js.native
    def ONE: `1` = js.native
    @scala.inline
    def ONE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation.THREE")
    @js.native
    def THREE: `3` = js.native
    @scala.inline
    def THREE_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THREE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation.TWO")
    @js.native
    def TWO: `2` = js.native
    @scala.inline
    def TWO_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Elevation.ZERO")
    @js.native
    def ZERO: `0` = js.native
    @scala.inline
    def ZERO_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  object Intent {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent.DANGER")
    @js.native
    def DANGER: danger = js.native
    @scala.inline
    def DANGER_=(x: danger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DANGER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent.NONE")
    @js.native
    def NONE: none = js.native
    @scala.inline
    def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent.PRIMARY")
    @js.native
    def PRIMARY: primary = js.native
    @scala.inline
    def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent.SUCCESS")
    @js.native
    def SUCCESS: success = js.native
    @scala.inline
    def SUCCESS_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Intent.WARNING")
    @js.native
    def WARNING: warning = js.native
    @scala.inline
    def WARNING_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  object Keys {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ARROW_DOWN")
    @js.native
    val ARROW_DOWN: /* 40 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ARROW_LEFT")
    @js.native
    val ARROW_LEFT: /* 37 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ARROW_RIGHT")
    @js.native
    val ARROW_RIGHT: /* 39 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ARROW_UP")
    @js.native
    val ARROW_UP: /* 38 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.BACKSPACE")
    @js.native
    val BACKSPACE: /* 8 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.DELETE")
    @js.native
    val DELETE: /* 46 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ENTER")
    @js.native
    val ENTER: /* 13 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.ESCAPE")
    @js.native
    val ESCAPE: /* 27 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.SHIFT")
    @js.native
    val SHIFT: /* 16 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.SPACE")
    @js.native
    val SPACE: /* 32 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.TAB")
    @js.native
    val TAB: /* 9 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Keys.isKeyboardClick")
    @js.native
    def isKeyboardClick(keyCode: Double): Boolean = js.native
  }
  
  object Position {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.BOTTOM")
    @js.native
    def BOTTOM: bottom = js.native
    @scala.inline
    def BOTTOM_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.BOTTOM_LEFT")
    @js.native
    def BOTTOM_LEFT: `bottom-left` = js.native
    @scala.inline
    def BOTTOM_LEFT_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.BOTTOM_RIGHT")
    @js.native
    def BOTTOM_RIGHT: `bottom-right` = js.native
    @scala.inline
    def BOTTOM_RIGHT_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.LEFT")
    @js.native
    def LEFT: left = js.native
    @scala.inline
    def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.LEFT_BOTTOM")
    @js.native
    def LEFT_BOTTOM: `left-bottom` = js.native
    @scala.inline
    def LEFT_BOTTOM_=(x: `left-bottom`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.LEFT_TOP")
    @js.native
    def LEFT_TOP: `left-top` = js.native
    @scala.inline
    def LEFT_TOP_=(x: `left-top`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.RIGHT")
    @js.native
    def RIGHT: right = js.native
    @scala.inline
    def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.RIGHT_BOTTOM")
    @js.native
    def RIGHT_BOTTOM: `right-bottom` = js.native
    @scala.inline
    def RIGHT_BOTTOM_=(x: `right-bottom`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.RIGHT_TOP")
    @js.native
    def RIGHT_TOP: `right-top` = js.native
    @scala.inline
    def RIGHT_TOP_=(x: `right-top`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.TOP")
    @js.native
    def TOP: top = js.native
    @scala.inline
    def TOP_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.TOP_LEFT")
    @js.native
    def TOP_LEFT: `top-left` = js.native
    @scala.inline
    def TOP_LEFT_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Position.TOP_RIGHT")
    @js.native
    def TOP_RIGHT: `top-right` = js.native
    @scala.inline
    def TOP_RIGHT_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  object Utils {
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.approxEqual")
    @js.native
    def approxEqual(a: Double, b: Double): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.approxEqual")
    @js.native
    def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arrayLengthCompare")
    @js.native
    def arrayLengthCompare(): Double = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arrayLengthCompare")
    @js.native
    def arrayLengthCompare(a: js.UndefOr[scala.Nothing], b: js.Array[_]): Double = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arrayLengthCompare")
    @js.native
    def arrayLengthCompare(a: js.Array[_]): Double = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arrayLengthCompare")
    @js.native
    def arrayLengthCompare(a: js.Array[_], b: js.Array[_]): Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arraysEqual")
    @js.native
    def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.arraysEqual")
    @js.native
    def arraysEqual(
      arrA: js.Array[_],
      arrB: js.Array[_],
      compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
    ): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.clamp")
    @js.native
    def clamp(`val`: Double, min: Double, max: Double): Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.countDecimalPlaces")
    @js.native
    def countDecimalPlaces(num: Double): Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.createReactRef")
    @js.native
    def createReactRef[T](): ReactRef[T] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.deepCompareKeys")
    @js.native
    def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.deepCompareKeys")
    @js.native
    def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.elementIsOrContains")
    @js.native
    def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.ensureElement")
    @js.native
    def ensureElement(): js.UndefOr[ReactElement] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.ensureElement")
    @js.native
    def ensureElement(
      child: js.UndefOr[ReactElement],
      tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
    ): js.UndefOr[ReactElement] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.ensureElement")
    @js.native
    def ensureElement(child: ReactElement): js.UndefOr[ReactElement] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: js.UndefOr[scala.Nothing], keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDeepUnequalKeyValues")
    @js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](
      objA: js.UndefOr[scala.Nothing],
      objB: js.UndefOr[scala.Nothing],
      keys: js.Array[/* keyof T */ String]
    ): js.Array[Key[T]] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDisplayName")
    @js.native
    def getDisplayName(ComponentClass: ReactComponentClass[js.Object]): String = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getDisplayName")
    @js.native
    def getDisplayName(ComponentClass: INamed): String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getRef")
    @js.native
    def getRef[T](): T | Null = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getRef")
    @js.native
    def getRef[T](ref: T): T | Null = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.getRef")
    @js.native
    def getRef[T](ref: IRefObject[T]): T | Null = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isElementOfType")
    @js.native
    def isElementOfType[P](element: js.Any, ComponentType: ReactComponentClass[P]): /* is react.react.ReactElement */ Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isFunction")
    @js.native
    def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isNodeEnv")
    @js.native
    def isNodeEnv(env: String): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isReactElement")
    @js.native
    def isReactElement[T](child: ReactElement): /* is react.react.ReactElement */ Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isReactNodeEmpty")
    @js.native
    def isReactNodeEmpty(): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isReactNodeEmpty")
    @js.native
    def isReactNodeEmpty(node: js.UndefOr[ReactElement], skipArray: Boolean): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.isReactNodeEmpty")
    @js.native
    def isReactNodeEmpty(node: ReactElement): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[R](): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, R](func: js.UndefOr[scala.Nothing], arg1: A): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, C, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, C, D, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvoke")
    @js.native
    def safeInvoke[A, B, C, D, R](
      func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
      arg1: A,
      arg2: B,
      arg3: C,
      arg4: D
    ): js.UndefOr[R] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: T, key: K): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: js.UndefOr[scala.Nothing], key: K): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: T, key: K, arg1: A): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: T, key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B, c : C): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: T, key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeMember")
    @js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B, c : C): R}
      */ typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[R](): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[R](funcOrValue: R): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, D, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.safeInvokeOrValue")
    @js.native
    def safeInvokeOrValue[A, B, C, D, R](
      funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
      arg1: A,
      arg2: B,
      arg3: C,
      arg4: D
    ): R = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.shallowCompareKeys")
    @js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.shallowCompareKeys")
    @js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.shallowCompareKeys")
    @js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.throttle")
    @js.native
    def throttle[T /* <: js.Function */](method: T): T = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.throttleEvent")
    @js.native
    def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.throttleReactEventCallback")
    @js.native
    def throttleReactEventCallback[E /* <: SyntheticEvent[Event, Element] */](callback: js.Function2[/* event */ E, /* repeated */ js.Any, _]): js.Function1[/* event2 */ E, Unit] = js.native
    @JSImport("@blueprintjs/core/lib/esm/common", "Utils.throttleReactEventCallback")
    @js.native
    def throttleReactEventCallback[E /* <: SyntheticEvent[Event, Element] */](
      callback: js.Function2[/* event */ E, /* repeated */ js.Any, _],
      options: IThrottledReactEventOptions
    ): js.Function1[/* event2 */ E, Unit] = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/common", "getPositionIgnoreAngles")
  @js.native
  def getPositionIgnoreAngles(position: Position): left | right | bottom | top = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "getRef")
  @js.native
  def getRef[T](): T | Null = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "getRef")
  @js.native
  def getRef[T](ref: T): T | Null = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "getRef")
  @js.native
  def getRef[T](ref: IRefObject[T]): T | Null = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "isPositionHorizontal")
  @js.native
  def isPositionHorizontal(position: Position): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "isPositionVertical")
  @js.native
  def isPositionVertical(position: Position): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "isRefCallback")
  @js.native
  def isRefCallback[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "isRefCallback")
  @js.native
  def isRefCallback[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "isRefObject")
  @js.native
  def isRefObject[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "isRefObject")
  @js.native
  def isRefObject[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.UndefOr[scala.Nothing], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String]): StringDictionary[js.Any] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common", "removeNonHTMLProps")
  @js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
}
