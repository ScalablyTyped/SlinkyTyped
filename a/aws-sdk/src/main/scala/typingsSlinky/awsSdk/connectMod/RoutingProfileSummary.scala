package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfileSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var Id: js.UndefOr[RoutingProfileId] = js.native
  
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.native
}
object RoutingProfileSummary {
  
  @scala.inline
  def apply(): RoutingProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfileSummary]
  }
  
  @scala.inline
  implicit class RoutingProfileSummaryMutableBuilder[Self <: RoutingProfileSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: RoutingProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
