package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CelebrityRecognition extends js.Object {
  /**
    * Information about a recognized celebrity.
    */
  var Celebrity: js.UndefOr[CelebrityDetail] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the celebrity was recognized.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}

object CelebrityRecognition {
  @scala.inline
  def apply(): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityRecognition]
  }
  @scala.inline
  implicit class CelebrityRecognitionOps[Self <: CelebrityRecognition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCelebrity(value: CelebrityDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Celebrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCelebrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Celebrity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

