package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.finish
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.navigation
import typingsSlinky.antd.antdStrings.process
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.antdStrings.wait
import typingsSlinky.antd.esStepsMod.StepsProps
import typingsSlinky.antd.esStepsMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, onChange */
object Steps
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esStepsMod.default].asInstanceOf[String | js.Object]
  def apply(
    current: Int | Double = null,
    direction: horizontal | vertical = null,
    iconPrefix: String = null,
    initial: Int | Double = null,
    labelPlacement: horizontal | vertical = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    size: typingsSlinky.antd.antdStrings.default | small = null,
    status: wait | process | finish | error = null,
    style: CSSProperties = null,
    `type`: typingsSlinky.antd.antdStrings.default | navigation = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepsProps
}

