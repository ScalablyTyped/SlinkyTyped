package typingsSlinky.reactNativeCommunityCliServerApi

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devToolsMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/devToolsMiddleware", JSImport.Default)
  @js.native
  def default(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit] = js.native
  
  @js.native
  trait LaunchDevToolsOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var watchFolders: js.Array[String] = js.native
  }
  object LaunchDevToolsOptions {
    
    @scala.inline
    def apply(port: Double, watchFolders: js.Array[String]): LaunchDevToolsOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchDevToolsOptions]
    }
    
    @scala.inline
    implicit class LaunchDevToolsOptionsMutableBuilder[Self <: LaunchDevToolsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value :_*))
    }
  }
}
