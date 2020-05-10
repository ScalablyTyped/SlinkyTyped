package typingsSlinky.baseui.toastMod

import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToasterSharedStylePropsArg extends js.Object {
  @JSName("$placement")
  var $placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
}

object ToasterSharedStylePropsArg {
  @scala.inline
  def apply(): ToasterSharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToasterSharedStylePropsArg]
  }
  @scala.inline
  implicit class ToasterSharedStylePropsArgOps[Self <: ToasterSharedStylePropsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$placement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$placement")(js.undefined)
        ret
    }
  }
  
}

