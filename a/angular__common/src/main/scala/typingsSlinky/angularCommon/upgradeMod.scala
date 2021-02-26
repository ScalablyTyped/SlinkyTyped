package typingsSlinky.angularCommon

import typingsSlinky.angularCommon.mod.HashLocationStrategy
import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCommon.mod.LocationStrategy
import typingsSlinky.angularCommon.mod.PathLocationStrategy
import typingsSlinky.angularCommon.mod.PlatformLocation
import typingsSlinky.angularCommon.upgradeUpgradeMod.LocationUpgradeConfig
import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  @JSImport("@angular/common/upgrade", "AngularJSUrlCodec")
  @js.native
  class AngularJSUrlCodec ()
    extends typingsSlinky.angularCommon.upgradeUpgradeMod.AngularJSUrlCodec
  
  @JSImport("@angular/common/upgrade", "LOCATION_UPGRADE_CONFIGURATION")
  @js.native
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  
  @JSImport("@angular/common/upgrade", "LocationUpgradeModule")
  @js.native
  class LocationUpgradeModule ()
    extends typingsSlinky.angularCommon.upgradeUpgradeMod.LocationUpgradeModule
  /* static members */
  object LocationUpgradeModule {
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule.config")
    @js.native
    def config(): ModuleWithProviders[typingsSlinky.angularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule.config")
    @js.native
    def config(config: LocationUpgradeConfig): ModuleWithProviders[typingsSlinky.angularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
  }
  
  @JSImport("@angular/common/upgrade", "UrlCodec")
  @js.native
  abstract class UrlCodec ()
    extends typingsSlinky.angularCommon.upgradeUpgradeMod.UrlCodec
  
  @JSImport("@angular/common/upgrade", "$locationShim")
  @js.native
  class locationShim protected ()
    extends typingsSlinky.angularCommon.upgradeUpgradeMod.locationShim {
    def this(
      $injector: js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsSlinky.angularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @JSImport("@angular/common/upgrade", "$locationShimProvider")
  @js.native
  class locationShimProvider protected ()
    extends typingsSlinky.angularCommon.upgradeUpgradeMod.locationShimProvider {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsSlinky.angularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_a")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig): String = js.native
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_a")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig, appBaseHref: String): String = js.native
  
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_b")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeB(config: LocationUpgradeConfig): js.Any = js.native
  
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_c")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = js.native
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_c")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = js.native
  
  @JSImport("@angular/common/upgrade", "\u0275angular_packages_common_upgrade_upgrade_d")
  @js.native
  def ɵangularPackagesCommonUpgradeUpgradeD(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typingsSlinky.angularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ): typingsSlinky.angularCommon.upgradeUpgradeMod.locationShim = js.native
}
