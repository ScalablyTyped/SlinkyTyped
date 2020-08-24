package typingsSlinky.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObssPassiveObssCombinator extends js.Object {
  def apply[T, S, U](obss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]]): typingsSlinky.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]],
    passiveObss: js.UndefOr[scala.Nothing],
    combinator: js.Function1[/* repeated */ T, U]
  ): typingsSlinky.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]]
  ): typingsSlinky.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typingsSlinky.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): typingsSlinky.kefir.mod.Observable[U, S] = js.native
}

