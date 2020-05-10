package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIncomingTypedLinksRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
    */
  var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.native
  /**
    * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
    */
  var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typingsSlinky.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object ListIncomingTypedLinksRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListIncomingTypedLinksRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIncomingTypedLinksRequest]
  }
  @scala.inline
  implicit class ListIncomingTypedLinksRequestOps[Self <: ListIncomingTypedLinksRequest] (val x: Self) extends AnyVal {
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
    def withObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectReference")(value.asInstanceOf[js.Any])
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
    def withFilterAttributeRanges(value: TypedLinkAttributeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterAttributeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterAttributeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterAttributeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTypedLink(value: TypedLinkSchemaAndFacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterTypedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTypedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterTypedLink")(js.undefined)
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
  }
  
}

