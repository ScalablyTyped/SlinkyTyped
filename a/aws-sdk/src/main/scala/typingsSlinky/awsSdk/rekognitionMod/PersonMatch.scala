package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonMatch extends js.Object {
  /**
    * Information about the faces in the input collection that match the face of a person in the video.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Information about the matched person.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  /**
    * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}

object PersonMatch {
  @scala.inline
  def apply(): PersonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMatch]
  }
  @scala.inline
  implicit class PersonMatchOps[Self <: PersonMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceMatches(value: FaceMatchList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatches")(js.undefined)
        ret
    }
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

