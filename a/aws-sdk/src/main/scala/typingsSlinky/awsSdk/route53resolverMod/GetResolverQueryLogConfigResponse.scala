package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverQueryLogConfigResponse extends StObject {
  
  /**
    * Information about the Resolver query logging configuration that you specified in a GetQueryLogConfig request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverQueryLogConfig] = js.native
}
object GetResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): GetResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigResponseMutableBuilder[Self <: GetResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = StObject.set(x, "ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigUndefined: Self = StObject.set(x, "ResolverQueryLogConfig", js.undefined)
  }
}
