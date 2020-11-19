package typingsSlinky.joi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolSchema extends AnySchema {
  
  def map(iterable: StringDictionary[js.Symbol]): this.type = js.native
  // TODO: support number and symbol index
  def map(iterable: js.Iterable[js.Tuple2[String | Double | Boolean | js.Symbol, js.Symbol]]): this.type = js.native
}
