package typingsSlinky.reactVirtualized

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheParams
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/CellMeasurer", JSImport.Namespace)
@js.native
object cellMeasurerMod extends js.Object {
  
  @js.native
  class CellMeasurer ()
    extends Component[CellMeasurerProps, js.Object, js.Any]
  
  @js.native
  class CellMeasurerCache ()
    extends typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
}
