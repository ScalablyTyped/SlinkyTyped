package typingsSlinky.graphqlDashTools

import typingsSlinky.graphqlDashTools.distInterfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/Logger", JSImport.Namespace)
@js.native
object distLoggerMod extends js.Object {
  @js.native
  class Logger () extends ILogger {
    def this(name: String) = this()
    def this(name: String, callback: js.Function) = this()
    var callback: js.Any = js.native
    var errors: js.Array[js.Error] = js.native
    var name: String = js.native
    def printAllErrors(): String = js.native
    def printOneError(e: js.Error): String = js.native
  }
  
}

