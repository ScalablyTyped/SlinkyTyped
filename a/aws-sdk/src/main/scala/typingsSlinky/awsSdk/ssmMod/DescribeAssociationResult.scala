package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationDescription] = js.native
}

object DescribeAssociationResult {
  @scala.inline
  def apply(): DescribeAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationResult]
  }
  @scala.inline
  implicit class DescribeAssociationResultOps[Self <: DescribeAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationDescription(value: AssociationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationDescription")(js.undefined)
        ret
    }
  }
  
}

