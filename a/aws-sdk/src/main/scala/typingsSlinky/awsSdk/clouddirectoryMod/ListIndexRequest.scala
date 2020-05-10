package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndexRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory that the index exists in.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference = js.native
  /**
    * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
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

object ListIndexRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexRequest]
  }
  @scala.inline
  implicit class ListIndexRequestOps[Self <: ListIndexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsistencyLevel(value: ConsistencyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistencyLevel")(js.undefined)
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

