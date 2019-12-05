package typingsSlinky.easyDashXDashHeaders.fsMod

import typingsSlinky.easyDashXDashHeaders.Anon_Encoding
import typingsSlinky.easyDashXDashHeaders.Anon_Flag
import typingsSlinky.easyDashXDashHeaders.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(filename: String): Buffer = js.native
  def apply(filename: String, encoding: String): String = js.native
  def apply(filename: String, options: Anon_Encoding): String = js.native
  def apply(filename: String, options: Anon_Flag): Buffer = js.native
}

