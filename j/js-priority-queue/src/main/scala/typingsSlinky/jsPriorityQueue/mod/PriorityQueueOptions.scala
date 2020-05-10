package typingsSlinky.jsPriorityQueue.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueueOptions[T] extends js.Object {
  /**
    * This is the argument we would pass to Array.prototype.sort
    */
  var comparator: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.native
  /**
    * You can also pass initial values, in any order.
    * With lots of values, it's faster to load them all at once than one at a time.
    */
  var initialValues: js.UndefOr[js.Array[T]] = js.native
  /**
    * According to JsPerf, the fastest strategy for most cases is BinaryHeapStrategy.
    * Only use ArrayStrategy only if you're queuing items in a very particular order.
    * Don't use BHeapStrategy, except as a lesson in how sometimes miracles in one programming language aren't great in other languages.
    */
  var strategy: js.UndefOr[
    Instantiable1[
      js.UndefOr[
        /* options */ PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
      ], 
      AbstractPriorityQueue[js.Object]
    ]
  ] = js.native
}

object PriorityQueueOptions {
  @scala.inline
  def apply[T](): PriorityQueueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityQueueOptions[T]]
  }
  @scala.inline
  implicit class PriorityQueueOptionsOps[Self[t] <: PriorityQueueOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComparator(value: (/* a */ T, /* b */ T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValues(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValues: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(
      value: Instantiable1[
          js.UndefOr[
            /* options */ PriorityQueueOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
          ], 
          AbstractPriorityQueue[js.Object]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

