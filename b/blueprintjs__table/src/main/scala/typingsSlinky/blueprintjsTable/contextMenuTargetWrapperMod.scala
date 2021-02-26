package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuTargetWrapperMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  class ContextMenuTargetWrapper protected ()
    extends PureComponent[IContextMenuTargetWrapper, js.Object, js.Any] {
    def this(props: IContextMenuTargetWrapper) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IContextMenuTargetWrapper, context: js.Any) = this()
    
    def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): ReactElement = js.native
  }
  
  @js.native
  trait IContextMenuTargetWrapper extends IProps {
    
    def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): ReactElement = js.native
    
    var style: CSSProperties = js.native
  }
  object IContextMenuTargetWrapper {
    
    @scala.inline
    def apply(renderContextMenu: SyntheticMouseEvent[HTMLElement] => ReactElement, style: CSSProperties): IContextMenuTargetWrapper = {
      val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextMenuTargetWrapper]
    }
    
    @scala.inline
    implicit class IContextMenuTargetWrapperMutableBuilder[Self <: IContextMenuTargetWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderContextMenu(value: SyntheticMouseEvent[HTMLElement] => ReactElement): Self = StObject.set(x, "renderContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
