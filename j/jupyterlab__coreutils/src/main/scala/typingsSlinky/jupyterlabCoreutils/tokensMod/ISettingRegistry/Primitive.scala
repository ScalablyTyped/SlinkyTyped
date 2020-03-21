package typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The primitive types available in a JSON schema.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null`
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object`
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string
*/
trait Primitive extends js.Object

object Primitive {
  @scala.inline
  def array: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `null`: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.string = this.cast("string")
}

