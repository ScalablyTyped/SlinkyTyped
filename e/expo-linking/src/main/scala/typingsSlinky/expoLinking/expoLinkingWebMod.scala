package typingsSlinky.expoLinking

import typingsSlinky.expoLinking.expoLinkingStrings.url
import typingsSlinky.expoLinking.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linking/build/ExpoLinking.web", JSImport.Namespace)
@js.native
object expoLinkingWebMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @JSName("addEventListener")
    def addEventListener_url(`type`: url, listener: URLListener): Unit = js.native
    
    def canOpenURL(url: String): js.Promise[Boolean] = js.native
    
    def getInitialURL(): js.Promise[String] = js.native
    
    def openURL(url: String): js.Promise[Unit] = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_url(`type`: url, listener: URLListener): Unit = js.native
  }
}
