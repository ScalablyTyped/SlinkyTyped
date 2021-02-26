package typingsSlinky.mobxReact

import slinky.core.ReactComponentClass
import typingsSlinky.mobxReact.ireactcomponentMod.IReactComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iwrappedcomponentMod {
  
  @js.native
  trait IWrappedComponent[P] extends StObject {
    
    var wrappedComponent: IReactComponent[P] = js.native
  }
  object IWrappedComponent {
    
    @scala.inline
    def apply[P](wrappedComponent: IReactComponent[P]): IWrappedComponent[P] = {
      val __obj = js.Dynamic.literal(wrappedComponent = wrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWrappedComponent[P]]
    }
    
    @scala.inline
    implicit class IWrappedComponentMutableBuilder[Self <: IWrappedComponent[_], P] (val x: Self with IWrappedComponent[P]) extends AnyVal {
      
      @scala.inline
      def setWrappedComponent(value: IReactComponent[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedComponentClassicComponentClass(value: ReactComponentClass[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedComponentComponentClass(value: ReactComponentClass[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappedComponentFunctionComponent(value: ReactComponentClass[P]): Self = StObject.set(x, "wrappedComponent", value.asInstanceOf[js.Any])
    }
  }
}
