package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResolverQueryLogConfigResponse extends StObject {
  
  /**
    * Information about the CreateResolverQueryLogConfig request, including the status of the request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverQueryLogConfig] = js.native
}
object CreateResolverQueryLogConfigResponse {
  
  @scala.inline
  def apply(): CreateResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverQueryLogConfigResponse]
  }
  
  @scala.inline
  implicit class CreateResolverQueryLogConfigResponseMutableBuilder[Self <: CreateResolverQueryLogConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = StObject.set(x, "ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigUndefined: Self = StObject.set(x, "ResolverQueryLogConfig", js.undefined)
  }
}
