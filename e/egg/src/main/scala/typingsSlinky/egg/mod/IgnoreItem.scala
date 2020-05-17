package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * ctx * / typingsSlinky.egg.mod.Context, scala.Boolean]
*/
trait IgnoreItem extends IgnoreOrMatch

object IgnoreItem {
  @scala.inline
  implicit def apply(value: js.Function1[/* ctx */ Context, Boolean]): IgnoreItem = value.asInstanceOf[IgnoreItem]
  @scala.inline
  implicit def apply(value: js.RegExp): IgnoreItem = value.asInstanceOf[IgnoreItem]
  @scala.inline
  implicit def apply(value: String): IgnoreItem = value.asInstanceOf[IgnoreItem]
}

