package typingsSlinky.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenPlugin extends js.Object {
  def activate(plugins: js.Array[_]): Boolean = js.native
}

object TweenPlugin {
  @scala.inline
  def apply(activate: js.Array[_] => Boolean): TweenPlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate))
    __obj.asInstanceOf[TweenPlugin]
  }
  @scala.inline
  implicit class TweenPluginOps[Self <: TweenPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: js.Array[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

