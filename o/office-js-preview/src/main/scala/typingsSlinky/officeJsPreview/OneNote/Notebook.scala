package typingsSlinky.officeJsPreview.OneNote

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OneNote.Interfaces.NotebookData
import typingsSlinky.officeJsPreview.OneNote.Interfaces.NotebookLoadOptions
import typingsSlinky.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote notebook. Notebooks contain section groups and sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Notebook extends ClientObject {
  
  /**
    *
    * Adds a new section to the end of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the new section.
    */
  def addSection(name: String): Section = js.native
  
  /**
    *
    * Adds a new section group to the end of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the new section.
    */
  def addSectionGroup(name: String): SectionGroup = js.native
  
  /**
    *
    * The url of the site that this notebook is located. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val baseUrl: String = js.native
  
  /**
    *
    * The client url of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Notebook: RequestContext = js.native
  
  /**
    *
    * Gets the REST API ID.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  
  /**
    *
    * Gets the ID of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    *
    * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  val isVirtual: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Notebook` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Notebook` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Notebook` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Notebook = js.native
  def load(option: String): Notebook = js.native
  def load(option: js.Array[String]): Notebook = js.native
  def load(option: NotebookLoadOptions): Notebook = js.native
  def load(option: Expand): Notebook = js.native
  
  /**
    *
    * Gets the name of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val name: String = js.native
  
  /**
    *
    * The section groups in the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val sectionGroups: SectionGroupCollection = js.native
  
  /**
    *
    * The the sections of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val sections: SectionCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Notebook object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NotebookData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NotebookData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Notebook = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Notebook = js.native
}
