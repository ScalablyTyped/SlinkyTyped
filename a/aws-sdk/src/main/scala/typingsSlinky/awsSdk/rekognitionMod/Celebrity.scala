package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Celebrity extends js.Object {
  /**
    * Provides information about the celebrity's face, such as its location on the image.
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  /**
    * A unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
    */
  var MatchConfidence: js.UndefOr[Percent] = js.native
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional information about the celebrity. If there is no additional information about the celebrity, this list is empty.
    */
  var Urls: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Urls] = js.native
}

object Celebrity {
  @scala.inline
  def apply(): Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Celebrity]
  }
  @scala.inline
  implicit class CelebrityOps[Self <: Celebrity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFace(value: ComparedFace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Face")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: RekognitionUniqueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: Urls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urls")(js.undefined)
        ret
    }
  }
  
}

