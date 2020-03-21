package typingsSlinky.enzymeAsyncHelpers.mod

import slinky.core.ReactComponentClass
import typingsSlinky.enzyme.mod.EnzymeSelector
import typingsSlinky.enzyme.mod.ReactWrapper
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

