package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListIndex extends js.Object {
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Specifies the ranges of indexed values that you want to query.
    */
  var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.native
}

object BatchListIndex {
  @scala.inline
  def apply(IndexReference: ObjectReference): BatchListIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListIndex]
  }
  @scala.inline
  implicit class BatchListIndexOps[Self <: BatchListIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: NumberResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRangesOnIndexedValues(value: ObjectAttributeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangesOnIndexedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangesOnIndexedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangesOnIndexedValues")(js.undefined)
        ret
    }
  }
  
}

