package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.mod.ethers.utils.Logger
import typingsSlinky.ethersprojectLogger.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLogger extends Instantiable1[/* version */ String, Logger] {
  
  var errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any = js.native
  
  def from(version: String): typingsSlinky.ethersprojectLogger.mod.Logger = js.native
  
  def globalLogger(): typingsSlinky.ethersprojectLogger.mod.Logger = js.native
  
  var levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any = js.native
  
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}
