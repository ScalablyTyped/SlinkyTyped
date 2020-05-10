package typingsSlinky.kefir

import typingsSlinky.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAp extends js.Object {
  def ap[A, B, E1, E2](obsF: Observable[js.Function1[/* x */ A, B], E1], obsV: Observable[A, E2]): Observable[B, E1 | E2] = js.native
  def bimap[V1, E1, V2, E2](fnE: js.Function1[/* x */ E1, E2], fnV: js.Function1[/* x */ V1, V2], obs: Observable[V1, E1]): Observable[V2, E2] = js.native
  def chain[V, V2, E, E2](cb: js.Function1[/* value */ V, Observable[V2, E2]], s: Observable[V, E]): Observable[V2, E | E2] = js.native
  def concat[V1, E1, V2, E2](obs1: Observable[V1, E1], obs2: Observable[V2, E2]): Observable[V1 | V2, E1 | E2] = js.native
  def empty(): Observable[scala.Nothing, scala.Nothing] = js.native
  def map[V, V2, E](cb: js.Function1[/* value */ V, V2], s: Observable[V, E]): Observable[V2, E] = js.native
  def of[V](value: V): Observable[V, scala.Nothing] = js.native
}

object AnonAp {
  @scala.inline
  def apply(
    ap: (Observable[js.Function1[js.Any, js.Any], js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any],
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any],
    chain: (js.Function1[js.Any, Observable[js.Any, js.Any]], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any],
    concat: (Observable[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any],
    empty: () => Observable[scala.Nothing, scala.Nothing],
    map: (js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any],
    of: js.Any => Observable[js.Any, scala.Nothing]
  ): AnonAp = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), concat = js.Any.fromFunction2(concat), empty = js.Any.fromFunction0(empty), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[AnonAp]
  }
  @scala.inline
  implicit class AnonApOps[Self <: AnonAp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAp(
      value: (Observable[js.Function1[js.Any, js.Any], js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBimap(
      value: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bimap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withChain(
      value: (js.Function1[js.Any, Observable[js.Any, js.Any]], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConcat(value: (Observable[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Observable[scala.Nothing, scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMap(value: (js.Function1[js.Any, js.Any], Observable[js.Any, js.Any]) => Observable[js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOf(value: js.Any => Observable[js.Any, scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

