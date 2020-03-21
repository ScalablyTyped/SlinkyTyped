package typingsSlinky.reactShare.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.div.tag
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.StyleHTMLAttributes
import typingsSlinky.reactShare.CommonShareButtonPropstit
import typingsSlinky.reactShare.reactShareStrings.screenCenter
import typingsSlinky.reactShare.reactShareStrings.windowCenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TwitterShareButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-share", "TwitterShareButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style, tabIndex, title */
  def apply(
    url: String,
    additionalProps: HTMLAttributes[HTMLDivElement] = null,
    beforeOnClick: () => js.Promise[Unit] | Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleHTMLAttributes[HTMLDivElement] = null,
    hashtags: js.Array[String] = null,
    onClick: /* link */ String => Unit = null,
    onShareWindowClose: () => Unit = null,
    openWindow: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    via: String = null,
    windowHeight: Int | Double = null,
    windowPosition: windowCenter | screenCenter = null,
    windowWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps.asInstanceOf[js.Any])
    if (beforeOnClick != null) __obj.updateDynamic("beforeOnClick")(js.Any.fromFunction0(beforeOnClick))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onShareWindowClose != null) __obj.updateDynamic("onShareWindowClose")(js.Any.fromFunction0(onShareWindowClose))
    if (!js.isUndefined(openWindow)) __obj.updateDynamic("openWindow")(openWindow.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CommonShareButtonPropstit
}

