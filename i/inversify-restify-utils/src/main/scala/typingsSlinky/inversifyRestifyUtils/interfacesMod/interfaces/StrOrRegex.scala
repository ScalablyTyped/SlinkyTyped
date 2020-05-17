package typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait StrOrRegex extends RouteOptions

object StrOrRegex {
  @scala.inline
  implicit def apply(value: js.RegExp): StrOrRegex = value.asInstanceOf[StrOrRegex]
  @scala.inline
  implicit def apply(value: String): StrOrRegex = value.asInstanceOf[StrOrRegex]
}

