package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationSubscription extends BaseElement {
  var correlationKeyRef: CorrelationKey = js.native
  var correlationPropertyBinding: js.Array[CorrelationKey] = js.native
}

object CorrelationSubscription {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeyRef: CorrelationKey,
    correlationPropertyBinding: js.Array[CorrelationKey],
    id: String
  ): CorrelationSubscription = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeyRef = correlationKeyRef.asInstanceOf[js.Any], correlationPropertyBinding = correlationPropertyBinding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationSubscription]
  }
  @scala.inline
  implicit class CorrelationSubscriptionOps[Self <: CorrelationSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationKeyRef(value: CorrelationKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationKeyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrelationPropertyBinding(value: js.Array[CorrelationKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationPropertyBinding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

