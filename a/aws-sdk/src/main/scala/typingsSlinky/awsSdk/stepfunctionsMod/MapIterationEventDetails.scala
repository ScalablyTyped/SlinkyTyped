package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapIterationEventDetails extends StObject {
  
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var index: js.UndefOr[UnsignedInteger] = js.native
  
  /**
    * The name of the iteration’s parent Map state.
    */
  var name: js.UndefOr[Name] = js.native
}
object MapIterationEventDetails {
  
  @scala.inline
  def apply(): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapIterationEventDetails]
  }
  
  @scala.inline
  implicit class MapIterationEventDetailsMutableBuilder[Self <: MapIterationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: UnsignedInteger): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
