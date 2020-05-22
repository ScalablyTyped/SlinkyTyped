package typingsSlinky.baseui.anon

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.`inline`
import typingsSlinky.baseui.baseuiStrings.info
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.toast
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.baseui.toastMod.ToastOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.ToastProps> & {  key  :react.react.Key} */
trait ReadonlyToastPropskeyKey extends js.Object {
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  val children: js.UndefOr[(js.Function1[/* args */ Dismiss, TagMod[Any]]) | TagMod[Any]] = js.undefined
  val closeable: js.UndefOr[Boolean] = js.undefined
  val `data-baseweb`: js.UndefOr[String] = js.undefined
  val key: js.UndefOr[typingsSlinky.react.mod.Key] = js.undefined
  val kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  val notificationType: js.UndefOr[`inline` | toast] = js.undefined
  val onBlur: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.undefined
  val onClose: js.UndefOr[js.Function0[_]] = js.undefined
  val onFocus: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.undefined
  val onMouseEnter: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.undefined
  val onMouseLeave: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.undefined
  val overrides: js.UndefOr[ToastOverrides] = js.undefined
}

object ReadonlyToastPropskeyKey {
  @scala.inline
  def apply(
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    children: (js.Function1[/* args */ Dismiss, TagMod[Any]]) | TagMod[Any] = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    key: typingsSlinky.react.mod.Key = null,
    kind: info | positive | warning | negative = null,
    notificationType: `inline` | toast = null,
    onBlur: /* e */ org.scalajs.dom.raw.Event => _ = null,
    onClose: () => _ = null,
    onFocus: /* e */ org.scalajs.dom.raw.Event => _ = null,
    onMouseEnter: /* e */ org.scalajs.dom.raw.Event => _ = null,
    onMouseLeave: /* e */ org.scalajs.dom.raw.Event => _ = null,
    overrides: ToastOverrides = null
  ): ReadonlyToastPropskeyKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideDuration)) __obj.updateDynamic("autoHideDuration")(autoHideDuration.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.get.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToastPropskeyKey]
  }
}

