package typingsSlinky.antdDashMobileDashRn.libNoticeDashBarIndexDotNativeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.closable
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.link
import typingsSlinky.antdDashMobileDashRn.libNoticeDashBarMarqueeDotNativeMod.MarqueeProps
import typingsSlinky.antdDashMobileDashRn.libNoticeDashBarPropsTypeMod.NoticeBarPropsType
import typingsSlinky.antdDashMobileDashRn.libNoticeDashBarStyleIndexDotNativeMod.INoticeBarStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps extends NoticeBarPropsType {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[INoticeBarStyle] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: INoticeBarStyle = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

