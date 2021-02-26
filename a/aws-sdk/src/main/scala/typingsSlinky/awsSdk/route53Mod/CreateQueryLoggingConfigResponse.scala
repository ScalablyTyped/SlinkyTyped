package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQueryLoggingConfigResponse extends StObject {
  
  /**
    * The unique URL representing the new query logging configuration.
    */
  var Location: ResourceURI = js.native
  
  /**
    * A complex type that contains the ID for a query logging configuration, the ID of the hosted zone that you want to log queries for, and the ARN for the log group that you want Amazon Route 53 to send query logs to.
    */
  var QueryLoggingConfig: typingsSlinky.awsSdk.route53Mod.QueryLoggingConfig = js.native
}
object CreateQueryLoggingConfigResponse {
  
  @scala.inline
  def apply(Location: ResourceURI, QueryLoggingConfig: QueryLoggingConfig): CreateQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], QueryLoggingConfig = QueryLoggingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueryLoggingConfigResponse]
  }
  
  @scala.inline
  implicit class CreateQueryLoggingConfigResponseMutableBuilder[Self <: CreateQueryLoggingConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLoggingConfig(value: QueryLoggingConfig): Self = StObject.set(x, "QueryLoggingConfig", value.asInstanceOf[js.Any])
  }
}
