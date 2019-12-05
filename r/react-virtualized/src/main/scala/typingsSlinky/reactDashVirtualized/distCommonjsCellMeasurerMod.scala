package typingsSlinky.reactDashVirtualized

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCacheParams
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/CellMeasurer", JSImport.Namespace)
@js.native
object distCommonjsCellMeasurerMod extends js.Object {
  @js.native
  class CellMeasurer ()
    extends Component[CellMeasurerProps, js.Object, js.Any]
  
  @js.native
  class CellMeasurerCache ()
    extends typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
  
}

