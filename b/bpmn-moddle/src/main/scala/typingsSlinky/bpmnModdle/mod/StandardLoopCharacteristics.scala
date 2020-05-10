package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLoopCharacteristics extends BaseElement {
  var loopCondition: Expression = js.native
  var loopMaximum: Expression = js.native
  var testBefore: Boolean = js.native
}

object StandardLoopCharacteristics {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    loopCondition: Expression,
    loopMaximum: Expression,
    testBefore: Boolean
  ): StandardLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loopCondition = loopCondition.asInstanceOf[js.Any], loopMaximum = loopMaximum.asInstanceOf[js.Any], testBefore = testBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardLoopCharacteristics]
  }
  @scala.inline
  implicit class StandardLoopCharacteristicsOps[Self <: StandardLoopCharacteristics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoopCondition(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopMaximum(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

