package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorsResult extends js.Object {
  /**
    * The detectors.
    */
  var detectors: js.UndefOr[DetectorList] = js.native
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetDetectorsResult {
  @scala.inline
  def apply(): GetDetectorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsResult]
  }
  @scala.inline
  implicit class GetDetectorsResultOps[Self <: GetDetectorsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectors(value: DetectorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectors")(js.undefined)
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

