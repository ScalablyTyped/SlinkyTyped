package typingsSlinky.reactRte.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - typingsSlinky.reactRte.mod.CustControlFunc
*/
trait CustomControl extends js.Object

object CustomControl {
  @scala.inline
  implicit def apply(value: CustControlFunc): CustomControl = value.asInstanceOf[CustomControl]
  @scala.inline
  implicit def apply(value: TagMod[Any]): CustomControl = value.asInstanceOf[CustomControl]
}

