package typingsSlinky.ink.appMod

import slinky.core.facade.ReactElement
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  val children: ReactElement = js.native
  val exitOnCtrlC: Boolean = js.native
  val stderr: WriteStream = js.native
  val stdin: ReadStream = js.native
  val stdout: WriteStream = js.native
  def onExit(): Unit = js.native
  def onExit(error: js.Error): Unit = js.native
  def writeToStderr(data: String): Unit = js.native
  def writeToStdout(data: String): Unit = js.native
}

