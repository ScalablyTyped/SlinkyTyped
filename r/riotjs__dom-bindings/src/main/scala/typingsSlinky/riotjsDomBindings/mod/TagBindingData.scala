package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagBindingData
  extends BaseBindingData
     with BindingData {
  var attributes: js.Array[AttributeExpressionData] = js.native
  var slots: js.Array[SlotBindingData] = js.native
  def getComponent(name: String): TemplateChunk[_, _] = js.native
}

object TagBindingData {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData]
  ): TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBindingData]
  }
  @scala.inline
  implicit class TagBindingDataOps[Self <: TagBindingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[AttributeExpressionData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComponent(value: String => TemplateChunk[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlots(value: js.Array[SlotBindingData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

