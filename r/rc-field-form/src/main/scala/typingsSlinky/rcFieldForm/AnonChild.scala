package typingsSlinky.rcFieldForm

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChild extends js.Object {
  var child: TagMod[Any] = js.native
  var isFunction: Boolean = js.native
}

object AnonChild {
  @scala.inline
  def apply(isFunction: Boolean): AnonChild = {
    val __obj = js.Dynamic.literal(isFunction = isFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChild]
  }
  @scala.inline
  implicit class AnonChildOps[Self <: AnonChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
  }
  
}

