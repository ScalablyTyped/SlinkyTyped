package typingsSlinky.naja.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.naja.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * event * / T, js.Promise[scala.Unit] | scala.Unit]
  - typingsSlinky.naja.anon.`0`[T]
*/
trait NajaEventListener[T /* <: Event */] extends js.Object

object NajaEventListener {
  @scala.inline
  implicit def apply[T](value: `0`[T]): NajaEventListener[T] = value.asInstanceOf[NajaEventListener[T]]
  @scala.inline
  implicit def apply[T](value: js.Function1[/* event */ T, js.Promise[Unit] | Unit]): NajaEventListener[T] = value.asInstanceOf[NajaEventListener[T]]
}

