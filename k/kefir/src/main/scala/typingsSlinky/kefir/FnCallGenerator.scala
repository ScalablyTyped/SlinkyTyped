package typingsSlinky.kefir

import typingsSlinky.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallGenerator extends js.Object {
  def apply[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
}

