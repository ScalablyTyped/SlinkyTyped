package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareFacesMatch extends js.Object {
  /**
    * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  /**
    * Level of confidence that the faces match.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}

object CompareFacesMatch {
  @scala.inline
  def apply(): CompareFacesMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesMatch]
  }
  @scala.inline
  implicit class CompareFacesMatchOps[Self <: CompareFacesMatch] (val x: Self) extends AnyVal {
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
    def withSimilarity(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Similarity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimilarity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Similarity")(js.undefined)
        ret
    }
  }
  
}

