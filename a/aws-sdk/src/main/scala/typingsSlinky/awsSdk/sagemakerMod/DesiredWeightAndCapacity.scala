package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredWeightAndCapacity extends js.Object {
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * The name of the variant to update.
    */
  var VariantName: typingsSlinky.awsSdk.sagemakerMod.VariantName = js.native
}

object DesiredWeightAndCapacity {
  @scala.inline
  def apply(VariantName: VariantName): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
  @scala.inline
  implicit class DesiredWeightAndCapacityOps[Self <: DesiredWeightAndCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariantName(value: VariantName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredInstanceCount(value: TaskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredWeight(value: VariantWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredWeight")(js.undefined)
        ret
    }
  }
  
}

