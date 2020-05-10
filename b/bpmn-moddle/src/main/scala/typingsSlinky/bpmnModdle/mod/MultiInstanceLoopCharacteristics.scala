package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiInstanceLoopCharacteristics extends BaseElement {
  var behavior: MultiInstanceBehaviour = js.native
  var completionCondition: Expression = js.native
  var complexBehaviorDefinition: ComplexBehaviorDefinition = js.native
  var inputDataItem: DataInput = js.native
  var isSequential: Boolean = js.native
  var loopCardinality: Expression = js.native
  var loopDataInputRef: ItemAwareElement = js.native
  var loopDataOutputRef: ItemAwareElement = js.native
  var noneBehaviorEventRef: EventDefinition = js.native
  var oneBehaviorEventRef: EventDefinition = js.native
  var outputDataItem: DataOutput = js.native
}

object MultiInstanceLoopCharacteristics {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    behavior: MultiInstanceBehaviour,
    completionCondition: Expression,
    complexBehaviorDefinition: ComplexBehaviorDefinition,
    id: String,
    inputDataItem: DataInput,
    isSequential: Boolean,
    loopCardinality: Expression,
    loopDataInputRef: ItemAwareElement,
    loopDataOutputRef: ItemAwareElement,
    noneBehaviorEventRef: EventDefinition,
    oneBehaviorEventRef: EventDefinition,
    outputDataItem: DataOutput
  ): MultiInstanceLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], behavior = behavior.asInstanceOf[js.Any], completionCondition = completionCondition.asInstanceOf[js.Any], complexBehaviorDefinition = complexBehaviorDefinition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputDataItem = inputDataItem.asInstanceOf[js.Any], isSequential = isSequential.asInstanceOf[js.Any], loopCardinality = loopCardinality.asInstanceOf[js.Any], loopDataInputRef = loopDataInputRef.asInstanceOf[js.Any], loopDataOutputRef = loopDataOutputRef.asInstanceOf[js.Any], noneBehaviorEventRef = noneBehaviorEventRef.asInstanceOf[js.Any], oneBehaviorEventRef = oneBehaviorEventRef.asInstanceOf[js.Any], outputDataItem = outputDataItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInstanceLoopCharacteristics]
  }
  @scala.inline
  implicit class MultiInstanceLoopCharacteristicsOps[Self <: MultiInstanceLoopCharacteristics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: MultiInstanceBehaviour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionCondition(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexBehaviorDefinition(value: ComplexBehaviorDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexBehaviorDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDataItem(value: DataInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDataItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSequential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSequential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopCardinality(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopDataInputRef(value: ItemAwareElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopDataInputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopDataOutputRef(value: ItemAwareElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopDataOutputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoneBehaviorEventRef(value: EventDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noneBehaviorEventRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneBehaviorEventRef(value: EventDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneBehaviorEventRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataItem(value: DataOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDataItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

