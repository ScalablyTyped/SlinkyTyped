package typingsSlinky.gapiClientAndroidenterprise

import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.DevicesResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.EnterprisesResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.EntitlementsResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicensesResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicenseusersResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.InstallsResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsfordeviceResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsforuserResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.PermissionsResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.ProductsResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.ServiceaccountkeysResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutclustersResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutpagesResource
import typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise.UsersResource
import typingsSlinky.gapiClientAndroidenterprise.gapiClientAndroidenterpriseStrings.androidenterprise
import typingsSlinky.gapiClientAndroidenterprise.gapiClientAndroidenterpriseStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val devices: DevicesResource = js.native
      val enterprises: EnterprisesResource = js.native
      val entitlements: EntitlementsResource = js.native
      val grouplicenses: GrouplicensesResource = js.native
      val grouplicenseusers: GrouplicenseusersResource = js.native
      val installs: InstallsResource = js.native
      val managedconfigurationsfordevice: ManagedconfigurationsfordeviceResource = js.native
      val managedconfigurationsforuser: ManagedconfigurationsforuserResource = js.native
      val permissions: PermissionsResource = js.native
      val products: ProductsResource = js.native
      val serviceaccountkeys: ServiceaccountkeysResource = js.native
      val storelayoutclusters: StorelayoutclustersResource = js.native
      val storelayoutpages: StorelayoutpagesResource = js.native
      val users: UsersResource = js.native
      /** Load Google Play EMM API v1 */
      def load(name: androidenterprise, version: v1): js.Thenable[Unit] = js.native
      def load(name: androidenterprise, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

