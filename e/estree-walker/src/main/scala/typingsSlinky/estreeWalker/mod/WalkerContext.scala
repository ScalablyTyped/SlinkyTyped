package typingsSlinky.estreeWalker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkerContext extends js.Object {
  def skip(): Unit = js.native
}

object WalkerContext {
  @scala.inline
  def apply(skip: () => Unit): WalkerContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip))
    __obj.asInstanceOf[WalkerContext]
  }
  @scala.inline
  implicit class WalkerContextOps[Self <: WalkerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

