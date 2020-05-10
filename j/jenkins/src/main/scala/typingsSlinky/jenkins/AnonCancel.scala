package typingsSlinky.jenkins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancel extends js.Object {
  def cancel(n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def item(n: Double, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def list(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
}

object AnonCancel {
  @scala.inline
  def apply(
    cancel: (Double, js.Function1[/* err */ js.Error, Unit]) => Unit,
    item: (Double, js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]) => Unit,
    list: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Unit
  ): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction2(cancel), item = js.Any.fromFunction2(item), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnonCancel]
  }
  @scala.inline
  implicit class AnonCancelOps[Self <: AnonCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: (Double, js.Function1[/* err */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItem(value: (Double, js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

