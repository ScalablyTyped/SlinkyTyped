package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualServicesOutput extends StObject {
  
  /**
    * The nextToken value to include in a future ListVirtualServices request. When the results of a ListVirtualServices request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of existing virtual services for the specified service mesh.
    */
  var virtualServices: VirtualServiceList = js.native
}
object ListVirtualServicesOutput {
  
  @scala.inline
  def apply(virtualServices: VirtualServiceList): ListVirtualServicesOutput = {
    val __obj = js.Dynamic.literal(virtualServices = virtualServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualServicesOutput]
  }
  
  @scala.inline
  implicit class ListVirtualServicesOutputMutableBuilder[Self <: ListVirtualServicesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualServices(value: VirtualServiceList): Self = StObject.set(x, "virtualServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualServicesVarargs(value: VirtualServiceRef*): Self = StObject.set(x, "virtualServices", js.Array(value :_*))
  }
}
