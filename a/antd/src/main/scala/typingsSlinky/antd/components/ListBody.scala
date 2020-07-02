package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.listBodyMod.TransferListBodyProps
import typingsSlinky.antd.listBodyMod.default
import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListBody {
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TransferListBodyProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String]
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[TransferListBodyProps]))
  }
}

