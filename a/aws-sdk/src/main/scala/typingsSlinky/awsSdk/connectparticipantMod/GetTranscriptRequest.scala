package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptRequest extends js.Object {
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The contactId from the current contact chain for which transcript is needed.
    */
  var ContactId: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ContactId] = js.native
  /**
    * The maximum number of results to return in the page. Default: 10. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.MaxResults] = js.native
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.NextToken] = js.native
  /**
    * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is provided, FORWARD with StartPosition. 
    */
  var ScanDirection: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ScanDirection] = js.native
  /**
    * The sort order for the records. Default: DESCENDING.
    */
  var SortOrder: js.UndefOr[SortKey] = js.native
  /**
    * A filtering option for where to start.
    */
  var StartPosition: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.StartPosition] = js.native
}

object GetTranscriptRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken): GetTranscriptRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptRequest]
  }
  @scala.inline
  implicit class GetTranscriptRequestOps[Self <: GetTranscriptRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionToken(value: ParticipantToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactId(value: ContactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
    def withScanDirection(value: ScanDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScanDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: StartPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartPosition")(js.undefined)
        ret
    }
  }
  
}

