package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFragmentsInput extends js.Object {
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelector] = js.native
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.native
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stream from which to retrieve a fragment list.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.StreamName = js.native
}

object ListFragmentsInput {
  @scala.inline
  def apply(StreamName: StreamName): ListFragmentsInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFragmentsInput]
  }
  @scala.inline
  implicit class ListFragmentsInputOps[Self <: ListFragmentsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentSelector(value: FragmentSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: PageLimit): Self = {
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
    def withNextToken(value: String): Self = {
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

