package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorResult extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The status and description for each detector version.
    */
  var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList] = js.native
  /**
    * The next token to be used for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeDetectorResult {
  @scala.inline
  def apply(): DescribeDetectorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResult]
  }
  @scala.inline
  implicit class DescribeDetectorResultOps[Self <: DescribeDetectorResult] (val x: Self) extends AnyVal {
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
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorVersionSummaries(value: DetectorVersionSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorVersionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorVersionSummaries")(js.undefined)
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

