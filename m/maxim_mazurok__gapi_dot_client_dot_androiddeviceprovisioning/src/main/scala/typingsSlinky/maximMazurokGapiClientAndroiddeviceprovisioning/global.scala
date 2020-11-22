package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning

import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.CustomersResource
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.OperationsResource
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.PartnersResource
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.androiddeviceprovisioning
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Android Device Provisioning Partner API v1 */
      def load(name: androiddeviceprovisioning, version: v1): js.Thenable[Unit] = js.native
      def load(name: androiddeviceprovisioning, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object androiddeviceprovisioning extends js.Object {
        
        val customers: CustomersResource = js.native
        
        val operations: OperationsResource = js.native
        
        val partners: PartnersResource = js.native
      }
    }
  }
}
