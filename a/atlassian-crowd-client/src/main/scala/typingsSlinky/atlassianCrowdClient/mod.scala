package typingsSlinky.atlassianCrowdClient

import typingsSlinky.atlassianCrowdClient.anon.Attributes
import typingsSlinky.atlassianCrowdClient.anon.Authenticate
import typingsSlinky.atlassianCrowdClient.anon.Children
import typingsSlinky.atlassianCrowdClient.anon.Cookie
import typingsSlinky.atlassianCrowdClient.anon.Create
import typingsSlinky.atlassianCrowdClient.anon.Group
import typingsSlinky.atlassianCrowdClient.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atlassian-crowd-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends CrowdClient {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait CrowdClient
    extends typingsSlinky.atlassianCrowdClient.apiMod.^ {
    
    var authentication: Authenticate = js.native
    
    var config: Cookie = js.native
    
    var group: Children = js.native
    
    var search: Group = js.native
    
    var session: Create = js.native
    
    var user: Attributes = js.native
  }
}
