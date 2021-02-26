package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPathComponentDetails extends StObject {
  
  /**
    * The IP addresses of the destination.
    */
  var Address: js.UndefOr[StringList] = js.native
  
  /**
    * A list of port ranges for the destination.
    */
  var PortRanges: js.UndefOr[PortRangeList] = js.native
}
object NetworkPathComponentDetails {
  
  @scala.inline
  def apply(): NetworkPathComponentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPathComponentDetails]
  }
  
  @scala.inline
  implicit class NetworkPathComponentDetailsMutableBuilder[Self <: NetworkPathComponentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: StringList): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: NonEmptyString*): Self = StObject.set(x, "Address", js.Array(value :_*))
    
    @scala.inline
    def setPortRanges(value: PortRangeList): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRangesUndefined: Self = StObject.set(x, "PortRanges", js.undefined)
    
    @scala.inline
    def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value :_*))
  }
}
