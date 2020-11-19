package typingsSlinky.officeJsPreview.OneNote

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OneNote.Interfaces.SectionGroupData
import typingsSlinky.officeJsPreview.OneNote.Interfaces.SectionGroupLoadOptions
import typingsSlinky.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote section group. Section groups can contain sections and other section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait SectionGroup extends ClientObject {
  
  /**
    *
    * Adds a new section to the end of the section group.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param title The name of the new section.
    */
  def addSection(title: String): Section = js.native
  
  /**
    *
    * Adds a new section group to the end of this sectionGroup.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the new section.
    */
  def addSectionGroup(name: String): SectionGroup = js.native
  
  /**
    *
    * The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SectionGroup: RequestContext = js.native
  
  /**
    *
    * Gets the REST API ID.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  
  /**
    *
    * Gets the ID of the section group. Read-only.
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
    * `load(option?: string | string[]): OneNote.SectionGroup` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.SectionGroup` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.SectionGroup` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SectionGroup = js.native
  def load(option: String): SectionGroup = js.native
  def load(option: js.Array[String]): SectionGroup = js.native
  def load(option: SectionGroupLoadOptions): SectionGroup = js.native
  def load(option: Expand): SectionGroup = js.native
  
  /**
    *
    * Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val name: String = js.native
  
  /**
    *
    * Gets the notebook that contains the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val notebook: Notebook = js.native
  
  /**
    *
    * Gets the section group that contains the section group. Throws ItemNotFound if the section group is a direct child of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroup: SectionGroup = js.native
  
  /**
    *
    * Gets the section group that contains the section group. Returns null if the section group is a direct child of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroupOrNull: SectionGroup = js.native
  
  /**
    *
    * The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val sectionGroups: SectionGroupCollection = js.native
  
  /**
    *
    * The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val sections: SectionCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.SectionGroup object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.SectionGroupData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SectionGroupData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): SectionGroup = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): SectionGroup = js.native
}
