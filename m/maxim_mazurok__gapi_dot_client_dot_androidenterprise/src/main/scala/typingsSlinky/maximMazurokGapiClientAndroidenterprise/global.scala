package typingsSlinky.maximMazurokGapiClientAndroidenterprise

import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.DevicesResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EnterprisesResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EntitlementsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicensesResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicenseusersResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.InstallsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsfordeviceResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsforuserResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationssettingsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.PermissionsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ProductsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ServiceaccountkeysResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutclustersResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutpagesResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.UsersResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.WebappsResource
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.androidenterprise
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.v1
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
      
      /** Load Google Play EMM API v1 */
      def load(name: androidenterprise, version: v1): js.Thenable[Unit] = js.native
      def load(name: androidenterprise, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object androidenterprise extends js.Object {
        
        val devices: DevicesResource = js.native
        
        val enterprises: EnterprisesResource = js.native
        
        val entitlements: EntitlementsResource = js.native
        
        val grouplicenses: GrouplicensesResource = js.native
        
        val grouplicenseusers: GrouplicenseusersResource = js.native
        
        val installs: InstallsResource = js.native
        
        val managedconfigurationsfordevice: ManagedconfigurationsfordeviceResource = js.native
        
        val managedconfigurationsforuser: ManagedconfigurationsforuserResource = js.native
        
        val managedconfigurationssettings: ManagedconfigurationssettingsResource = js.native
        
        val permissions: PermissionsResource = js.native
        
        val products: ProductsResource = js.native
        
        val serviceaccountkeys: ServiceaccountkeysResource = js.native
        
        val storelayoutclusters: StorelayoutclustersResource = js.native
        
        val storelayoutpages: StorelayoutpagesResource = js.native
        
        val users: UsersResource = js.native
        
        val webapps: WebappsResource = js.native
      }
    }
  }
}
