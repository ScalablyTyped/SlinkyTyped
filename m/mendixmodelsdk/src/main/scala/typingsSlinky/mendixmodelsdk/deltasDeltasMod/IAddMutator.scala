package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddMutator extends Mutator {
  var insertionIndex: js.UndefOr[Double] = js.native
  var mutatorType: ADD = js.native
  var value: PrimitiveValue = js.native
}

object IAddMutator {
  @scala.inline
  def apply(mutatorType: ADD, value: PrimitiveValue): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
  @scala.inline
  implicit class IAddMutatorOps[Self <: IAddMutator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutatorType(value: ADD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: PrimitiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(js.undefined)
        ret
    }
  }
  
}

