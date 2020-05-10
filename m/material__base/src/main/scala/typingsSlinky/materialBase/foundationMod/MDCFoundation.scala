package typingsSlinky.materialBase.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFoundation[A] extends js.Object {
  // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
  def destroy(): Unit = js.native
  // Subclasses should override this method to perform initialization routines (registering events, etc.)
  def init(): Unit = js.native
}

object MDCFoundation {
  @scala.inline
  def apply[A](destroy: () => Unit, init: () => Unit): MDCFoundation[A] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[MDCFoundation[A]]
  }
  @scala.inline
  implicit class MDCFoundationOps[Self[a] <: MDCFoundation[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

