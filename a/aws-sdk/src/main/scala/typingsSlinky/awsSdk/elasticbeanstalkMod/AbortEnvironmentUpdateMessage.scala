package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortEnvironmentUpdateMessage extends StObject {
  
  /**
    * This specifies the ID of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * This specifies the name of the environment with the in-progress update that you want to cancel.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
}
object AbortEnvironmentUpdateMessage {
  
  @scala.inline
  def apply(): AbortEnvironmentUpdateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortEnvironmentUpdateMessage]
  }
  
  @scala.inline
  implicit class AbortEnvironmentUpdateMessageMutableBuilder[Self <: AbortEnvironmentUpdateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
  }
}
