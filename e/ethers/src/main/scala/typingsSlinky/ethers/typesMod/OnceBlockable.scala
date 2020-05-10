package typingsSlinky.ethers.typesMod

import typingsSlinky.ethers.ethersStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnceBlockable extends js.Object {
  @JSName("once")
  def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
}

object OnceBlockable {
  @scala.inline
  def apply(once: (block, js.Function0[Unit]) => Unit): OnceBlockable = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[OnceBlockable]
  }
  @scala.inline
  implicit class OnceBlockableOps[Self <: OnceBlockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnce(value: (block, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

