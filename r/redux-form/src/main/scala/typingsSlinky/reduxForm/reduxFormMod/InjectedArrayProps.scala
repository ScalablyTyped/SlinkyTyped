package typingsSlinky.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedArrayProps extends js.Object {
  def insert(field: String, index: Double, value: js.Any): Unit = js.native
  def move(field: String, from: Double, to: Double): Unit = js.native
  def pop(field: String): Unit = js.native
  def push(field: String, value: js.Any): Unit = js.native
  def remove(field: String, index: Double): Unit = js.native
  def removeAll(field: String): Unit = js.native
  def shift(field: String): Unit = js.native
  def splice(field: String, index: Double, removeNum: Double, value: js.Any): Unit = js.native
  def swap(field: String, indexA: Double, indexB: Double): Unit = js.native
  def unshift(field: String, value: js.Any): Unit = js.native
}

object InjectedArrayProps {
  @scala.inline
  def apply(
    insert: (String, Double, js.Any) => Unit,
    move: (String, Double, Double) => Unit,
    pop: String => Unit,
    push: (String, js.Any) => Unit,
    remove: (String, Double) => Unit,
    removeAll: String => Unit,
    shift: String => Unit,
    splice: (String, Double, Double, js.Any) => Unit,
    swap: (String, Double, Double) => Unit,
    unshift: (String, js.Any) => Unit
  ): InjectedArrayProps = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction3(insert), move = js.Any.fromFunction3(move), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction2(push), remove = js.Any.fromFunction2(remove), removeAll = js.Any.fromFunction1(removeAll), shift = js.Any.fromFunction1(shift), splice = js.Any.fromFunction4(splice), swap = js.Any.fromFunction3(swap), unshift = js.Any.fromFunction2(unshift))
    __obj.asInstanceOf[InjectedArrayProps]
  }
  @scala.inline
  implicit class InjectedArrayPropsOps[Self <: InjectedArrayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: (String, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMove(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPop(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPush(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAll(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShift(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplice(value: (String, Double, Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSwap(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnshift(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

