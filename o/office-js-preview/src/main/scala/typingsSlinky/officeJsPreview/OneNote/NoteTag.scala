package typingsSlinky.officeJsPreview.OneNote

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OneNote.Interfaces.NoteTagData
import typingsSlinky.officeJsPreview.OneNote.Interfaces.NoteTagLoadOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Address
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Completed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Contact
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Critical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Disabled
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Idea
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Important
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Normal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Question
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Website
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A container for the NoteTag in a paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait NoteTag extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NoteTag: RequestContext = js.native
  
  /**
    *
    * Gets the ID of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.NoteTag` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.NoteTag` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.NoteTag` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NoteTag = js.native
  def load(option: String): NoteTag = js.native
  def load(option: js.Array[String]): NoteTag = js.native
  def load(option: NoteTagLoadOptions): NoteTag = js.native
  def load(option: Expand): NoteTag = js.native
  
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val status: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.NoteTag object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NoteTagData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NoteTagData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): NoteTag = js.native
  
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): NoteTag = js.native
}
