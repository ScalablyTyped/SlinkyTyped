package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NamedItemType extends StObject
/**
  * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
  */
@JSGlobal("Excel.NamedItemType")
@js.native
object NamedItemType extends StObject {
  
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
}
