package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSet extends js.Object {
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet (see GetByteMatchSet), update a ByteMatchSet (see UpdateByteMatchSet), insert a ByteMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a ByteMatchSet from AWS WAF (see DeleteByteMatchSet).  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
  /**
    * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  var ByteMatchTuples: typingsSlinky.awsSdk.wafregionalMod.ByteMatchTuples = js.native
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}

object ByteMatchSet {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ByteMatchTuples: ByteMatchTuples): ByteMatchSet = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], ByteMatchTuples = ByteMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSet]
  }
  @scala.inline
  implicit class ByteMatchSetOps[Self <: ByteMatchSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteMatchTuples(value: ByteMatchTuples): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ByteMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

