package typingsSlinky.atAngularPlatformDashBrowserDashDynamic

import typingsSlinky.atAngularCore.atAngularCoreMod.CompilerFactory
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularCore.atAngularCoreMod.PlatformRef
import typingsSlinky.atAngularCore.atAngularCoreMod.StaticProvider
import typingsSlinky.atAngularCore.testingTestingMod.TestComponentRenderer
import typingsSlinky.atAngularCore.testingTestingMod.ɵTestingCompilerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class BrowserDynamicTestingModule () extends js.Object
  
  @js.native
  class ɵDOMTestComponentRenderer protected () extends TestComponentRenderer {
    def this(_doc: js.Any) = this()
    var _doc: js.Any = js.native
  }
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_testing_testing_b protected () extends ɵTestingCompilerFactory {
    def this(_injector: Injector, _compilerFactory: CompilerFactory) = this()
    var _compilerFactory: js.Any = js.native
    var _injector: js.Any = js.native
  }
  
  val ɵangular_packages_platform_browser_dynamic_testing_testing_a: js.Array[StaticProvider] = js.native
  def platformBrowserDynamicTesting(): PlatformRef = js.native
  def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(extraProviders: js.Array[_]): PlatformRef = js.native
}

