package typingsSlinky.atlassianConnectJs.AP

import typingsSlinky.atlassianConnectJs.anon.Identifier
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.`x-large`
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.fullscreen
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.large
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.medium
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Dialog module provides a mechanism for launching an add-on's modules as modal dialogs from within an add-on's iframe.
  * A modal dialog displays information without requiring the user to leave the current page.
  *
  * The dialog is opened over the entire window, rather than within the iframe itself.
  */
object dialog {
  
  @js.native
  trait Dialog extends StObject {
    
    def on(name: String, callback: js.Function0[Unit]): Unit = js.native
  }
  object Dialog {
    
    @scala.inline
    def apply(on: (String, js.Function0[Unit]) => Unit): Dialog = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[Dialog]
    }
    
    @scala.inline
    implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DialogButton extends StObject {
    
    /**
      * Sets the button state to disabled. A disabled button cannot be clicked and emits no events.
      */
    def disable(): Unit = js.native
    
    /**
      * Sets the button state to enabled
      */
    def enable(): Unit = js.native
    
    /**
      * Sets the button state to hidden
      */
    def hide(): Unit = js.native
    
    /**
      * Query a button for its current state.
      * @param callback function to receive the button state.
      */
    def isEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
    
    /**
      * Query a button for its current hidden/visible state.
      * @param callback function to receive the button state.
      */
    def isHidden(callback: js.Function1[/* hidden */ Boolean, Unit]): Unit = js.native
    
    /**
      * Sets the button state to visible
      */
    def show(): Unit = js.native
    
    /**
      * Toggle the button state between enabled and disabled.
      */
    def toggle(): Unit = js.native
    
    /**
      * Trigger a callback bound to a button.
      */
    def trigger(): Unit = js.native
  }
  object DialogButton {
    
    @scala.inline
    def apply(
      disable: () => Unit,
      enable: () => Unit,
      hide: () => Unit,
      isEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isHidden: js.Function1[/* hidden */ Boolean, Unit] => Unit,
      show: () => Unit,
      toggle: () => Unit,
      trigger: () => Unit
    ): DialogButton = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction1(isEnabled), isHidden = js.Any.fromFunction1(isHidden), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle), trigger = js.Any.fromFunction0(trigger))
      __obj.asInstanceOf[DialogButton]
    }
    
    @scala.inline
    implicit class DialogButtonMutableBuilder[Self <: DialogButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsHidden(value: js.Function1[/* hidden */ Boolean, Unit] => Unit): Self = StObject.set(x, "isHidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrigger(value: () => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DialogOptions extends StObject {
    
    /**
      * (optional) an array of custom buttons to be added to the dialog if opening a dialog with chrome.
      */
    var buttons: js.UndefOr[js.Array[Identifier]] = js.native
    
    /**
      * (optional) text for the cancel button if opening a dialog with chrome.
      */
    var cancelText: js.UndefOr[String] = js.native
    
    /**
      * (optional) opens the dialog with heading and buttons.
      */
    var chrome: js.UndefOr[Boolean] = js.native
    
    /**
      * (optional) if true, pressing ESC inside the dialog will close the dialog (default is true).
      */
    var closeOnEscape: js.UndefOr[Boolean] = js.native
    
    /**
      * (optional) custom data object that can be accessed from the actual dialog iFrame.
      */
    var customData: js.UndefOr[js.Object] = js.native
    
    /**
      * (optional) text to display in the header if opening a dialog with chrome.
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * if size is not set, define the height as a percentage (append a % to the number) or pixels.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * (optional) Suggested actions or helpful info that will be added to the dialog if opening with chrome.
      */
    var hint: js.UndefOr[String] = js.native
    
    /**
      * The module key of a dialog, or the key of a page or web-item that you want to open as a dialog.
      */
    var key: String = js.native
    
    /**
      * Opens the dialog at a preset size: small, medium, large, x-large or fullscreen (with chrome).
      */
    var size: js.UndefOr[small | medium | large | `x-large` | fullscreen] = js.native
    
    /**
      * (optional) text for the submit button if opening a dialog with chrome.
      */
    var submitText: js.UndefOr[String] = js.native
    
    /**
      * if size is not set, define the width as a percentage (append a % to the number) or pixels.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object DialogOptions {
    
    @scala.inline
    def apply(key: String): DialogOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogOptions]
    }
    
    @scala.inline
    implicit class DialogOptionsMutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[Identifier]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: Identifier*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: small | medium | large | `x-large` | fullscreen): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
