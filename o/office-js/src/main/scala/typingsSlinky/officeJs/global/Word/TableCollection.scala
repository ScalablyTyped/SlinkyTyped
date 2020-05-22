package typingsSlinky.officeJs.global.Word

import typingsSlinky.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's Table objects.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.TableCollection")
@js.native
class TableCollection ()
  extends typingsSlinky.officeJs.Word.TableCollection {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

