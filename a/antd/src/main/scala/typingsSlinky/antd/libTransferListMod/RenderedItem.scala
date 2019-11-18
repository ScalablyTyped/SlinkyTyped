package typingsSlinky.antd.libTransferListMod

import slinky.core.TagMod
import typingsSlinky.antd.libTransferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedItem extends js.Object {
  var item: TransferItem
  var renderedEl: TagMod[Any]
  var renderedText: String
}

object RenderedItem {
  @scala.inline
  def apply(item: TransferItem, renderedEl: TagMod[Any], renderedText: String): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedEl = renderedEl.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderedItem]
  }
}

