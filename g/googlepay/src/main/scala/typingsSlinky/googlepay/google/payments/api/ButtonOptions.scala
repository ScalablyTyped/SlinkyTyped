package typingsSlinky.googlepay.google.payments.api

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDocument
import typingsSlinky.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object allows you to configure a Google Pay payment button. For
  * more information about button types, colors, and display requirements,
  * see Google's [Brand
  * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines).
  */
@js.native
trait ButtonOptions extends StObject {
  
  /**
    * Specifies the button color of the Google Pay button.
    *
    * @default "default"
    */
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  
  /**
    * Specifies how to append Google Pay resources, such as `<style>` tags,
    * in the DOM. Its default value is document.
    *
    * Use this property to integrate Google Pay with Web Components and the
    * shadow DOM. Set its value to the result of
    * [`container.getRootNode()`](https://developer.mozilla.org/en-US/docs/Web/API/Node/getRootNode).
    *
    * @default document
    */
  var buttonRootNode: js.UndefOr[HTMLDocument | ShadowRoot] = js.native
  
  /**
    * Determines how the button's size should change relative to the
    * button's parent element.
    *
    * @default "static"
    */
  var buttonSizeMode: js.UndefOr[ButtonSizeMode] = js.native
  
  /**
    * Specifies the text to be displayed within the Google Pay button.
    *
    * @default "buy"
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  
  /**
    * An [event listener
    * callback](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#The_event_listener_callback)
    * to call when a click event is delivered to the `<button>` target.
    */
  def onClick(event: Event): Unit = js.native
}
object ButtonOptions {
  
  @scala.inline
  def apply(onClick: Event => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonColor(value: ButtonColor): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
    
    @scala.inline
    def setButtonRootNode(value: HTMLDocument | ShadowRoot): Self = StObject.set(x, "buttonRootNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRootNodeHTMLDocument(value: HTMLDocument): Self = StObject.set(x, "buttonRootNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRootNodeUndefined: Self = StObject.set(x, "buttonRootNode", js.undefined)
    
    @scala.inline
    def setButtonSizeMode(value: ButtonSizeMode): Self = StObject.set(x, "buttonSizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonSizeModeUndefined: Self = StObject.set(x, "buttonSizeMode", js.undefined)
    
    @scala.inline
    def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    @scala.inline
    def setOnClick(value: Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
