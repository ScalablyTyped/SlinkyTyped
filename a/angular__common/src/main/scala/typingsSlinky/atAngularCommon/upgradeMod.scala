package typingsSlinky.atAngularCommon

import typingsSlinky.atAngularCommon.atAngularCommonMod.HashLocationStrategy
import typingsSlinky.atAngularCommon.atAngularCommonMod.Location
import typingsSlinky.atAngularCommon.atAngularCommonMod.LocationStrategy
import typingsSlinky.atAngularCommon.atAngularCommonMod.PathLocationStrategy
import typingsSlinky.atAngularCommon.atAngularCommonMod.PlatformLocation
import typingsSlinky.atAngularCommon.upgradeUpgradeMod.LocationUpgradeConfig
import typingsSlinky.atAngularCore.atAngularCoreMod.InjectionToken
import typingsSlinky.atAngularCore.atAngularCoreMod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", JSImport.Namespace)
@js.native
object upgradeMod extends js.Object {
  @js.native
  class $locationShim protected ()
    extends typingsSlinky.atAngularCommon.upgradeUpgradeMod.$locationShim {
    def this(
      $injector: js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsSlinky.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class $locationShimProvider protected ()
    extends typingsSlinky.atAngularCommon.upgradeUpgradeMod.$locationShimProvider {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsSlinky.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class AngularJSUrlCodec ()
    extends typingsSlinky.atAngularCommon.upgradeUpgradeMod.AngularJSUrlCodec
  
  @js.native
  class LocationUpgradeModule ()
    extends typingsSlinky.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule
  
  @js.native
  abstract class UrlCodec ()
    extends typingsSlinky.atAngularCommon.upgradeUpgradeMod.UrlCodec
  
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig, appBaseHref: String): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_b(config: LocationUpgradeConfig): js.Any = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_d(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typingsSlinky.atAngularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ): typingsSlinky.atAngularCommon.upgradeUpgradeMod.$locationShim = js.native
  /* static members */
  @js.native
  object LocationUpgradeModule extends js.Object {
    def config(): ModuleWithProviders[typingsSlinky.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
    def config(config: LocationUpgradeConfig): ModuleWithProviders[typingsSlinky.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
  }
  
}

