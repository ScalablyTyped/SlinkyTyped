package typingsSlinky.atlassianCrowdClient

import typingsSlinky.atlassianCrowdClient.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("atlassian-crowd-client/api", JSImport.Namespace)
  @js.native
  class ^ protected () extends CrowdApi {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait CrowdApi extends StObject {
    
    def log(args: js.Any*): Unit = js.native
    
    def request(method: String, path: String): js.Promise[_] = js.native
    def request(method: String, path: String, data: js.Any): js.Promise[_] = js.native
    
    var settings: Settings = js.native
  }
}
