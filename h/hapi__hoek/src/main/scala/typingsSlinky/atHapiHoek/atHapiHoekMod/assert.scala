package typingsSlinky.atHapiHoek.atHapiHoekMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "assert")
@js.native
object assert extends js.Object {
  def apply(condition: Boolean, message: String): Unit | js.Error = js.native
  def apply(condition: Boolean, message: Error): Unit | js.Error = js.native
}

