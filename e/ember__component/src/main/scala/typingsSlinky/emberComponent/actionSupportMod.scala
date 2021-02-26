package typingsSlinky.emberComponent

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionSupportMod extends Shortcut {
  
  @JSImport("@ember/component/-private/action-support", JSImport.Default)
  @js.native
  val default: typingsSlinky.emberObject.mixinMod.default[ActionSupport, typingsSlinky.emberObject.mod.default] = js.native
  
  @js.native
  trait ActionSupport extends StObject {
    
    def sendAction(action: String, params: js.Any*): Unit = js.native
  }
  object ActionSupport {
    
    @scala.inline
    def apply(sendAction: (String, /* repeated */ js.Any) => Unit): ActionSupport = {
      val __obj = js.Dynamic.literal(sendAction = js.Any.fromFunction2(sendAction))
      __obj.asInstanceOf[ActionSupport]
    }
    
    @scala.inline
    implicit class ActionSupportMutableBuilder[Self <: ActionSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSendAction(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "sendAction", js.Any.fromFunction2(value))
    }
  }
  
  type _To = typingsSlinky.emberObject.mixinMod.default[ActionSupport, typingsSlinky.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `actionSupportMod.foo` */
  override def _to: typingsSlinky.emberObject.mixinMod.default[ActionSupport, typingsSlinky.emberObject.mod.default] = default
}
