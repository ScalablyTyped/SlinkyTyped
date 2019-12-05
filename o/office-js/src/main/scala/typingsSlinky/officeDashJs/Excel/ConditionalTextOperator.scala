package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTextOperator extends js.Object

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends js.Object {
  @js.native
  sealed trait beginsWith extends ConditionalTextOperator
  
  @js.native
  sealed trait contains extends ConditionalTextOperator
  
  @js.native
  sealed trait endsWith extends ConditionalTextOperator
  
  @js.native
  sealed trait invalid extends ConditionalTextOperator
  
  @js.native
  sealed trait notContains extends ConditionalTextOperator
  
  /* "BeginsWith" */ val beginsWith: typingsSlinky.officeDashJs.Excel.ConditionalTextOperator.beginsWith with String = js.native
  /* "Contains" */ val contains: typingsSlinky.officeDashJs.Excel.ConditionalTextOperator.contains with String = js.native
  /* "EndsWith" */ val endsWith: typingsSlinky.officeDashJs.Excel.ConditionalTextOperator.endsWith with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJs.Excel.ConditionalTextOperator.invalid with String = js.native
  /* "NotContains" */ val notContains: typingsSlinky.officeDashJs.Excel.ConditionalTextOperator.notContains with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalTextOperator with String] = js.native
}

