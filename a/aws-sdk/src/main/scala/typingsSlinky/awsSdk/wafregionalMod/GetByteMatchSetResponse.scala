package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetByteMatchSetResponse extends js.Object {
  /**
    * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var ByteMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ByteMatchSet] = js.native
}

object GetByteMatchSetResponse {
  @scala.inline
  def apply(): GetByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetByteMatchSetResponse]
  }
  @scala.inline
  implicit class GetByteMatchSetResponseOps[Self <: GetByteMatchSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteMatchSet(value: ByteMatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteMatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchSet")(js.undefined)
        ret
    }
  }
  
}

