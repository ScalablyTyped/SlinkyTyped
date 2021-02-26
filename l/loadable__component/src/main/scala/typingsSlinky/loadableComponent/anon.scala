package typingsSlinky.loadableComponent

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.loadableComponent.mod.LoadableLibrary
import typingsSlinky.loadableComponent.mod.OptionsWithoutResolver
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children[Module] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* module */ Module, ReactElement]] = js.native
    
    var fallback: js.UndefOr[ReactElement] = js.native
    
    var ref: js.UndefOr[Ref[Module]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply[Module](): Children[Module] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[Module]]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children[_], Module] (val x: Self with Children[Module]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* module */ Module => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Module]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ Module | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[Module]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait Fallback extends StObject {
    
    var fallback: js.UndefOr[ReactElement] = js.native
  }
  object Fallback {
    
    @scala.inline
    def apply(): Fallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fallback]
    }
    
    @scala.inline
    implicit class FallbackMutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[Props, Module](loadFn: js.Function1[/* props */ Props, js.Promise[Module]]): LoadableLibrary[Module] = js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithoutResolver[Props]
    ): LoadableLibrary[Module] = js.native
  }
}
