package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintDetail] = js.native
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintParameters] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Status] = js.native
}

object CreateConstraintOutput {
  @scala.inline
  def apply(): CreateConstraintOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConstraintOutput]
  }
  @scala.inline
  implicit class CreateConstraintOutputOps[Self <: CreateConstraintOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintDetail(value: ConstraintDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraintParameters(value: ConstraintParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

