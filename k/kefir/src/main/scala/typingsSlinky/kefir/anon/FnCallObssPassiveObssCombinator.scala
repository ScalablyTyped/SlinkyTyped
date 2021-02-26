package typingsSlinky.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssPassiveObssCombinator extends StObject {
  
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
