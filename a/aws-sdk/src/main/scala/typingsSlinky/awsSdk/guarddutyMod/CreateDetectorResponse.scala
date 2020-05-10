package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorResponse extends js.Object {
  /**
    * The unique ID of the created detector.
    */
  var DetectorId: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DetectorId] = js.native
}

object CreateDetectorResponse {
  @scala.inline
  def apply(): CreateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDetectorResponse]
  }
  @scala.inline
  implicit class CreateDetectorResponseOps[Self <: CreateDetectorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(js.undefined)
        ret
    }
  }
  
}

