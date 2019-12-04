package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.libDividerMod.DividerProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Divider
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd/lib/divider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    dashed: js.UndefOr[Boolean] = js.undefined,
    orientation: left | right | center = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    `type`: horizontal | vertical = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dashed)) __obj.updateDynamic("dashed")(dashed.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DividerProps
}

