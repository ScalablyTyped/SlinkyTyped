package typingsSlinky.reactHotkeys.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptions extends js.Object {
  /**
    * Whether to allow combination submatches - e.g. if there is an action bound to
    * cmd, pressing shift+cmd will *not* trigger that action when
    * allowCombinationSubmatches is false.
    */
  var allowCombinationSubmatches: js.UndefOr[Boolean] = js.native
  /**
    * A mapping of custom key codes to key names that you can then use in your
    * key sequences
    */
  var customKeyCodes: js.UndefOr[NumberDictionary[String]] = js.native
  /**
    * The default component type to wrap HotKey components' children in, to provide
    * the required focus and keyboard event listening for HotKeys to function
    */
  var defaultComponent: js.UndefOr[ReactComponent] = js.native
  /**
    * The default key event key maps are bound to, if left unspecified
    */
  var defaultKeyEvent: js.UndefOr[KeyEventName] = js.native
  /**
    * The default tabIndex value passed to the wrapping component used to contain
    * HotKey components' children. -1 skips focusing the element when tabbing through
    * the DOM, but allows focusing programmatically.
    */
  var defaultTabIndex: js.UndefOr[TabIndex] = js.native
  /**
    * Whether to allow hard sequences, or the binding of handlers to actions that have
    * names that are valid key sequences, which implicitly define actions that are
    * triggered by that key sequence
    */
  var enableHardSequences: js.UndefOr[Boolean] = js.native
  /**
    * The function used to determine whether a key event should be ignored by React
    * Hotkeys. By default, keyboard events originating elements with a tag name in
    * ignoreTags, or a isContentEditable property of true, are ignored.
    */
  var ignoreEventsCondition: js.UndefOr[js.Function1[/* keyEvent */ KeyboardEvent, Boolean]] = js.native
  /**
    * Whether to ignore changes to keyMap and handlers props by default (this reduces
    * a significant amount of unnecessarily resetting internal state)
    */
  var ignoreKeymapAndHandlerChangesByDefault: js.UndefOr[Boolean] = js.native
  /**
    * Whether to ignore repeated keyboard events when a key is being held down
    */
  var ignoreRepeatedEventsWhenKeyHeldDown: js.UndefOr[Boolean] = js.native
  /**
    * The HTML tags that React HotKeys should ignore key events from. This only works
    * if you are using the default ignoreEventsCondition function.
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The level of logging of its own behaviour React HotKeys should perform. Default
    * level is 'warn'.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * Whether React HotKeys should simulate keypress events for the keys that do not
    * natively emit them.
    */
  var simulateMissingKeyPressEvents: js.UndefOr[Boolean] = js.native
  /**
    * Whether to call stopPropagation() on events after they are handled (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterHandling: js.UndefOr[Boolean] = js.native
  /**
    * Whether to call stopPropagation() on events after they are ignored (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterIgnoring: js.UndefOr[Boolean] = js.native
}

object ConfigurationOptions {
  @scala.inline
  def apply(): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptions]
  }
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCombinationSubmatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCombinationSubmatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCombinationSubmatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCombinationSubmatches")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomKeyCodes(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeyCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeyCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultComponentFunctionComponent(value: ReactComponentClass[ComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultComponentComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultComponent(value: ReactComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultKeyEvent(value: KeyEventName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKeyEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKeyEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKeyEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTabIndex(value: TabIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHardSequences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHardSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHardSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHardSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEventsCondition(value: /* keyEvent */ KeyboardEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEventsCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIgnoreEventsCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEventsCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreKeymapAndHandlerChangesByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreKeymapAndHandlerChangesByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreKeymapAndHandlerChangesByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreKeymapAndHandlerChangesByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRepeatedEventsWhenKeyHeldDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRepeatedEventsWhenKeyHeldDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRepeatedEventsWhenKeyHeldDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRepeatedEventsWhenKeyHeldDown")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulateMissingKeyPressEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateMissingKeyPressEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulateMissingKeyPressEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateMissingKeyPressEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEventPropagationAfterHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEventPropagationAfterHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEventPropagationAfterHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEventPropagationAfterHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEventPropagationAfterIgnoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEventPropagationAfterIgnoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopEventPropagationAfterIgnoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEventPropagationAfterIgnoring")(js.undefined)
        ret
    }
  }
  
}

