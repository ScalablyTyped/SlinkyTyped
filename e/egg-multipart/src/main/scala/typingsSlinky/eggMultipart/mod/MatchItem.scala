package typingsSlinky.eggMultipart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * ctx * / typingsSlinky.eggMultipart.mod.Context, scala.Boolean]
*/
trait MatchItem extends js.Object

object MatchItem {
  @scala.inline
  implicit def apply(value: js.Function1[/* ctx */ Context, Boolean]): MatchItem = value.asInstanceOf[MatchItem]
  @scala.inline
  implicit def apply(value: js.RegExp): MatchItem = value.asInstanceOf[MatchItem]
  @scala.inline
  implicit def apply(value: String): MatchItem = value.asInstanceOf[MatchItem]
}

