package typingsSlinky.formik.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayHelpers extends js.Object {
  def handleInsert(index: Double, value: js.Any): js.Function0[Unit] = js.native
  def handleMove(from: Double, to: Double): js.Function0[Unit] = js.native
  def handlePop(): js.Function0[Unit] = js.native
  def handlePush(obj: js.Any): js.Function0[Unit] = js.native
  def handleRemove(index: Double): js.Function0[Unit] = js.native
  def handleReplace(index: Double, value: js.Any): js.Function0[Unit] = js.native
  def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit] = js.native
  def handleUnshift(value: js.Any): js.Function0[Unit] = js.native
  def insert(index: Double, value: js.Any): Unit = js.native
  def move(from: Double, to: Double): Unit = js.native
  def pop[T](): js.UndefOr[T] = js.native
  def push(obj: js.Any): Unit = js.native
  def remove[T](index: Double): js.UndefOr[T] = js.native
  def replace(index: Double, value: js.Any): Unit = js.native
  def swap(indexA: Double, indexB: Double): Unit = js.native
  def unshift(value: js.Any): Double = js.native
}

object ArrayHelpers {
  @scala.inline
  def apply(
    handleInsert: (Double, js.Any) => js.Function0[Unit],
    handleMove: (Double, Double) => js.Function0[Unit],
    handlePop: () => js.Function0[Unit],
    handlePush: js.Any => js.Function0[Unit],
    handleRemove: Double => js.Function0[Unit],
    handleReplace: (Double, js.Any) => js.Function0[Unit],
    handleSwap: (Double, Double) => js.Function0[Unit],
    handleUnshift: js.Any => js.Function0[Unit],
    insert: (Double, js.Any) => Unit,
    move: (Double, Double) => Unit,
    pop: () => js.UndefOr[js.Any],
    push: js.Any => Unit,
    remove: Double => js.UndefOr[js.Any],
    replace: (Double, js.Any) => Unit,
    swap: (Double, Double) => Unit,
    unshift: js.Any => Double
  ): ArrayHelpers = {
    val __obj = js.Dynamic.literal(handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[ArrayHelpers]
  }
  @scala.inline
  implicit class ArrayHelpersOps[Self <: ArrayHelpers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleInsert(value: (Double, js.Any) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleMove(value: (Double, Double) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandlePop(value: () => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandlePush(value: js.Any => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleRemove(value: Double => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleReplace(value: (Double, js.Any) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReplace")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleSwap(value: (Double, Double) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSwap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleUnshift(value: js.Any => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUnshift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMove(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => js.UndefOr[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplace(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSwap(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnshift(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

