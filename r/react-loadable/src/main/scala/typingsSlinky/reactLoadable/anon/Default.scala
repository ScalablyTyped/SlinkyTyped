package typingsSlinky.reactLoadable.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default[Props] extends js.Object {
  var default: ReactComponentClass[Props] = js.native
}

object Default {
  @scala.inline
  def apply[Props](default: ReactComponentClass[Props]): Default[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[Props]]
  }
  @scala.inline
  implicit class DefaultOps[Self[props] <: Default[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withDefault(value: ReactComponentClass[Props]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

