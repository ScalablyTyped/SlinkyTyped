package typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTopicsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the topic. It must have the format
    * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a
    * letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes
    * (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or
    * percent signs (`%`). It must be between 3 and 255 characters in length,
    * and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTopic] = js.native
}
object ParamsResourceProjectsTopicsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTopicsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTopicsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTopicsCreateMutableBuilder[Self <: ParamsResourceProjectsTopicsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaTopic): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
