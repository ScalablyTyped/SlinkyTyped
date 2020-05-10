package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.SegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentsResponse extends js.Object {
  /**
    * The list of segments.
    */
  var Item: js.UndefOr[js.Array[SegmentResponse] | js.Iterable[SegmentResponse]] = js.native
  /**
    * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SegmentsResponse {
  @scala.inline
  def apply(): SegmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentsResponse]
  }
  @scala.inline
  implicit class SegmentsResponseOps[Self <: SegmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIterable(value: js.Iterable[SegmentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Array[SegmentResponse] | js.Iterable[SegmentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
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

