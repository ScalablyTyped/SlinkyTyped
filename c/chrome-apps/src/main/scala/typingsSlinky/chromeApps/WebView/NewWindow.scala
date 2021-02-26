package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.HTMLWebViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewWindow extends StObject {
  
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit = js.native
  
  /**
    * Cancel the new window request.
    */
  def discard(): Unit = js.native
}
object NewWindow {
  
  @scala.inline
  def apply(attach: HTMLWebViewElement => Unit, discard: () => Unit): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), discard = js.Any.fromFunction0(discard))
    __obj.asInstanceOf[NewWindow]
  }
  
  @scala.inline
  implicit class NewWindowMutableBuilder[Self <: NewWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: HTMLWebViewElement => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiscard(value: () => Unit): Self = StObject.set(x, "discard", js.Any.fromFunction0(value))
  }
}
