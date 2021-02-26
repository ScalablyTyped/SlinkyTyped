package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfigSummary extends StObject {
  
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigName = js.native
}
object EndpointConfigSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName
  ): EndpointConfigSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigSummary]
  }
  
  @scala.inline
  implicit class EndpointConfigSummaryMutableBuilder[Self <: EndpointConfigSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigArn(value: EndpointConfigArn): Self = StObject.set(x, "EndpointConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
  }
}
