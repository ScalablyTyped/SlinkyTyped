package typingsSlinky.revalidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * field * / js.Any, js.Any]
  - java.lang.String
*/
trait MessageCreator extends js.Object

object MessageCreator {
  @scala.inline
  implicit def apply(value: js.Function1[/* field */ js.Any, js.Any]): MessageCreator = value.asInstanceOf[MessageCreator]
  @scala.inline
  implicit def apply(value: String): MessageCreator = value.asInstanceOf[MessageCreator]
}

