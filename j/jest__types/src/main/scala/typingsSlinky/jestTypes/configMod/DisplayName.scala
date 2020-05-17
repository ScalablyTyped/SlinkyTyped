package typingsSlinky.jestTypes.configMod

import typingsSlinky.jestTypes.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.jestTypes.anon.Color
*/
trait DisplayName extends js.Object

object DisplayName {
  @scala.inline
  implicit def apply(value: Color): DisplayName = value.asInstanceOf[DisplayName]
  @scala.inline
  implicit def apply(value: String): DisplayName = value.asInstanceOf[DisplayName]
}

