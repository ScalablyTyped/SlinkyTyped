package typingsSlinky.officeJs.Word

import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import typingsSlinky.officeJs.Word.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Word.Interfaces.InlinePictureCollectionData
import typingsSlinky.officeJs.Word.Interfaces.InlinePictureCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains a collection of {@link Word.InlinePicture} objects.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait InlinePictureCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InlinePictureCollection: RequestContext = js.native
  
  /**
    * Gets the first inline image in this collection. Throws an error if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirst(): InlinePicture = js.native
  
  /**
    * Gets the first inline image in this collection. Returns a null object if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): InlinePicture = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[InlinePicture] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InlinePictureCollection = js.native
  def load(options: InlinePictureCollectionLoadOptions with CollectionLoadOptions): InlinePictureCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): InlinePictureCollection = js.native
  def load(propertyNames: String): InlinePictureCollection = js.native
  def load(propertyNames: js.Array[String]): InlinePictureCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.InlinePictureCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.InlinePictureCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): InlinePictureCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InlinePictureCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InlinePictureCollection = js.native
}
