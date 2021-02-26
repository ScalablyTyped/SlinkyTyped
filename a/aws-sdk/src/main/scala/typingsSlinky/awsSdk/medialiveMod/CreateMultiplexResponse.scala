package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultiplexResponse extends StObject {
  
  /**
    * The newly created multiplex.
    */
  var Multiplex: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Multiplex] = js.native
}
object CreateMultiplexResponse {
  
  @scala.inline
  def apply(): CreateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexResponse]
  }
  
  @scala.inline
  implicit class CreateMultiplexResponseMutableBuilder[Self <: CreateMultiplexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplex(value: Multiplex): Self = StObject.set(x, "Multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexUndefined: Self = StObject.set(x, "Multiplex", js.undefined)
  }
}
