package typingsSlinky.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.`object`
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.integer
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.string
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.array
  - typingsSlinky.googleapisCommon.googleapisCommonStrings.boolean
*/
trait SchemaType extends js.Object

object SchemaType {
  @scala.inline
  def array: typingsSlinky.googleapisCommon.googleapisCommonStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.googleapisCommon.googleapisCommonStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.googleapisCommon.googleapisCommonStrings.integer = this.cast("integer")
  @scala.inline
  def `object`: typingsSlinky.googleapisCommon.googleapisCommonStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.googleapisCommon.googleapisCommonStrings.string = this.cast("string")
}

