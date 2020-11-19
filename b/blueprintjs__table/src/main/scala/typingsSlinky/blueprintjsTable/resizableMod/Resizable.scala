package typingsSlinky.blueprintjsTable.resizableMod

import typingsSlinky.blueprintjsCore.mod.AbstractPureComponent2
import typingsSlinky.blueprintjsTable.anon.IsResizable
import typingsSlinky.blueprintjsTable.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
class Resizable ()
  extends AbstractPureComponent2[IResizableProps, IResizeableState, js.Object] {
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizable(prevProps: IResizableProps): Unit = js.native
  
  /**
    * Returns the CSS style to apply to the child element given the state's
    * size value.
    */
  var getStyle: js.Any = js.native
  
  var offsetSize: js.Any = js.native
  
  var onResizeEnd: js.Any = js.native
  
  var onResizeMove: js.Any = js.native
  
  var renderResizeHandle: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  
  var defaultProps: IsResizable = js.native
  
  def getDerivedStateFromProps(hasSize: IResizableProps, prevState: IResizeableState): Size = js.native
}
