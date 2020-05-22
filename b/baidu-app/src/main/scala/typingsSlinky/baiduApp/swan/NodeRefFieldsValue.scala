package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Bottom
import typingsSlinky.baiduApp.anon.Dataset
import typingsSlinky.baiduApp.anon.Id
import typingsSlinky.baiduApp.anon.PropertiesAny
import typingsSlinky.baiduApp.anon.ScrollLeft
import typingsSlinky.baiduApp.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsValue extends js.Object {
  var dataset: Dataset
  var id: Id
  var properties: PropertiesAny
  var rect: Bottom
  var scrollOffset: ScrollLeft
  var size: Width
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: Dataset,
    id: Id,
    properties: PropertiesAny,
    rect: Bottom,
    scrollOffset: ScrollLeft,
    size: Width
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
}

