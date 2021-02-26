package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.typesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("@fast-csv/parse/build/src/transforms", "HeaderTransformer")
  @js.native
  class HeaderTransformer[O /* <: Row[_] */] protected ()
    extends typingsSlinky.fastCsvParse.headerTransformerMod.HeaderTransformer[O] {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator")
  @js.native
  class RowTransformerValidator[I /* <: Row[_] */, O /* <: Row[_] */] ()
    extends typingsSlinky.fastCsvParse.rowTransformerValidatorMod.RowTransformerValidator[I, O]
  /* static members */
  object RowTransformerValidator {
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator.createTransform")
    @js.native
    def createTransform: js.Any = js.native
    @scala.inline
    def createTransform_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator.createValidator")
    @js.native
    def createValidator: js.Any = js.native
    @scala.inline
    def createValidator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createValidator")(x.asInstanceOf[js.Any])
  }
}
