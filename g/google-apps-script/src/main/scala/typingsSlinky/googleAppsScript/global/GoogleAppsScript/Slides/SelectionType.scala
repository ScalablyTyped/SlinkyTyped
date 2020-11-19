package typingsSlinky.googleAppsScript.global.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type of Selection.
  *
  * The SelectionType represents the most specific type of one or more objects that are
  * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
  * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
  * using the Selection.getPageElementRange and the Page can be retrieved from the
  * Selection.getCurrentPage.
  */
@JSGlobal("GoogleAppsScript.Slides.SelectionType")
@js.native
object SelectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType with Double] = js.native
  
  /* 6 */ val CURRENT_PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.CURRENT_PAGE with Double = js.native
  
  /* 1 */ val NONE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.NONE with Double = js.native
  
  /* 4 */ val PAGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE with Double = js.native
  
  /* 5 */ val PAGE_ELEMENT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.PAGE_ELEMENT with Double = js.native
  
  /* 3 */ val TABLE_CELL: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TABLE_CELL with Double = js.native
  
  /* 2 */ val TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.TEXT with Double = js.native
  
  /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SelectionType.UNSUPPORTED with Double = js.native
}
