package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationInfo extends StObject {
  
  /**
    * The ID of the resource created at the destination.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The destination service of the record.
    */
  var service: js.UndefOr[NonEmptyString] = js.native
}
object DestinationInfo {
  
  @scala.inline
  def apply(): DestinationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationInfo]
  }
  
  @scala.inline
  implicit class DestinationInfoMutableBuilder[Self <: DestinationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setService(value: NonEmptyString): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
