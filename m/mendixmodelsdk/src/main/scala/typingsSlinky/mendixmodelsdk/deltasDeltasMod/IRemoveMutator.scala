package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemoveMutator extends Mutator {
  var mutatorType: REMOVE = js.native
  var removalIndex: Double = js.native
}

object IRemoveMutator {
  @scala.inline
  def apply(mutatorType: REMOVE, removalIndex: Double): IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveMutator]
  }
  @scala.inline
  implicit class IRemoveMutatorOps[Self <: IRemoveMutator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutatorType(value: REMOVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removalIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

