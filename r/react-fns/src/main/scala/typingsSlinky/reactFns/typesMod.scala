package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[/* component */ CompositeComponent[TMergedProps], ReactComponentClass[TOwnProps]]
  
  type CompositeComponent[P] = ReactComponentClass[P]
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  
  @js.native
  trait SharedRenderProps[P] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* props */ P, ReactElement]) | ReactElement] = js.native
    
    var component: js.UndefOr[ReactComponentClass[P | Unit]] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var render: js.UndefOr[js.Function1[/* props */ P, ReactElement]] = js.native
  }
  object SharedRenderProps {
    
    @scala.inline
    def apply[P](): SharedRenderProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedRenderProps[P]]
    }
    
    @scala.inline
    implicit class SharedRenderPropsMutableBuilder[Self <: SharedRenderProps[_], P] (val x: Self with SharedRenderProps[P]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ P, ReactElement]) | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ P => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactComponentClass[P | Unit]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[P | Unit]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[P | Unit]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setRender(value: /* props */ P => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
