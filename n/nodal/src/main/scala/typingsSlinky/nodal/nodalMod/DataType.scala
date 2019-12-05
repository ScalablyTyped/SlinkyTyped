package typingsSlinky.nodal.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodal.nodalStrings.serial
  - typings.nodal.nodalStrings.int
  - typings.nodal.nodalStrings.currency
  - typings.nodal.nodalStrings.float
  - typings.nodal.nodalStrings.string
  - typings.nodal.nodalStrings.text
  - typings.nodal.nodalStrings.datetime
  - typings.nodal.nodalStrings.boolean
  - typings.nodal.nodalStrings.json
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

