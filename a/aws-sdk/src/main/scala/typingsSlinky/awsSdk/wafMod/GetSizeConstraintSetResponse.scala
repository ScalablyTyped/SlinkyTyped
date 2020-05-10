package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSizeConstraintSetResponse extends js.Object {
  /**
    * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var SizeConstraintSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.SizeConstraintSet] = js.native
}

object GetSizeConstraintSetResponse {
  @scala.inline
  def apply(): GetSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSizeConstraintSetResponse]
  }
  @scala.inline
  implicit class GetSizeConstraintSetResponseOps[Self <: GetSizeConstraintSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeConstraintSet(value: SizeConstraintSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeConstraintSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSet")(js.undefined)
        ret
    }
  }
  
}

