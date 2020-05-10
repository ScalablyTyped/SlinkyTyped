package typingsSlinky.reactOutsideClickHandler.mod

import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultProps extends js.Object {
  var disabled: Boolean = js.native
  var display: block | flex | `inline` | `inline-block` | contents = js.native
  var useCapture: Boolean = js.native
}

object DefaultProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    display: block | flex | `inline` | `inline-block` | contents,
    useCapture: Boolean
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCapture")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

