package typingsSlinky.fastCsvFormat

import typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typingsSlinky.fastCsvFormat.typesMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/format/build/src/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  
  @js.native
  class FieldFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typingsSlinky.fastCsvFormat.fieldFormatterMod.FieldFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  
  @js.native
  class RowFormatter[I /* <: Row */, O /* <: Row */] protected ()
    extends typingsSlinky.fastCsvFormat.rowFormatterMod.RowFormatter[I, O] {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
  }
  /* static members */
  @js.native
  object RowFormatter extends js.Object {
    
    var createTransform: js.Any = js.native
    
    var gatherHeaders: js.Any = js.native
    
    var isHashArray: js.Any = js.native
  }
}
