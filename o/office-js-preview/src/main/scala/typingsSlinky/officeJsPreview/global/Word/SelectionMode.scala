package typingsSlinky.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enum sets where the cursor (insertion point) in the document is after a selection.
  * 
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Word.SelectionMode with String] = js.native
  
  /* "End" */ val end: typingsSlinky.officeJsPreview.Word.SelectionMode.end with String = js.native
  
  /* "Select" */ val select: typingsSlinky.officeJsPreview.Word.SelectionMode.select with String = js.native
  
  /* "Start" */ val start: typingsSlinky.officeJsPreview.Word.SelectionMode.start with String = js.native
}
