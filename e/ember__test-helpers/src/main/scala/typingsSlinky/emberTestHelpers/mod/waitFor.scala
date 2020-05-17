package typingsSlinky.emberTestHelpers.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.emberTestHelpers.waitForMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers", "waitFor")
@js.native
object waitFor extends js.Object {
  def apply(selector: String): js.Promise[Element | js.Array[Element]] = js.native
  def apply(selector: String, options: Options): js.Promise[Element | js.Array[Element]] = js.native
}

