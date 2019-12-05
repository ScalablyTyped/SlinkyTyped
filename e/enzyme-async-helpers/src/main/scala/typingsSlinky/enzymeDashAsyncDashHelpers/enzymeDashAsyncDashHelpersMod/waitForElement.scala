package typingsSlinky.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.enzymeMod.EnzymeSelector
import typingsSlinky.enzyme.enzymeMod.ReactWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForElement")
@js.native
object waitForElement extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    elementSelector: EnzymeSelector
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]],
    elementSelector: EnzymeSelector,
    config: Config
  ): js.Promise[Unit] = js.native
}

