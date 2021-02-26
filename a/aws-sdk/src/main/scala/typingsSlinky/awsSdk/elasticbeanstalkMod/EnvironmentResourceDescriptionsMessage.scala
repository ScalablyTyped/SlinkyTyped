package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResourceDescriptionsMessage extends StObject {
  
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.native
}
object EnvironmentResourceDescriptionsMessage {
  
  @scala.inline
  def apply(): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
  
  @scala.inline
  implicit class EnvironmentResourceDescriptionsMessageMutableBuilder[Self <: EnvironmentResourceDescriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentResources(value: EnvironmentResourceDescription): Self = StObject.set(x, "EnvironmentResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentResourcesUndefined: Self = StObject.set(x, "EnvironmentResources", js.undefined)
  }
}
