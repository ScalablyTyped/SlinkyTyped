package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.typesMod.HeaderArray
import typingsSlinky.fastCsvParse.typesMod.Row
import typingsSlinky.fastCsvParse.typesMod.RowArray
import typingsSlinky.fastCsvParse.typesMod.RowValidatorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerTransformerMod {
  
  @JSImport("@fast-csv/parse/build/src/transforms/HeaderTransformer", "HeaderTransformer")
  @js.native
  class HeaderTransformer[O /* <: Row[_] */] protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    var headers: HeaderArray | Null = js.native
    
    var headersLength: js.Any = js.native
    
    val headersTransform: js.Any = js.native
    
    var mapHeaders: js.Any = js.native
    
    val parserOptions: js.Any = js.native
    
    var processRow: js.Any = js.native
    
    var processedFirstRow: js.Any = js.native
    
    var receivedHeaders: js.Any = js.native
    
    var setHeaders: js.Any = js.native
    
    var shouldMapRow: js.Any = js.native
    
    val shouldUseFirstRow: js.Any = js.native
    
    def transform(row: RowArray[_], cb: RowValidatorCallback[O]): Unit = js.native
  }
}
