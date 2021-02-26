package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootRefRootRefMod extends Shortcut {
  
  @JSImport("@material-ui/core/RootRef/RootRef", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RootRefProps[js.Any]] = js.native
  
  @js.native
  trait RootRefProps[T] extends StObject {
    
    var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T]] = js.native
  }
  object RootRefProps {
    
    @scala.inline
    def apply[T](): RootRefProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRefProps[T]]
    }
    
    @scala.inline
    implicit class RootRefPropsMutableBuilder[Self <: RootRefProps[_], T] (val x: Self with RootRefProps[T]) extends AnyVal {
      
      @scala.inline
      def setRootRef(value: (js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "rootRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootRefRefObject(value: ReactRef[T]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RootRefProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rootRefRootRefMod.foo` */
  override def _to: ReactComponentClass[RootRefProps[js.Any]] = default
}
