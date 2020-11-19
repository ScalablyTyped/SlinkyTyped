package typingsSlinky.reactMapGl.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "BaseControl")
@js.native
class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] ()
  extends Component[T, js.Object, js.Any] {
  
  var _containerRef: ReactRef[S] = js.native
  
  var _context: MapContextProps = js.native
}
