package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionConfigurationProperty extends js.Object {
  
  /**
    * The description of the action configuration property that is displayed to users.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Whether the configuration property is a key.
    */
  var key: Boolean = js.native
  
  /**
    * The name of the action configuration property.
    */
  var name: ActionConfigurationKey = js.native
  
  /**
    * Indicates that the property is used with PollForJobs. When creating a custom action, an action can have up to one queryable property. If it has one, that property must be both required and not secret. If you create a pipeline with a custom action type, and that custom action contains a queryable property, the value for that configuration property is subject to other restrictions. The value must be less than or equal to twenty (20) characters. The value can contain only alphanumeric characters, underscores, and hyphens.
    */
  var queryable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the configuration property is a required value.
    */
  var required: Boolean = js.native
  
  /**
    * Whether the configuration property is secret. Secrets are hidden from all calls except for GetJobDetails, GetThirdPartyJobDetails, PollForJobs, and PollForThirdPartyJobs. When updating a pipeline, passing * * * * * without changing any other values of the action preserves the previous value of the secret.
    */
  var secret: Boolean = js.native
  
  /**
    * The type of the configuration property.
    */
  var `type`: js.UndefOr[ActionConfigurationPropertyType] = js.native
}
object ActionConfigurationProperty {
  
  @scala.inline
  def apply(key: Boolean, name: ActionConfigurationKey, required: Boolean, secret: Boolean): ActionConfigurationProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionConfigurationProperty]
  }
  
  @scala.inline
  implicit class ActionConfigurationPropertyOps[Self <: ActionConfigurationProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: Boolean): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActionConfigurationKey): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: Boolean): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setQueryable(value: Boolean): Self = this.set("queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryable: Self = this.set("queryable", js.undefined)
    
    @scala.inline
    def setType(value: ActionConfigurationPropertyType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
