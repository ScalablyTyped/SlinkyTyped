package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends js.Object {
  
  def debugLines(args: js.Any*): Unit = js.native
  
  def debugStack(err: js.Error): Unit = js.native
  def debugStack(err: js.Error, msg: String): Unit = js.native
  
  def errorLines(args: js.Any*): Unit = js.native
  
  def errorStack(err: js.Error): Unit = js.native
  def errorStack(err: js.Error, msg: String): Unit = js.native
  
  def infoLines(args: js.Any*): Unit = js.native
  
  def infoStack(err: js.Error): Unit = js.native
  def infoStack(err: js.Error, msg: String): Unit = js.native
  
  def logLines(args: js.Any*): Unit = js.native
  
  def warnLines(args: js.Any*): Unit = js.native
  
  def warnStack(err: js.Error): Unit = js.native
  def warnStack(err: js.Error, msg: String): Unit = js.native
}
