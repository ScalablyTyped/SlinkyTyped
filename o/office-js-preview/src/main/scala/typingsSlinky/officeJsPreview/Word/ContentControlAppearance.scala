package typingsSlinky.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentControlAppearance extends js.Object
/**
  *
  * Either bounding box, or tags, or hidden.
  *
  * [Api set: WordApi]
  * @remarks
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends js.Object {
  
  /**
    * Represents a content control shown as a shaded rectangle or bounding box (with optional title).
    *
    */
  @js.native
  sealed trait boundingBox extends ContentControlAppearance
  
  /**
    * Represents a content control that is not shown.
    *
    */
  @js.native
  sealed trait hidden extends ContentControlAppearance
  
  /**
    * Represents a content control shown as start and end markers.
    *
    */
  @js.native
  sealed trait tags extends ContentControlAppearance
}
