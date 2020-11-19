package typingsSlinky.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFirebaseremoteconfig.anon.Accesstoken
import typingsSlinky.gapiClientFirebaseremoteconfig.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  /**
    * Get the latest version Remote Configuration for a project.
    * Returns the RemoteConfig as the payload, and also the eTag as a
    * response header.
    */
  def getRemoteConfig(request: Accesstoken): Request[RemoteConfig] = js.native
  
  /**
    * Update a RemoteConfig. We treat this as an always-existing
    * resource (when it is not found in our data store, we treat it as version
    * 0, a template with zero conditions and zero parameters). Hence there are
    * no Create or Delete operations. Returns the updated template when
    * successful (and the updated eTag as a response header), or an error if
    * things go wrong.
    * Possible error messages:
    * &#42; VALIDATION_ERROR (HTTP status 400) with additional details if the
    * template being passed in can not be validated.
    * &#42; AUTHENTICATION_ERROR (HTTP status 401) if the request can not be
    * authenticate (e.g. no access token, or invalid access token).
    * &#42; AUTHORIZATION_ERROR (HTTP status 403) if the request can not be
    * authorized (e.g. the user has no access to the specified project id).
    * &#42; VERSION_MISMATCH (HTTP status 412) when trying to update when the
    * expected eTag (passed in via the "If-match" header) is not specified, or
    * is specified but does does not match the current eTag.
    * &#42; Internal error (HTTP status 500) for Database problems or other internal
    * errors.
    */
  def updateRemoteConfig(request: Alt): Request[RemoteConfig] = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    getRemoteConfig: Accesstoken => Request[RemoteConfig],
    updateRemoteConfig: Alt => Request[RemoteConfig]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getRemoteConfig = js.Any.fromFunction1(getRemoteConfig), updateRemoteConfig = js.Any.fromFunction1(updateRemoteConfig))
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRemoteConfig(value: Accesstoken => Request[RemoteConfig]): Self = this.set("getRemoteConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRemoteConfig(value: Alt => Request[RemoteConfig]): Self = this.set("updateRemoteConfig", js.Any.fromFunction1(value))
  }
}
