package typingsSlinky.baconjs.combinetemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - O
  - typingsSlinky.baconjs.combinetemplateMod.ArrayTemplate[js.Any]
  - typingsSlinky.baconjs.combinetemplateMod.ObjectTemplate[O]
*/
trait CombinedTemplate[O] extends js.Object

object CombinedTemplate {
  @scala.inline
  implicit def apply[O](value: ArrayTemplate[js.Any]): CombinedTemplate[O] = value.asInstanceOf[CombinedTemplate[O]]
  @scala.inline
  implicit def apply[O](value: O): CombinedTemplate[O] = value.asInstanceOf[CombinedTemplate[O]]
  @scala.inline
  implicit def apply[O](value: ObjectTemplate[O]): CombinedTemplate[O] = value.asInstanceOf[CombinedTemplate[O]]
}

