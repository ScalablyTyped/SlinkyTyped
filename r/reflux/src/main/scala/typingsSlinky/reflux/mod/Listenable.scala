package typingsSlinky.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listenable extends js.Object {
  var listen: ListenFn = js.native
}

object Listenable {
  @scala.inline
  def apply(listen: ListenFn): Listenable = {
    val __obj = js.Dynamic.literal(listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listenable]
  }
  @scala.inline
  implicit class ListenableOps[Self <: Listenable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListen(value: ListenFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

