package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTapesInput extends StObject {
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * Specifies that the number of virtual tapes described be limited to the specified number.  Amazon Web Services may impose its own limit, if this field is not set. 
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  
  /**
    * A marker value, obtained in a previous call to DescribeTapes. This marker indicates which page of results to retrieve. If not specified, the first page of results is retrieved.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the specified gateway.
    */
  var TapeARNs: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARNs] = js.native
}
object DescribeTapesInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeTapesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapesInput]
  }
  
  @scala.inline
  implicit class DescribeTapesInputMutableBuilder[Self <: DescribeTapesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    @scala.inline
    def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value :_*))
  }
}
