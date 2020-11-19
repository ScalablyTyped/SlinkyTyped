package typingsSlinky.officeJsPreview.Word

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AnnotationAdded
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AnnotationChanged
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AnnotationDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ContentControlAdded
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ContentControlDataChanged
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ContentControlDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ContentControlSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the content control that raised an event.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait ContentControlEventArgs extends js.Object {
  
  /**
    *
    * The object that raised the event. Load this object to get its properties.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl = js.native
  
  /**
    *
    * The event type. See Word.EventType for details.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted = js.native
}
object ContentControlEventArgs {
  
  @scala.inline
  def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlEventArgs]
  }
  
  @scala.inline
  implicit class ContentControlEventArgsOps[Self <: ContentControlEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContentControl(value: ContentControl): Self = this.set("contentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
    ): Self = this.set("eventType", value.asInstanceOf[js.Any])
  }
}
