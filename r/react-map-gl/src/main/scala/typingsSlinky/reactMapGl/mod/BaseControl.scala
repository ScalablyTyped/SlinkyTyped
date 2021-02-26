package typingsSlinky.reactMapGl.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "BaseControl")
@js.native
class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] protected ()
  extends PureComponent[T, js.Object, js.Any] {
  def this(props: T) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: T, context: js.Any) = this()
  
  var _containerRef: ReactRef[S] = js.native
  
  var _context: MapContextProps = js.native
}
