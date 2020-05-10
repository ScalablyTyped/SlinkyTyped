package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonBottom
import typingsSlinky.baiduApp.AnonDataset
import typingsSlinky.baiduApp.AnonId
import typingsSlinky.baiduApp.AnonPropertiesAny
import typingsSlinky.baiduApp.AnonScrollLeft
import typingsSlinky.baiduApp.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRefFieldsValue extends js.Object {
  var dataset: AnonDataset = js.native
  var id: AnonId = js.native
  var properties: AnonPropertiesAny = js.native
  var rect: AnonBottom = js.native
  var scrollOffset: AnonScrollLeft = js.native
  var size: AnonWidth = js.native
}

object NodeRefFieldsValue {
  @scala.inline
  def apply(
    dataset: AnonDataset,
    id: AnonId,
    properties: AnonPropertiesAny,
    rect: AnonBottom,
    scrollOffset: AnonScrollLeft,
    size: AnonWidth
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
  @scala.inline
  implicit class NodeRefFieldsValueOps[Self <: NodeRefFieldsValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataset(value: AnonDataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: AnonPropertiesAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffset(value: AnonScrollLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

