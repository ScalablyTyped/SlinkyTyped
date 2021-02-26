package typingsSlinky.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveContext extends StObject {
  
  /**
    * The name of the context.
    */
  var name: ActiveContextName = js.native
  
  /**
    * State variables for the current context. You can use these values as default values for slots in subsequent events.
    */
  var parameters: ActiveContextParametersMap = js.native
  
  /**
    * The length of time or number of turns that a context remains active.
    */
  var timeToLive: ActiveContextTimeToLive = js.native
}
object ActiveContext {
  
  @scala.inline
  def apply(
    name: ActiveContextName,
    parameters: ActiveContextParametersMap,
    timeToLive: ActiveContextTimeToLive
  ): ActiveContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveContext]
  }
  
  @scala.inline
  implicit class ActiveContextMutableBuilder[Self <: ActiveContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ActiveContextName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ActiveContextParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLive(value: ActiveContextTimeToLive): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
  }
}
