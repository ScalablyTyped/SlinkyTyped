package typingsSlinky.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.special
  - typingsSlinky.node.nodeStrings.number
  - typingsSlinky.node.nodeStrings.bigint
  - typingsSlinky.node.nodeStrings.boolean
  - typingsSlinky.node.nodeStrings.undefined
  - typingsSlinky.node.nodeStrings.`null`
  - typingsSlinky.node.nodeStrings.string
  - typingsSlinky.node.nodeStrings.symbol
  - typingsSlinky.node.nodeStrings.date
  - typingsSlinky.node.nodeStrings.regexp
  - typingsSlinky.node.nodeStrings.module
*/
trait Style extends js.Object

object Style {
  @scala.inline
  def bigint: typingsSlinky.node.nodeStrings.bigint = this.cast("bigint")
  @scala.inline
  def boolean: typingsSlinky.node.nodeStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.node.nodeStrings.date = this.cast("date")
  @scala.inline
  def module: typingsSlinky.node.nodeStrings.module = this.cast("module")
  @scala.inline
  def `null`: typingsSlinky.node.nodeStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.node.nodeStrings.number = this.cast("number")
  @scala.inline
  def regexp: typingsSlinky.node.nodeStrings.regexp = this.cast("regexp")
  @scala.inline
  def special: typingsSlinky.node.nodeStrings.special = this.cast("special")
  @scala.inline
  def string: typingsSlinky.node.nodeStrings.string = this.cast("string")
  @scala.inline
  def symbol: typingsSlinky.node.nodeStrings.symbol = this.cast("symbol")
  @scala.inline
  def undefined: typingsSlinky.node.nodeStrings.undefined = this.cast("undefined")
}

