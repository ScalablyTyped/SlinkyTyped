package typingsSlinky.reactSizeme.mod

import typingsSlinky.reactSizeme.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithSizeProps extends js.Object {
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.native
}

object WithSizeProps {
  @scala.inline
  def apply(): WithSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithSizeProps]
  }
  @scala.inline
  implicit class WithSizePropsOps[Self <: WithSizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSize(value: /* size */ AnonHeight => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSize")(js.undefined)
        ret
    }
  }
  
}

