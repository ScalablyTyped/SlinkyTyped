package typingsSlinky.angularCommon

import typingsSlinky.angularCommon.angularCommonTestingMod.MockPlatformLocationConfig
import typingsSlinky.angularCommon.mod.LocationStrategy
import typingsSlinky.angularCommon.mod.PlatformLocation
import typingsSlinky.angularCore.mod.InjectionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularCommonMod {
  
  @JSImport("@angular/common/testing", "MOCK_PLATFORM_LOCATION_CONFIG")
  @js.native
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
  
  @JSImport("@angular/common/testing", "MockLocationStrategy")
  @js.native
  class MockLocationStrategy ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.MockLocationStrategy
  
  @JSImport("@angular/common/testing", "MockPlatformLocation")
  @js.native
  class MockPlatformLocation ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @JSImport("@angular/common/testing", "SpyLocation")
  @js.native
  class SpyLocation protected ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.SpyLocation {
    def this(platformStrategy: LocationStrategy, platformLocation: PlatformLocation) = this()
  }
}
