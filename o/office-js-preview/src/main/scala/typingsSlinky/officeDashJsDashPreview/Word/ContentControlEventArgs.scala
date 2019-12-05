package typingsSlinky.officeDashJsDashPreview.Word

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationAdded
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationChanged
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AnnotationDeleted
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlAdded
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlDataChanged
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlDeleted
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ContentControlSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the content control that raised an event.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ContentControlEventArgs extends js.Object {
  /**
    *
    * The object that raised the event. Load this object to get its properties.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl
  /**
    *
    * The event type. See Word.EventType for details.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
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
}

