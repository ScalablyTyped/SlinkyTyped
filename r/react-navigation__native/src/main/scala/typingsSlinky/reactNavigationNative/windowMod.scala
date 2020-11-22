package typingsSlinky.reactNavigationNative

import org.scalajs.dom.experimental.URL
import typingsSlinky.reactNavigationNative.anon.Back
import typingsSlinky.reactNavigationNative.anon.Title
import typingsSlinky.reactNavigationNative.reactNavigationNativeStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", JSImport.Namespace)
@js.native
object windowMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @JSName("addEventListener")
    def addEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
    
    var document: Title = js.native
    
    var history: Back = js.native
    
    var location: URL = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
  }
}
