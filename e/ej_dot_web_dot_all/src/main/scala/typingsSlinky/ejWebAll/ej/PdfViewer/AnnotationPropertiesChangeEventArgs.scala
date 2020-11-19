package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationPropertiesChangeEventArgs extends js.Object {
  
  /** Returns the id of the annotation added in the page of the PDF document.
    */
  var annotationID: js.UndefOr[Double] = js.native
  
  /** Returns the type of the annotation added in the page of the PDF document.
    */
  var annotationType: js.UndefOr[String] = js.native
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Specifies that the color of the annotation is changed.
    */
  var isColorChanged: js.UndefOr[Boolean] = js.native
  
  /** Specifies that the opacity of the annotation is changed.
    */
  var isOpacityChanged: js.UndefOr[Boolean] = js.native
  
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
object AnnotationPropertiesChangeEventArgs {
  
  @scala.inline
  def apply(): AnnotationPropertiesChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationPropertiesChangeEventArgs]
  }
  
  @scala.inline
  implicit class AnnotationPropertiesChangeEventArgsOps[Self <: AnnotationPropertiesChangeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationID(value: Double): Self = this.set("annotationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationID: Self = this.set("annotationID", js.undefined)
    
    @scala.inline
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setIsColorChanged(value: Boolean): Self = this.set("isColorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsColorChanged: Self = this.set("isColorChanged", js.undefined)
    
    @scala.inline
    def setIsOpacityChanged(value: Boolean): Self = this.set("isOpacityChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpacityChanged: Self = this.set("isOpacityChanged", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPageID(value: Double): Self = this.set("pageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageID: Self = this.set("pageID", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
