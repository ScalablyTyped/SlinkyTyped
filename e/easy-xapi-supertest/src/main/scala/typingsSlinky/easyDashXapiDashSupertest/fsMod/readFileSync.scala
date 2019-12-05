package typingsSlinky.easyDashXapiDashSupertest.fsMod

import typingsSlinky.easyDashXapiDashSupertest.Anon_Encoding
import typingsSlinky.easyDashXapiDashSupertest.Anon_Flag
import typingsSlinky.easyDashXapiDashSupertest.Buffer
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

