package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of the service.
  */
@js.native
trait SchemaServiceConfig extends js.Object {
  
  /**
    * A list of API interfaces exported by this service. Contains only the
    * names, versions, and method names of the interfaces.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.native
  
  /**
    * Auth configuration. Contains only the OAuth rules.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.native
  
  /**
    * Additional API documentation. Contains only the summary and the
    * documentation URL.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.native
  
  /**
    * Configuration for network endpoints. Contains only the names and aliases
    * of the endpoints.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.native
  
  /**
    * The DNS address at which this service is available.  An example DNS
    * address would be: `calendar.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.native
  
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.native
}
object SchemaServiceConfig {
  
  @scala.inline
  def apply(): SchemaServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceConfig]
  }
  
  @scala.inline
  implicit class SchemaServiceConfigOps[Self <: SchemaServiceConfig] (val x: Self) extends AnyVal {
    
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
    def setApisVarargs(value: SchemaApi*): Self = this.set("apis", js.Array(value :_*))
    
    @scala.inline
    def setApis(value: js.Array[SchemaApi]): Self = this.set("apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApis: Self = this.set("apis", js.undefined)
    
    @scala.inline
    def setAuthentication(value: SchemaAuthentication): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    
    @scala.inline
    def setDocumentation(value: SchemaDocumentation): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: SchemaEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[SchemaEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQuota(value: SchemaQuota): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUsage(value: SchemaUsage): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
