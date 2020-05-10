package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationDescription] = js.native
}

object CreateAssociationResult {
  @scala.inline
  def apply(): CreateAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationResult]
  }
  @scala.inline
  implicit class CreateAssociationResultOps[Self <: CreateAssociationResult] (val x: Self) extends AnyVal {
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

