package typingsSlinky.antd.transferListMod

import slinky.core.TagMod
import typingsSlinky.antd.transferMod.TransferItem
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
  def apply(item: TransferItem, renderedText: String, renderedEl: TagMod[Any] = null): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    if (renderedEl != null) __obj.updateDynamic("renderedEl")(renderedEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem]
  }
}

