package typingsSlinky.antdMobileRn.listIndexNativeMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.AnonArrowV
import typingsSlinky.antdMobileRn.antdMobileRnBooleans.`false`
import typingsSlinky.antdMobileRn.listPropsTypeMod.ListPropsType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends ListPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[AnonArrowV] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | ReactElement | js.Array[ReactElement] = null,
    renderFooter: js.Function0[ReactComponentClass[_]] | String | ReactElement = null,
    renderHeader: js.Function0[ReactComponentClass[_]] | String | ReactElement = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonArrowV = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

