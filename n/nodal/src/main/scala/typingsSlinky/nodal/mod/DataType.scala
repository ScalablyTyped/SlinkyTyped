package typingsSlinky.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodal.nodalStrings.serial
  - typingsSlinky.nodal.nodalStrings.int
  - typingsSlinky.nodal.nodalStrings.currency
  - typingsSlinky.nodal.nodalStrings.float
  - typingsSlinky.nodal.nodalStrings.string
  - typingsSlinky.nodal.nodalStrings.text
  - typingsSlinky.nodal.nodalStrings.datetime
  - typingsSlinky.nodal.nodalStrings.boolean
  - typingsSlinky.nodal.nodalStrings.json
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def boolean: typingsSlinky.nodal.nodalStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currency: typingsSlinky.nodal.nodalStrings.currency = this.cast("currency")
  @scala.inline
  def datetime: typingsSlinky.nodal.nodalStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typingsSlinky.nodal.nodalStrings.float = this.cast("float")
  @scala.inline
  def int: typingsSlinky.nodal.nodalStrings.int = this.cast("int")
  @scala.inline
  def json: typingsSlinky.nodal.nodalStrings.json = this.cast("json")
  @scala.inline
  def serial: typingsSlinky.nodal.nodalStrings.serial = this.cast("serial")
  @scala.inline
  def string: typingsSlinky.nodal.nodalStrings.string = this.cast("string")
  @scala.inline
  def text: typingsSlinky.nodal.nodalStrings.text = this.cast("text")
}

