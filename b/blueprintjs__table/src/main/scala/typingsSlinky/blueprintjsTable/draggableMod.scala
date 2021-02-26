package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.anon.PreventDefault
import typingsSlinky.blueprintjsTable.dragTypesMod.IDragHandler
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
  @js.native
  class Draggable protected ()
    extends PureComponent[IDraggableProps, js.Object, js.Any] {
    def this(props: IDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDraggableProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDraggable(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggable(prevProps: IDraggableProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggable(): Unit = js.native
    
    var events: js.Any = js.native
  }
  /* static members */
  object Draggable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable.defaultProps")
    @js.native
    def defaultProps: PreventDefault = js.native
    @scala.inline
    def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDraggableProps
    extends IProps
       with IDragHandler
  object IDraggableProps {
    
    @scala.inline
    def apply(): IDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDraggableProps]
    }
  }
}
