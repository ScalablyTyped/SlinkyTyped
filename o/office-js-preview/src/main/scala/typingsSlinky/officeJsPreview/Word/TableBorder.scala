package typingsSlinky.officeJsPreview.Word

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.TableBorderData
import typingsSlinky.officeJsPreview.Word.Interfaces.TableBorderLoadOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.TableBorderUpdateData
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DotDashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Single
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Triple
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the border style.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableBorder extends ClientObject {
  
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableBorder: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableBorder = js.native
  def load(options: TableBorderLoadOptions): TableBorder = js.native
  def load(propertyNamesAndPaths: Expand): TableBorder = js.native
  def load(propertyNames: String): TableBorder = js.native
  def load(propertyNames: js.Array[String]): TableBorder = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.TableBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableBorderUpdateData): Unit = js.native
  def set(properties: TableBorderUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableBorder): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.TableBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableBorderData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableBorder = js.native
  
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableBorder = js.native
  
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: scala.Double = js.native
}
