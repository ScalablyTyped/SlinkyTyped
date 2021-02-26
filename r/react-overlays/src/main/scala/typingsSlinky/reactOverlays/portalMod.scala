package typingsSlinky.reactOverlays

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactOverlays.anon.Container
import typingsSlinky.reactOverlays.useWaitForDOMRefMod.DOMContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  /**
    * @public
    */
  object default {
    
    @JSImport("react-overlays/cjs/Portal", JSImport.Default)
    @js.native
    def apply(hasContainerChildrenOnRendered: PortalProps): ReactElement | Null = js.native
    @JSImport("react-overlays/cjs/Portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/cjs/Portal", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs/Portal", "default.propTypes")
    @js.native
    def propTypes: Container = js.native
    @scala.inline
    def propTypes_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PortalProps extends StObject {
    
    var children: ReactElement = js.native
    
    var container: DOMContainer[HTMLElement] = js.native
    
    var onRendered: js.UndefOr[js.Function1[/* element */ js.Any, Unit]] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(children: ReactElement): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRendered(value: /* element */ js.Any => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
