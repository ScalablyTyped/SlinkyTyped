package typingsSlinky.appleMapkitJs

import typingsSlinky.appleMapkitJs.mapkit.Annotation
import typingsSlinky.appleMapkitJs.mapkit.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnnotation extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.native
  var overlay: js.UndefOr[Overlay] = js.native
}

object AnonAnnotation {
  @scala.inline
  def apply(): AnonAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnnotation]
  }
  @scala.inline
  implicit class AnonAnnotationOps[Self <: AnonAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
  }
  
}

