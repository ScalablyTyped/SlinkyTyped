package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamedItemType extends js.Object

/**
  * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
  */
@JSGlobal("Excel.NamedItemType")
@js.native
object NamedItemType extends js.Object {
  @js.native
  sealed trait array extends NamedItemType
  
  @js.native
  sealed trait boolean extends NamedItemType
  
  @js.native
  sealed trait double extends NamedItemType
  
  @js.native
  sealed trait error extends NamedItemType
  
  @js.native
  sealed trait integer extends NamedItemType
  
  @js.native
  sealed trait range extends NamedItemType
  
  @js.native
  sealed trait string extends NamedItemType
  
  /* "Array" */ val array: typingsSlinky.officeDashJs.Excel.NamedItemType.array with String = js.native
  /* "Boolean" */ val boolean: typingsSlinky.officeDashJs.Excel.NamedItemType.boolean with String = js.native
  /* "Double" */ val double: typingsSlinky.officeDashJs.Excel.NamedItemType.double with String = js.native
  /* "Error" */ val error: typingsSlinky.officeDashJs.Excel.NamedItemType.error with String = js.native
  /* "Integer" */ val integer: typingsSlinky.officeDashJs.Excel.NamedItemType.integer with String = js.native
  /* "Range" */ val range: typingsSlinky.officeDashJs.Excel.NamedItemType.range with String = js.native
  /* "String" */ val string: typingsSlinky.officeDashJs.Excel.NamedItemType.string with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NamedItemType with String] = js.native
}

