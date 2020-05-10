package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationPropertyRetrievalExpression extends BaseElement {
  var messagePath: FormalExpression = js.native
  var messageRef: Message = js.native
}

object CorrelationPropertyRetrievalExpression {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    messagePath: FormalExpression,
    messageRef: Message
  ): CorrelationPropertyRetrievalExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messagePath = messagePath.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyRetrievalExpression]
  }
  @scala.inline
  implicit class CorrelationPropertyRetrievalExpressionOps[Self <: CorrelationPropertyRetrievalExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessagePath(value: FormalExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageRef(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

