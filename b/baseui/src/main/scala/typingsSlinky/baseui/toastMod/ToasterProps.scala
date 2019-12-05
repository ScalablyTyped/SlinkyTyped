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

trait ToasterProps extends js.Object {
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[ToasterOverrides] = js.undefined
  var placement: js.UndefOr[bottomRight | bottom | topRight | bottomLeft | topLeft | top] = js.undefined
  var usePortal: js.UndefOr[Boolean] = js.undefined
}

object ToasterProps {
  @scala.inline
  def apply(
    autoHideDuration: Int | Double = null,
    overrides: ToasterOverrides = null,
    placement: bottomRight | bottom | topRight | bottomLeft | topLeft | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): ToasterProps = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterProps]
  }
}

