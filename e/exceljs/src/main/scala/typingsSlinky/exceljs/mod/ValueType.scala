package typingsSlinky.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends StObject
@JSImport("exceljs", "ValueType")
@js.native
object ValueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait Boolean extends ValueType
  /* 9 */ val Boolean: typingsSlinky.exceljs.mod.ValueType.Boolean with Double = js.native
  
  @js.native
  sealed trait Date extends ValueType
  /* 4 */ val Date: typingsSlinky.exceljs.mod.ValueType.Date with Double = js.native
  
  @js.native
  sealed trait Error extends ValueType
  /* 10 */ val Error: typingsSlinky.exceljs.mod.ValueType.Error with Double = js.native
  
  @js.native
  sealed trait Formula extends ValueType
  /* 6 */ val Formula: typingsSlinky.exceljs.mod.ValueType.Formula with Double = js.native
  
  @js.native
  sealed trait Hyperlink extends ValueType
  /* 5 */ val Hyperlink: typingsSlinky.exceljs.mod.ValueType.Hyperlink with Double = js.native
  
  @js.native
  sealed trait Merge extends ValueType
  /* 1 */ val Merge: typingsSlinky.exceljs.mod.ValueType.Merge with Double = js.native
  
  @js.native
  sealed trait Null extends ValueType
  /* 0 */ val Null: typingsSlinky.exceljs.mod.ValueType.Null with Double = js.native
  
  @js.native
  sealed trait Number extends ValueType
  /* 2 */ val Number: typingsSlinky.exceljs.mod.ValueType.Number with Double = js.native
  
  @js.native
  sealed trait RichText extends ValueType
  /* 8 */ val RichText: typingsSlinky.exceljs.mod.ValueType.RichText with Double = js.native
  
  @js.native
  sealed trait SharedString extends ValueType
  /* 7 */ val SharedString: typingsSlinky.exceljs.mod.ValueType.SharedString with Double = js.native
  
  @js.native
  sealed trait String extends ValueType
  /* 3 */ val String: typingsSlinky.exceljs.mod.ValueType.String with Double = js.native
}
