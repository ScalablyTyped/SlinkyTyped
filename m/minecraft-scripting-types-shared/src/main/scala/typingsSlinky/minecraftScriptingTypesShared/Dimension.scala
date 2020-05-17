package typingsSlinky.minecraftScriptingTypesShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesShared.MinecraftDimension
  - java.lang.String
*/
trait Dimension extends js.Object

object Dimension {
  @scala.inline
  implicit def apply(value: MinecraftDimension): Dimension = value.asInstanceOf[Dimension]
  @scala.inline
  implicit def apply(value: String): Dimension = value.asInstanceOf[Dimension]
}

