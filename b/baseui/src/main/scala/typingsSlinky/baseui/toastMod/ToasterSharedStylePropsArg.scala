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

trait ToasterSharedStylePropsArg extends js.Object {
  @JSName("$placement")
  var $placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
}

object ToasterSharedStylePropsArg {
  @scala.inline
  def apply($placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null): ToasterSharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterSharedStylePropsArg]
  }
}

