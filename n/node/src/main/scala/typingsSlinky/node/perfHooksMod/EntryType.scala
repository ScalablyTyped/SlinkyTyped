package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.node
  - typingsSlinky.node.nodeStrings.mark
  - typingsSlinky.node.nodeStrings.measure
  - typingsSlinky.node.nodeStrings.gc
  - typingsSlinky.node.nodeStrings.function
  - typingsSlinky.node.nodeStrings.http2
  - typingsSlinky.node.nodeStrings.http
*/
trait EntryType extends js.Object

object EntryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typingsSlinky.node.nodeStrings.function = this.cast("function")
  @scala.inline
  def gc: typingsSlinky.node.nodeStrings.gc = this.cast("gc")
  @scala.inline
  def http: typingsSlinky.node.nodeStrings.http = this.cast("http")
  @scala.inline
  def http2: typingsSlinky.node.nodeStrings.http2 = this.cast("http2")
  @scala.inline
  def mark: typingsSlinky.node.nodeStrings.mark = this.cast("mark")
  @scala.inline
  def measure: typingsSlinky.node.nodeStrings.measure = this.cast("measure")
  @scala.inline
  def node: typingsSlinky.node.nodeStrings.node = this.cast("node")
}

