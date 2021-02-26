package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyButtonMod {
  
  @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
  @js.native
  class default protected () extends CopyButton {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/copy-button/copy-button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/copy-button/copy-button", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait CopyButton extends StObject {
    
    def handleAnimationEnd(event: js.Any): Unit = js.native
    
    def handleClick(): Unit = js.native
  }
  object CopyButton {
    
    @scala.inline
    def apply(handleAnimationEnd: js.Any => Unit, handleClick: () => Unit): CopyButton = {
      val __obj = js.Dynamic.literal(handleAnimationEnd = js.Any.fromFunction1(handleAnimationEnd), handleClick = js.Any.fromFunction0(handleClick))
      __obj.asInstanceOf[CopyButton]
    }
    
    @scala.inline
    implicit class CopyButtonMutableBuilder[Self <: CopyButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleAnimationEnd(value: js.Any => Unit): Self = StObject.set(x, "handleAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
    }
  }
}
