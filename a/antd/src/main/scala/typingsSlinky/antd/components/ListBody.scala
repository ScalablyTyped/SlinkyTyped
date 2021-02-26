package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.listBodyMod.TransferListBodyProps
import typingsSlinky.antd.listBodyMod.default
import typingsSlinky.antd.transferListMod.RenderedItem
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBody {
  
  @scala.inline
  def apply[RecordType /* <: KeyWiseTransferItem */](
    filteredItems: js.Array[RecordType],
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    selectedKeys: js.Array[String]
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferListBodyProps[RecordType]]))
  }
  
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType /* <: KeyWiseTransferItem */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[RecordType]]
  
  def withProps[RecordType /* <: KeyWiseTransferItem */](p: TransferListBodyProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
