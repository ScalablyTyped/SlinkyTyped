package typingsSlinky.promiseDag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * repeated * / js.Any, js.Thenable[js.Any]]
*/
trait Step extends js.Object

object Step {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]): Step = value.asInstanceOf[Step]
  @scala.inline
  implicit def apply(value: String): Step = value.asInstanceOf[Step]
}

