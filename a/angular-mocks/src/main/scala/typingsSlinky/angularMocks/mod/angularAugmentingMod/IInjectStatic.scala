package typingsSlinky.angularMocks.mod.angularAugmentingMod

import typingsSlinky.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://docs.angularjs.org/api/ngMock/function/angular.mock.inject
// Depending on context, it might return a function, however having `void | (() => void)`
// as a return type seems to be not useful. E.g. it requires type assertions in `beforeEach(inject(...))`.
@js.native
trait IInjectStatic extends js.Object {
  
  def apply(fns: (Injectable[js.Function1[/* repeated */ _, Unit]])*): js.Any = js.native
  
   // void | (() => void);
  def strictDi(): js.Any = js.native
  def strictDi(`val`: Boolean): js.Any = js.native
}
