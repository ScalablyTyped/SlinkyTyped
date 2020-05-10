package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceSearchSettings extends js.Object {
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.CollectionId] = js.native
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 80. 0 is the lowest confidence. 100 is the highest confidence.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
}

object FaceSearchSettings {
  @scala.inline
  def apply(): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceSearchSettings]
  }
  @scala.inline
  implicit class FaceSearchSettingsOps[Self <: FaceSearchSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionId(value: CollectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceMatchThreshold(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatchThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceMatchThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatchThreshold")(js.undefined)
        ret
    }
  }
  
}

