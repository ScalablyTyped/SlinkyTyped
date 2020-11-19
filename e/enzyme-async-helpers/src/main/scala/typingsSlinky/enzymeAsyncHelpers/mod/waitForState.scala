package typingsSlinky.enzymeAsyncHelpers.mod

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.mod.ReactWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme-async-helpers", "waitForState")
@js.native
object waitForState extends js.Object {
  
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
}
