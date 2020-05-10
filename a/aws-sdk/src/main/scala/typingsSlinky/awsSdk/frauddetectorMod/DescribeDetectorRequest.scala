package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The maximum number of results to return for the request.
    */
  var maxResults: js.UndefOr[DetectorVersionMaxResults] = js.native
  /**
    * The next token from the previous response.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeDetectorRequest {
  @scala.inline
  def apply(detectorId: identifier): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  @scala.inline
  implicit class DescribeDetectorRequestOps[Self <: DescribeDetectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: DetectorVersionMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

