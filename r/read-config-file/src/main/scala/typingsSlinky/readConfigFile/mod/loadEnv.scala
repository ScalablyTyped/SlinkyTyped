package typingsSlinky.readConfigFile.mod

import typingsSlinky.dotenv.mod.DotenvParseOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", "loadEnv")
@js.native
object loadEnv extends js.Object {
  def apply(envFile: String): js.Promise[DotenvParseOutput | Null] = js.native
}

