package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesRequest extends js.Object {
  /**
    * To list pipelines in chronological order by the date and time that they were created, enter true. To list pipelines in reverse chronological order, enter false.
    */
  var Ascending: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Ascending] = js.native
  /**
    * When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
}

object ListPipelinesRequest {
  @scala.inline
  def apply(): ListPipelinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesRequest]
  }
  @scala.inline
  implicit class ListPipelinesRequestOps[Self <: ListPipelinesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Ascending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(js.undefined)
        ret
    }
  }
  
}

