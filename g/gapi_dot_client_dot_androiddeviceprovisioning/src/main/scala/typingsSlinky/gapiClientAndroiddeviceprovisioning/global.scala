package typingsSlinky.gapiClientAndroiddeviceprovisioning

import typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.OperationsResource
import typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.PartnersResource
import typingsSlinky.gapiClientAndroiddeviceprovisioning.gapiClientAndroiddeviceprovisioningStrings.androiddeviceprovisioning
import typingsSlinky.gapiClientAndroiddeviceprovisioning.gapiClientAndroiddeviceprovisioningStrings.v1
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
      
      val operations: OperationsResource = js.native
      
      val partners: PartnersResource = js.native
    }
  }
}
