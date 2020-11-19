package typingsSlinky.jest.mod.jest

import typingsSlinky.jest.anon.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "jest.doMock")
@js.native
object doMock extends js.Object {
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def apply(moduleName: String): Typeofjest = js.native
  def apply(moduleName: String, factory: js.UndefOr[scala.Nothing], options: MockOptions): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_]): Typeofjest = js.native
  def apply(moduleName: String, factory: js.Function0[_], options: MockOptions): Typeofjest = js.native
}
