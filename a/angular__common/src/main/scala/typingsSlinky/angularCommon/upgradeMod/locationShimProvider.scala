package typingsSlinky.angularCommon.upgradeMod

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCommon.mod.LocationStrategy
import typingsSlinky.angularCommon.mod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

