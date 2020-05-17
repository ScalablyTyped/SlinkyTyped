package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationAnnotation extends js.Object {
  var annotation: typingsSlinky.appleMapkitJs.mapkit.Annotation = js.native
}

object AnnotationAnnotation {
  @scala.inline
  def apply(annotation: typingsSlinky.appleMapkitJs.mapkit.Annotation): AnnotationAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationAnnotation]
  }
  @scala.inline
  implicit class AnnotationAnnotationOps[Self <: AnnotationAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: typingsSlinky.appleMapkitJs.mapkit.Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

