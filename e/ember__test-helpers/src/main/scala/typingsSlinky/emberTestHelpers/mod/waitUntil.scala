package typingsSlinky.emberTestHelpers.mod

import typingsSlinky.emberTestHelpers.waitUntilMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers", "waitUntil")
@js.native
object waitUntil extends js.Object {
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: Options): js.Promise[T] = js.native
}

