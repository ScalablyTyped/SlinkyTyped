package typingsSlinky.baconjs.whenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.whenMod.Pattern1[js.Any, O]
  - typingsSlinky.baconjs.whenMod.Pattern2[js.Any, js.Any, O]
  - typingsSlinky.baconjs.whenMod.Pattern3[js.Any, js.Any, js.Any, O]
  - typingsSlinky.baconjs.whenMod.Pattern4[js.Any, js.Any, js.Any, js.Any, O]
  - typingsSlinky.baconjs.whenMod.Pattern5[js.Any, js.Any, js.Any, js.Any, js.Any, O]
  - typingsSlinky.baconjs.whenMod.Pattern6[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, O]
  - typingsSlinky.baconjs.whenMod.RawPattern
*/
trait Pattern[O] extends js.Object

object Pattern {
  @scala.inline
  implicit def apply[O](value: (Pattern1[js.Any, O]) | RawPattern): Pattern[O] = value.asInstanceOf[Pattern[O]]
  @scala.inline
  implicit def apply[O](value: Pattern2[js.Any, js.Any, O]): Pattern[O] = value.asInstanceOf[Pattern[O]]
  @scala.inline
  implicit def apply[O](value: Pattern3[js.Any, js.Any, js.Any, O]): Pattern[O] = value.asInstanceOf[Pattern[O]]
  @scala.inline
  implicit def apply[O](value: Pattern4[js.Any, js.Any, js.Any, js.Any, O]): Pattern[O] = value.asInstanceOf[Pattern[O]]
  @scala.inline
  implicit def apply[O](value: Pattern5[js.Any, js.Any, js.Any, js.Any, js.Any, O]): Pattern[O] = value.asInstanceOf[Pattern[O]]
  @scala.inline
  implicit def apply[O](value: Pattern6[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, O]): Pattern[O] = value.asInstanceOf[Pattern[O]]
}

