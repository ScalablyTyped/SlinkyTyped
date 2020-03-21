package typingsSlinky.astTypes

import typingsSlinky.astTypes.typesMod.Def
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDef extends js.Object {
  def `def`(typeName: String): Def[_] = js.native
  def from[T](value: js.Any): Type[T] = js.native
  def from[T](value: js.Any, name: String): Type[T] = js.native
  def hasDef(typeName: String): Boolean = js.native
  def or(types: js.Any*): Type[_] = js.native
}

