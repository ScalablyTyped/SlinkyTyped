package typingsSlinky.officeJs.Word

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the application object.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait Application extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    * Creates a new document by using an optional base64 encoded .docx file.
    *
    * [Api set: WordApi 1.3]
    *
    * @param base64File Optional. The base64 encoded .docx file. The default value is null.
    */
  def createDocument(): DocumentCreated = js.native
  def createDocument(base64File: String): DocumentCreated = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}
