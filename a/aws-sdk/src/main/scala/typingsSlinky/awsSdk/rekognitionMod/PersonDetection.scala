package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonDetection extends js.Object {
  /**
    * Details about a person whose path was tracked in a video.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the person's path was tracked.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}

object PersonDetection {
  @scala.inline
  def apply(): PersonDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetection]
  }
  @scala.inline
  implicit class PersonDetectionOps[Self <: PersonDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerson(value: PersonDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Person")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Person")(js.undefined)
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

