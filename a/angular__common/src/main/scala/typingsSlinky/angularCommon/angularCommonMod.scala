package typingsSlinky.angularCommon

import typingsSlinky.angularCommon.angularCommonTestingMod.MockPlatformLocationConfig
import typingsSlinky.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing", JSImport.Namespace)
@js.native
object angularCommonMod extends js.Object {
  @js.native
  class MockLocationStrategy ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.MockLocationStrategy
  
  @js.native
  class MockPlatformLocation ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @js.native
  class SpyLocation ()
    extends typingsSlinky.angularCommon.angularCommonTestingMod.SpyLocation
  
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
}

