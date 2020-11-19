package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.typesMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  
  @js.native
  class HeaderTransformer[O /* <: Row[_] */] protected ()
    extends typingsSlinky.fastCsvParse.headerTransformerMod.HeaderTransformer[O] {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator[I /* <: Row[_] */, O /* <: Row[_] */] ()
    extends typingsSlinky.fastCsvParse.rowTransformerValidatorMod.RowTransformerValidator[I, O]
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    
    var createTransform: js.Any = js.native
    
    var createValidator: js.Any = js.native
  }
}
