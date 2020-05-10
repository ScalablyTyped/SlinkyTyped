package typingsSlinky.collections.sortedSetMod.internal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node[T] extends js.Object {
  def checkIntegrity(plus: js.Any*): Double = js.native
  def getNext(plus: js.Any*): js.UndefOr[Node[T]] = js.native
  def getPrevious(plus: js.Any*): js.UndefOr[Node[T]] = js.native
  def log(charmap: js.Any, logNode: js.Any, log: js.Any, logAbove: js.Any): js.Any = js.native
  def reduce(
    cb: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    index: Double,
    thisp: js.Any,
    tree: js.Any,
    depth: Double
  ): js.Any = js.native
  def summary(plus: js.Any*): String = js.native
  def touch(plus: js.Any*): Unit = js.native
}

object Node {
  @scala.inline
  def apply[T](
    checkIntegrity: /* repeated */ js.Any => Double,
    getNext: /* repeated */ js.Any => js.UndefOr[Node[T]],
    getPrevious: /* repeated */ js.Any => js.UndefOr[Node[T]],
    log: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    reduce: (js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ], js.Any, Double, js.Any, js.Any, Double) => js.Any,
    summary: /* repeated */ js.Any => String,
    touch: /* repeated */ js.Any => Unit
  ): Node[T] = {
    val __obj = js.Dynamic.literal(checkIntegrity = js.Any.fromFunction1(checkIntegrity), getNext = js.Any.fromFunction1(getNext), getPrevious = js.Any.fromFunction1(getPrevious), log = js.Any.fromFunction4(log), reduce = js.Any.fromFunction6(reduce), summary = js.Any.fromFunction1(summary), touch = js.Any.fromFunction1(touch))
    __obj.asInstanceOf[Node[T]]
  }
  @scala.inline
  implicit class NodeOps[Self[t] <: Node[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCheckIntegrity(value: /* repeated */ js.Any => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIntegrity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNext(value: /* repeated */ js.Any => js.UndefOr[Node[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPrevious(value: /* repeated */ js.Any => js.UndefOr[Node[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevious")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withReduce(
      value: (js.Function4[
          /* result */ js.UndefOr[js.Any], 
          /* val */ js.UndefOr[js.Any], 
          /* key */ js.UndefOr[js.Any], 
          /* collection */ js.UndefOr[js.Any], 
          _
        ], js.Any, Double, js.Any, js.Any, Double) => js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withSummary(value: /* repeated */ js.Any => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouch(value: /* repeated */ js.Any => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

