package typingsSlinky.ink.focusMod

import slinky.core.facade.ReactElement
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: ReactElement = js.native
  
  var exitOnCtrlC: Boolean = js.native
  
  def onExit(): Unit = js.native
  def onExit(error: js.Error): Unit = js.native
  
  var stderr: WriteStream = js.native
  
  var stdin: ReadStream = js.native
  
  var stdout: WriteStream = js.native
  
  def writeToStderr(data: String): Unit = js.native
  
  def writeToStdout(data: String): Unit = js.native
}
