package typingsSlinky.reactPopperTooltip.typesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactPopperTooltip.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * element * / typingsSlinky.std.HTMLElement | scala.Null, scala.Unit]
  - typingsSlinky.reactPopperTooltip.anon.Current
  - scala.Null
*/
trait Ref extends js.Object

object Ref {
  @scala.inline
  implicit def apply(value: Current): Ref = value.asInstanceOf[Ref]
  @scala.inline
  implicit def apply(value: js.Function1[/* element */ HTMLElement | Null, Unit]): Ref = value.asInstanceOf[Ref]
  @scala.inline
  implicit def apply(value: Null): Ref = value.asInstanceOf[Ref]
}

