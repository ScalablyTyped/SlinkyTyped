package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVTLDevicesOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * An opaque string that indicates the position at which the VTL devices that were fetched for description ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL devices to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * An array of VTL device objects composed of the Amazon Resource Name (ARN) of the VTL devices.
    */
  var VTLDevices: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDevices] = js.native
}
object DescribeVTLDevicesOutput {
  
  @scala.inline
  def apply(): DescribeVTLDevicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVTLDevicesOutput]
  }
  
  @scala.inline
  implicit class DescribeVTLDevicesOutputMutableBuilder[Self <: DescribeVTLDevicesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setVTLDevices(value: VTLDevices): Self = StObject.set(x, "VTLDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDevicesUndefined: Self = StObject.set(x, "VTLDevices", js.undefined)
    
    @scala.inline
    def setVTLDevicesVarargs(value: VTLDevice*): Self = StObject.set(x, "VTLDevices", js.Array(value :_*))
  }
}
