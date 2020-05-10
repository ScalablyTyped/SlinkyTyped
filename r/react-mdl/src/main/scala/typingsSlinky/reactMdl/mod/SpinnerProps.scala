package typingsSlinky.reactMdl.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var singleColor: js.UndefOr[Boolean] = js.native
}

object SpinnerProps {
  @scala.inline
  def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  @scala.inline
  implicit class SpinnerPropsOps[Self <: SpinnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSingleColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColor")(js.undefined)
        ret
    }
  }
  
}

