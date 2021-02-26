package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoleAliasRequest extends StObject {
  
  /**
    * How long (in seconds) the credentials will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  
  /**
    * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
    */
  var roleAlias: RoleAlias = js.native
  
  /**
    * The role ARN.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * Metadata which can be used to manage the role alias.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateRoleAliasRequest {
  
  @scala.inline
  def apply(roleAlias: RoleAlias, roleArn: RoleArn): CreateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleAliasRequest]
  }
  
  @scala.inline
  implicit class CreateRoleAliasRequestMutableBuilder[Self <: CreateRoleAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialDurationSeconds(value: CredentialDurationSeconds): Self = StObject.set(x, "credentialDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialDurationSecondsUndefined: Self = StObject.set(x, "credentialDurationSeconds", js.undefined)
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
