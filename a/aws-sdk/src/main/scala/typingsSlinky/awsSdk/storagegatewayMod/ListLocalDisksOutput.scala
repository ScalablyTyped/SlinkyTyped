package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLocalDisksOutput extends StObject {
  
  /**
    * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
    */
  var Disks: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Disks] = js.native
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object ListLocalDisksOutput {
  
  @scala.inline
  def apply(): ListLocalDisksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocalDisksOutput]
  }
  
  @scala.inline
  implicit class ListLocalDisksOutputMutableBuilder[Self <: ListLocalDisksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: Disks): Self = StObject.set(x, "Disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "Disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: Disk*): Self = StObject.set(x, "Disks", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
