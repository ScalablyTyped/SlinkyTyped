package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropHintsAnnotation extends js.Object {
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[CropHint]] = js.native
}

object CropHintsAnnotation {
  @scala.inline
  def apply(): CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHintsAnnotation]
  }
  @scala.inline
  implicit class CropHintsAnnotationOps[Self <: CropHintsAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropHints(value: js.Array[CropHint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHints")(js.undefined)
        ret
    }
  }
  
}

