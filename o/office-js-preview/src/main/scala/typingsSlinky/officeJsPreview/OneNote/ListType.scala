package typingsSlinky.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListType extends StObject
/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ListType")
@js.native
object ListType extends StObject {
  
  @js.native
  sealed trait bullet extends ListType
  
  @js.native
  sealed trait none extends ListType
  
  @js.native
  sealed trait number extends ListType
}
