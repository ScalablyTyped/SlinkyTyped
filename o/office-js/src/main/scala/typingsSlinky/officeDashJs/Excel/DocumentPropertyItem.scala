package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentPropertyItem extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DocumentPropertyItem")
@js.native
object DocumentPropertyItem extends js.Object {
  @js.native
  sealed trait appName extends DocumentPropertyItem
  
  @js.native
  sealed trait author extends DocumentPropertyItem
  
  @js.native
  sealed trait category extends DocumentPropertyItem
  
  @js.native
  sealed trait comments extends DocumentPropertyItem
  
  @js.native
  sealed trait company extends DocumentPropertyItem
  
  @js.native
  sealed trait creation extends DocumentPropertyItem
  
  @js.native
  sealed trait format extends DocumentPropertyItem
  
  @js.native
  sealed trait keywords extends DocumentPropertyItem
  
  @js.native
  sealed trait lastAuth extends DocumentPropertyItem
  
  @js.native
  sealed trait lastPrint extends DocumentPropertyItem
  
  @js.native
  sealed trait lastSave extends DocumentPropertyItem
  
  @js.native
  sealed trait manager extends DocumentPropertyItem
  
  @js.native
  sealed trait revision extends DocumentPropertyItem
  
  @js.native
  sealed trait subject extends DocumentPropertyItem
  
  @js.native
  sealed trait template extends DocumentPropertyItem
  
  @js.native
  sealed trait title extends DocumentPropertyItem
  
  /* "AppName" */ val appName: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.appName with String = js.native
  /* "Author" */ val author: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.author with String = js.native
  /* "Category" */ val category: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.category with String = js.native
  /* "Comments" */ val comments: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.comments with String = js.native
  /* "Company" */ val company: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.company with String = js.native
  /* "Creation" */ val creation: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.creation with String = js.native
  /* "Format" */ val format: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.format with String = js.native
  /* "Keywords" */ val keywords: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.keywords with String = js.native
  /* "LastAuth" */ val lastAuth: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.lastAuth with String = js.native
  /* "LastPrint" */ val lastPrint: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.lastPrint with String = js.native
  /* "LastSave" */ val lastSave: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.lastSave with String = js.native
  /* "Manager" */ val manager: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.manager with String = js.native
  /* "Revision" */ val revision: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.revision with String = js.native
  /* "Subject" */ val subject: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.subject with String = js.native
  /* "Template" */ val template: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.template with String = js.native
  /* "Title" */ val title: typingsSlinky.officeDashJs.Excel.DocumentPropertyItem.title with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyItem with String] = js.native
}

