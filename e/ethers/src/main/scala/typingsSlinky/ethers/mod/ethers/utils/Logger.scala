package typingsSlinky.ethers.mod.ethers.utils

import typingsSlinky.ethersprojectLogger.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.Logger")
@js.native
class Logger protected ()
  extends typingsSlinky.ethers.ethersMod.utils.Logger {
  def this(version: String) = this()
}
/* static members */
@JSImport("ethers", "ethers.utils.Logger")
@js.native
object Logger extends js.Object {
  
  var errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any = js.native
  
  def from(version: String): typingsSlinky.ethersprojectLogger.mod.Logger = js.native
  
  def globalLogger(): typingsSlinky.ethersprojectLogger.mod.Logger = js.native
  
  var levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any = js.native
  
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}
