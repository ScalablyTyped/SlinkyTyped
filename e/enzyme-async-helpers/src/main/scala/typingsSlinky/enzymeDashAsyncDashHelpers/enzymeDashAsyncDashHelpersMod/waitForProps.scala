package typingsSlinky.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.enzymeMod.ReactWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForProps")
@js.native
object waitForProps extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
}

