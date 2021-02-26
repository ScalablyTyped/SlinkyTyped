package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region webview组件控制 https://docs.alipay.com/mini/api/webview-context
@js.native
trait WebViewContext extends StObject {
  
  def postMessage(param: js.Any): Unit = js.native
}
object WebViewContext {
  
  @scala.inline
  def apply(postMessage: js.Any => Unit): WebViewContext = {
    val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[WebViewContext]
  }
  
  @scala.inline
  implicit class WebViewContextMutableBuilder[Self <: WebViewContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostMessage(value: js.Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
  }
}
