package typingsSlinky.officeJsPreview.global.Visio

import typingsSlinky.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Shape")
@js.native
class Shape ()
  extends typingsSlinky.officeJsPreview.Visio.Shape {
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

