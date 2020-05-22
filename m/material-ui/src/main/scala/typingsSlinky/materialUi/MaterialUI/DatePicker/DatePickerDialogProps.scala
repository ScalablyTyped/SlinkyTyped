package typingsSlinky.materialUi.MaterialUI.DatePicker

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.propTypes.utils
import typingsSlinky.materialUi.anon.Call
import typingsSlinky.materialUi.materialUiStrings.`inline`
import typingsSlinky.materialUi.materialUiStrings.dialog
import typingsSlinky.materialUi.materialUiStrings.landscape
import typingsSlinky.materialUi.materialUiStrings.portrait
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerDialogProps extends js.Object {
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Call] = js.undefined
  var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[TagMod[Any]] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var initialDate: js.UndefOr[js.Date] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var okLabel: js.UndefOr[TagMod[Any]] = js.undefined
  var onAccept: js.UndefOr[js.Function1[/* d */ js.Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typingsSlinky.materialUi.MaterialUI.propTypes.utils] = js.undefined
}

object DatePickerDialogProps {
  @scala.inline
  def apply(
    DateTimeFormat: Call = null,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    container: dialog | `inline` = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: js.UndefOr[Double] = js.undefined,
    initialDate: js.Date = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    okLabel: TagMod[Any] = null,
    onAccept: /* d */ js.Date => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    shouldDisableDate: /* day */ js.Date => Boolean = null,
    style: CSSProperties = null,
    utils: utils = null
  ): DatePickerDialogProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.get.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDayOfWeek)) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.get.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerDialogProps]
  }
}

