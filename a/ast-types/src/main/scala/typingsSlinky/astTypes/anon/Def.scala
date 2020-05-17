package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Def extends js.Object {
  def `def`(typeName: String): typingsSlinky.astTypes.typesMod.Def[_] = js.native
  def from[T](value: js.Any): Type[T] = js.native
  def from[T](value: js.Any, name: String): Type[T] = js.native
  def hasDef(typeName: String): Boolean = js.native
  def or(types: js.Any*): Type[_] = js.native
}

