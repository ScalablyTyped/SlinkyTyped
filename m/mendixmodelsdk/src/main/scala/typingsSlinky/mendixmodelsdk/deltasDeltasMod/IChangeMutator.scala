package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangeMutator extends Mutator {
  var mutatorType: CHANGE = js.native
  var updateIndex: js.UndefOr[Double] = js.native
  var value: PrimitiveValue | Null = js.native
}

object IChangeMutator {
  @scala.inline
  def apply(mutatorType: CHANGE): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeMutator]
  }
  @scala.inline
  implicit class IChangeMutatorOps[Self <: IChangeMutator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutatorType(value: CHANGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: PrimitiveValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

