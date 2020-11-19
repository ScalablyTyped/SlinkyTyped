package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Environment. Note that a user can create,
  * delete and update environments of type USER, but can only update the
  * enable_debug and url fields of environments of other types.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The environment authorization code.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  
  /**
    * The last update time-stamp for the authorization code.
    */
  var authorizationTimestampMs: js.UndefOr[String] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  var containerVersionId: js.UndefOr[String] = js.native
  
  /**
    * The environment description. Can be set or changed only on USER type
    * environments.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to enable debug by default on for the environment.
    */
  var enableDebug: js.UndefOr[Boolean] = js.native
  
  /**
    * GTM Environment ID uniquely identifies the GTM Environment.
    */
  var environmentId: js.UndefOr[String] = js.native
  
  /**
    * The fingerprint of the GTM environment as computed at storage time. This
    * value is recomputed whenever the environment is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The environment display name. Can be set or changed only on USER type
    * environments.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of this environment.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Default preview page url for the environment.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationCode: Self = this.set("authorizationCode", js.undefined)
    
    @scala.inline
    def setAuthorizationTimestampMs(value: String): Self = this.set("authorizationTimestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationTimestampMs: Self = this.set("authorizationTimestampMs", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableDebug(value: Boolean): Self = this.set("enableDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDebug: Self = this.set("enableDebug", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: String): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
