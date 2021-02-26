package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetResult extends StObject {
  
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Fleet] = js.native
}
object UpdateFleetResult {
  
  @scala.inline
  def apply(): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetResult]
  }
  
  @scala.inline
  implicit class UpdateFleetResultMutableBuilder[Self <: UpdateFleetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Fleet): Self = StObject.set(x, "Fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "Fleet", js.undefined)
  }
}
