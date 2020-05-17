package typingsSlinky.react.mod

import typingsSlinky.react.anon.RefExclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Ensures that the props do not include string ref, which cannot be forwarded */
/* Rewritten from type alias, can be one of: 
  - P
  - typingsSlinky.react.mod.PropsWithoutRef[P] with typingsSlinky.react.anon.RefExclude
*/
trait PropsWithRef[P]
  extends ComponentPropsWithRef[js.Any]

object PropsWithRef {
  @scala.inline
  implicit def apply[P](value: PropsWithoutRef[P] with RefExclude): PropsWithRef[P] = value.asInstanceOf[PropsWithRef[P]]
  @scala.inline
  implicit def apply[P](value: P): PropsWithRef[P] = value.asInstanceOf[PropsWithRef[P]]
}

