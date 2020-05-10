package typingsSlinky.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookOptions extends js.Object {
  /**
    * The function to be called after processing the CSS.
    */
  def post(): Unit = js.native
  /**
    * The function to be called before processing the CSS.
    */
  def pre(): Unit = js.native
}

object HookOptions {
  @scala.inline
  def apply(post: () => Unit, pre: () => Unit): HookOptions = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction0(post), pre = js.Any.fromFunction0(pre))
    __obj.asInstanceOf[HookOptions]
  }
  @scala.inline
  implicit class HookOptionsOps[Self <: HookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPost(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPre(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

