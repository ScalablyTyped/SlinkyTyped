package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatRuleType extends StObject
/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatRuleType")
@js.native
object ConditionalFormatRuleType extends StObject {
  
  @js.native
  sealed trait automatic extends ConditionalFormatRuleType
  
  @js.native
  sealed trait formula extends ConditionalFormatRuleType
  
  @js.native
  sealed trait highestValue extends ConditionalFormatRuleType
  
  @js.native
  sealed trait invalid extends ConditionalFormatRuleType
  
  @js.native
  sealed trait lowestValue extends ConditionalFormatRuleType
  
  @js.native
  sealed trait number extends ConditionalFormatRuleType
  
  @js.native
  sealed trait percent extends ConditionalFormatRuleType
  
  @js.native
  sealed trait percentile extends ConditionalFormatRuleType
}
