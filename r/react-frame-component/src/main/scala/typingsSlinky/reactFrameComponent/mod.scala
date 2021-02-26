package typingsSlinky.reactFrameComponent

import org.scalajs.dom.raw.HTMLIFrameElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.IframeHTMLAttributes
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frame-component", JSImport.Default)
  @js.native
  class default ()
    extends Component[FrameComponentProps, js.Object, js.Any]
  
  @JSImport("react-frame-component", "FrameContext")
  @js.native
  val FrameContext: Context[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  val FrameContextConsumer: ReactComponentClass[ConsumerProps[FrameContextProps]] = js.native
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val FrameContextProvider: ReactComponentClass[ProviderProps[FrameContextProps]] = js.native
  
  type FrameComponent = ReactComponentClass[FrameComponentProps]
  
  @js.native
  trait FrameComponentProps extends IframeHTMLAttributes[HTMLIFrameElement] {
    
    @JSName("children")
    var children_FrameComponentProps: ReactElement = js.native
    
    var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    var head: js.UndefOr[ReactElement] = js.native
    
    var initialContent: js.UndefOr[String] = js.native
    
    var mountTarget: js.UndefOr[String] = js.native
  }
  object FrameComponentProps {
    
    @scala.inline
    def apply(): FrameComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameComponentProps]
    }
    
    @scala.inline
    implicit class FrameComponentPropsMutableBuilder[Self <: FrameComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContentDidMount(value: () => Unit): Self = StObject.set(x, "contentDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentDidMountUndefined: Self = StObject.set(x, "contentDidMount", js.undefined)
      
      @scala.inline
      def setContentDidUpdate(value: () => Unit): Self = StObject.set(x, "contentDidUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentDidUpdateUndefined: Self = StObject.set(x, "contentDidUpdate", js.undefined)
      
      @scala.inline
      def setHead(value: ReactElement): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadReactElement(value: ReactElement): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setInitialContent(value: String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      @scala.inline
      def setMountTarget(value: String): Self = StObject.set(x, "mountTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountTargetUndefined: Self = StObject.set(x, "mountTarget", js.undefined)
    }
  }
  
  @js.native
  trait FrameContextProps extends StObject {
    
    var document: js.UndefOr[js.Any] = js.native
    
    var window: js.UndefOr[js.Any] = js.native
  }
  object FrameContextProps {
    
    @scala.inline
    def apply(): FrameContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameContextProps]
    }
    
    @scala.inline
    implicit class FrameContextPropsMutableBuilder[Self <: FrameContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
