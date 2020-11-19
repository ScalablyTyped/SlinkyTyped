package typingsSlinky.passportOauth2.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.oauth.mod.OAuth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Strategy extends js.Object {
  
  /**
    *   NOTE: The _oauth2 property is considered "protected".  Subclasses are
    *         allowed to use it when making protected resource requests to retrieve
    *         the user profile.
    */
  var _oauth2: OAuth2 = js.native
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Any): Unit = js.native
  
  def authorizationParams(options: js.Any): js.Object = js.native
  
  var name: String = js.native
  
  def parseErrorResponse(body: js.Any, status: Double): js.Error | Null = js.native
  
  def tokenParams(options: js.Any): js.Object = js.native
  
  def userProfile(
    accessToken: String,
    done: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* profile */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}
