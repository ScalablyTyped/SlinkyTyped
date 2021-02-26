package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.antd.modalModalMod.ModalFuncProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookModalMod extends Shortcut {
  
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HookModalProps with RefAttributes[HookModalRef]] = js.native
  
  @js.native
  trait HookModalProps extends StObject {
    
    def afterClose(): Unit = js.native
    
    var config: ModalFuncProps = js.native
  }
  object HookModalProps {
    
    @scala.inline
    def apply(afterClose: () => Unit, config: ModalFuncProps): HookModalProps = {
      val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookModalProps]
    }
    
    @scala.inline
    implicit class HookModalPropsMutableBuilder[Self <: HookModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConfig(value: ModalFuncProps): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HookModalRef extends StObject {
    
    def destroy(): Unit = js.native
    
    def update(config: ModalFuncProps): Unit = js.native
  }
  object HookModalRef {
    
    @scala.inline
    def apply(destroy: () => Unit, update: ModalFuncProps => Unit): HookModalRef = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[HookModalRef]
    }
    
    @scala.inline
    implicit class HookModalRefMutableBuilder[Self <: HookModalRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: ModalFuncProps => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[HookModalProps with RefAttributes[HookModalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `hookModalMod.foo` */
  override def _to: ForwardRefExoticComponent[HookModalProps with RefAttributes[HookModalRef]] = default
}
