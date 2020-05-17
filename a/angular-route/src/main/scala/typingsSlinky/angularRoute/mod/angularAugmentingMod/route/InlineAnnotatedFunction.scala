package typingsSlinky.angularRoute.mod.angularAugmentingMod.route

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angular.mod.global.Function
  - js.Array[java.lang.String | typingsSlinky.angular.mod.global.Function]
*/
trait InlineAnnotatedFunction extends js.Object

object InlineAnnotatedFunction {
  @scala.inline
  implicit def apply(value: js.Array[String | Function]): InlineAnnotatedFunction = value.asInstanceOf[InlineAnnotatedFunction]
  @scala.inline
  implicit def apply(value: Function): InlineAnnotatedFunction = value.asInstanceOf[InlineAnnotatedFunction]
}

