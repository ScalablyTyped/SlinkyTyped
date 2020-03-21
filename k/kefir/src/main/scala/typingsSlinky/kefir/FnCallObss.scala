package typingsSlinky.kefir

import typingsSlinky.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObss extends js.Object {
  def apply[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
}

