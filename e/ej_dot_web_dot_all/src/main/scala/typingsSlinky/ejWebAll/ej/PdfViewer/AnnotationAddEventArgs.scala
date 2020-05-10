package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationAddEventArgs extends js.Object {
  /** Returns the bounds of the annotation added in the page of the PDF document.
    */
  var annotationBound: js.UndefOr[js.Array[_]] = js.native
  /** Returns the id of the annotation added in the page of the PDF document.
    */
  var annotationID: js.UndefOr[Double] = js.native
  /** Returns the settings of the annotation added to the PDF document.
    */
  var annotationSettings: js.UndefOr[js.Any] = js.native
  /** Returns the type of the annotation added in the page of the PDF document.
    */
  var annotationType: js.UndefOr[String] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the page number in which the annotation is added.
    */
  var pageID: js.UndefOr[Double] = js.native
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object AnnotationAddEventArgs {
  @scala.inline
  def apply(): AnnotationAddEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationAddEventArgs]
  }
  @scala.inline
  implicit class AnnotationAddEventArgsOps[Self <: AnnotationAddEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationBound(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationBound")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationID")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPageID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageID")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

