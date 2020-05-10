package typingsSlinky.appleMapkitJs

import typingsSlinky.appleMapkitJs.mapkit.Annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnnotationAnnotation extends js.Object {
  var annotation: Annotation = js.native
}

object AnonAnnotationAnnotation {
  @scala.inline
  def apply(annotation: Annotation): AnonAnnotationAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnnotationAnnotation]
  }
  @scala.inline
  implicit class AnonAnnotationAnnotationOps[Self <: AnonAnnotationAnnotation] (val x: Self) extends AnyVal {
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
  }
  
}

