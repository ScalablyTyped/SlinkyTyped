package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.call
  - typingsSlinky.fridaGum.fridaGumStrings.ret
  - typingsSlinky.fridaGum.fridaGumStrings.exec
  - typingsSlinky.fridaGum.fridaGumStrings.block
  - typingsSlinky.fridaGum.fridaGumStrings.compile
*/
trait StalkerEventType extends js.Object

object StalkerEventType {
  @scala.inline
  def block: typingsSlinky.fridaGum.fridaGumStrings.block = this.cast("block")
  @scala.inline
  def call: typingsSlinky.fridaGum.fridaGumStrings.call = this.cast("call")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compile: typingsSlinky.fridaGum.fridaGumStrings.compile = this.cast("compile")
  @scala.inline
  def exec: typingsSlinky.fridaGum.fridaGumStrings.exec = this.cast("exec")
  @scala.inline
  def ret: typingsSlinky.fridaGum.fridaGumStrings.ret = this.cast("ret")
}

