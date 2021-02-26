package typingsSlinky.jupyterlabUiComponents

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components/interface", "DEFAULT_STYLE_CLASS")
  @js.native
  val DEFAULT_STYLE_CLASS: /* "jp-DefaultStyle" */ String = js.native
  
  @js.native
  trait IElementRefProps[E /* <: HTMLElement */] extends StObject {
    
    /** Ref handler to access the instance of the internal HTML element. */
    var elementRef: js.UndefOr[js.Function1[/* ref */ E | Null, Unit]] = js.native
  }
  object IElementRefProps {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementRefProps[E]]
    }
    
    @scala.inline
    implicit class IElementRefPropsMutableBuilder[Self <: IElementRefProps[_], E /* <: HTMLElement */] (val x: Self with IElementRefProps[E]) extends AnyVal {
      
      @scala.inline
      def setElementRef(value: /* ref */ E | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    }
  }
}
