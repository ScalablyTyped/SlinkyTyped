package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esTransferListMod.RenderedItem
import typingsSlinky.antd.esTransferMod.TransferItem
import typingsSlinky.antd.esTransferRenderListBodyMod.TransferListBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RenderListBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.antd.esTransferRenderListBodyMod.default.asInstanceOf[String | js.Object]
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String],
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferListBodyProps
}

