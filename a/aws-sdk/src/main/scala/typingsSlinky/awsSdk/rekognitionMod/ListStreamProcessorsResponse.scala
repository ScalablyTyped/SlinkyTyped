package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamProcessorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * List of stream processors that you have created.
    */
  var StreamProcessors: js.UndefOr[StreamProcessorList] = js.native
}

object ListStreamProcessorsResponse {
  @scala.inline
  def apply(): ListStreamProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamProcessorsResponse]
  }
  @scala.inline
  implicit class ListStreamProcessorsResponseOps[Self <: ListStreamProcessorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withStreamProcessors(value: StreamProcessorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamProcessors")(js.undefined)
        ret
    }
  }
  
}

