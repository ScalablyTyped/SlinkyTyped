package typingsSlinky.nodeAbi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeAbi.nodeAbiStrings.electron
  - typingsSlinky.nodeAbi.nodeAbiStrings.node
  - typingsSlinky.nodeAbi.nodeAbiStrings.`node-webkit`
*/
trait Runtime extends js.Object

object Runtime {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def electron: typingsSlinky.nodeAbi.nodeAbiStrings.electron = this.cast("electron")
  @scala.inline
  def node: typingsSlinky.nodeAbi.nodeAbiStrings.node = this.cast("node")
  @scala.inline
  def `node-webkit`: typingsSlinky.nodeAbi.nodeAbiStrings.`node-webkit` = this.cast("node-webkit")
}

