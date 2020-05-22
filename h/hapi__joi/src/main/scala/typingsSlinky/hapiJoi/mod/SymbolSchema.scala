package typingsSlinky.hapiJoi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.hapiJoi.mod._Schema because Already inherited */ @js.native
trait SymbolSchema extends AnySchema {
  def map(iterable: StringDictionary[js.Symbol]): this.type = js.native
  // TODO: support number and symbol index
  def map(iterable: js.Iterable[js.Tuple2[String | Double | Boolean | js.Symbol, js.Symbol]]): this.type = js.native
}

