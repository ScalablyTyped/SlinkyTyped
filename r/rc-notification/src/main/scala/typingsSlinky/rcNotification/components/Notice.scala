package typingsSlinky.rcNotification.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.rcNotification.noticeMod.NoticeProps
import typingsSlinky.rcNotification.noticeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notice
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-notification/lib/Notice", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, style */
  def apply(
    prefixCls: String,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: TagMod[Any] = null,
    duration: Int | Double = null,
    holder: HTMLDivElement = null,
    onClose: () => Unit = null,
    update: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NoticeProps
}

