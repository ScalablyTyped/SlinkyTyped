package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.alternate
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.esTimelineMod.default
import typingsSlinky.antd.esTimelineTimelineMod.TimelineProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object Timeline
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esTimelineMod.default].asInstanceOf[String | js.Object]
  def apply(
    mode: left | alternate | right = null,
    pending: TagMod[Any] = null,
    pendingDot: TagMod[Any] = null,
    prefixCls: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimelineProps
}

