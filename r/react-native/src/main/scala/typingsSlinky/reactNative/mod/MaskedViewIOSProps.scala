package typingsSlinky.reactNative.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedViewIOSProps extends ViewProps {
  var maskElement: ReactElement = js.native
}

object MaskedViewIOSProps {
  @scala.inline
  def apply(maskElement: ReactElement): MaskedViewIOSProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewIOSProps]
  }
  @scala.inline
  implicit class MaskedViewIOSPropsOps[Self <: MaskedViewIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaskElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

