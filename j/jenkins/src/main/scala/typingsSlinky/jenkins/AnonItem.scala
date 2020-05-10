package typingsSlinky.jenkins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItem extends js.Object {
  def cancel(n: Double): js.Promise[Unit] = js.native
  def item(n: Double): js.Promise[_] = js.native
  def list(): js.Promise[_] = js.native
}

object AnonItem {
  @scala.inline
  def apply(cancel: Double => js.Promise[Unit], item: Double => js.Promise[_], list: () => js.Promise[_]): AnonItem = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), item = js.Any.fromFunction1(item), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[AnonItem]
  }
  @scala.inline
  implicit class AnonItemOps[Self <: AnonItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Double => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

