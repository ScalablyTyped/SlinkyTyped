package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationPropertyBinding extends BaseElement {
  var correlationPropertyRef: CorrelationProperty = js.native
  var dataPath: FormalExpression = js.native
}

object CorrelationPropertyBinding {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    dataPath: FormalExpression,
    id: String
  ): CorrelationPropertyBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRef = correlationPropertyRef.asInstanceOf[js.Any], dataPath = dataPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyBinding]
  }
  @scala.inline
  implicit class CorrelationPropertyBindingOps[Self <: CorrelationPropertyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationPropertyRef(value: CorrelationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationPropertyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPath(value: FormalExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

