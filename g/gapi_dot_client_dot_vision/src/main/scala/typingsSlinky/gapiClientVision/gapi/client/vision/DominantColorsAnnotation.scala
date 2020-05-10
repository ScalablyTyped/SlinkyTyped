package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DominantColorsAnnotation extends js.Object {
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[ColorInfo]] = js.native
}

object DominantColorsAnnotation {
  @scala.inline
  def apply(): DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DominantColorsAnnotation]
  }
  @scala.inline
  implicit class DominantColorsAnnotationOps[Self <: DominantColorsAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[ColorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

