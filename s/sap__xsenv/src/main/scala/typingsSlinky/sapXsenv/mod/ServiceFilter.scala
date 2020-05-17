package typingsSlinky.sapXsenv.mod

import typingsSlinky.sapXsenv.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.sapXsenv.anon.Label
  - js.Function1[/ * service * / js.Any, scala.Boolean]
*/
trait ServiceFilter extends js.Object

object ServiceFilter {
  @scala.inline
  implicit def apply(value: js.Function1[/* service */ js.Any, Boolean]): ServiceFilter = value.asInstanceOf[ServiceFilter]
  @scala.inline
  implicit def apply(value: Label): ServiceFilter = value.asInstanceOf[ServiceFilter]
  @scala.inline
  implicit def apply(value: String): ServiceFilter = value.asInstanceOf[ServiceFilter]
}

