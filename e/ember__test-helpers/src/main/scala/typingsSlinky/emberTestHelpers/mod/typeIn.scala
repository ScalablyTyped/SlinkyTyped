package typingsSlinky.emberTestHelpers.mod

import typingsSlinky.emberTestHelpers.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers", "typeIn")
@js.native
object typeIn extends js.Object {
  def apply(target: Target, text: String): js.Promise[Unit] = js.native
  def apply(target: Target, text: String, options: Delay): js.Promise[Unit] = js.native
}

