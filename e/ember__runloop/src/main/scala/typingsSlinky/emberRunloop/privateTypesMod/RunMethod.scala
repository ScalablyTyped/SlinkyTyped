package typingsSlinky.emberRunloop.privateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.ThisFunction1[/ * this * / Target, / * repeated * / js.Any, Ret]
  - / * keyof Target * / java.lang.String
*/
trait RunMethod[Target, Ret] extends js.Object

object RunMethod {
  @scala.inline
  implicit def apply[Target, Ret](value: /* keyof Target */ String): RunMethod[Target, Ret] = value.asInstanceOf[RunMethod[Target, Ret]]
  @scala.inline
  implicit def apply[Target, Ret](value: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Ret]): RunMethod[Target, Ret] = value.asInstanceOf[RunMethod[Target, Ret]]
}

