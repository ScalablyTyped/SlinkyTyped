package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.ActionTextUnderlayColor
import typingsSlinky.antDesignReactNative.anon.DefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PopupMixin", JSImport.Default)
  @js.native
  def default(
    getModal: js.Function3[/* props */ js.Any, /* visible */ js.Any, /* args */ Args, ReactElement],
    platformProps: ActionTextUnderlayColor
  ): DefaultProps = js.native
  
  @js.native
  trait Args extends StObject {
    
    var getContent: js.Any = js.native
    
    var hide: js.Any = js.native
    
    var onDismiss: js.Any = js.native
    
    var onOk: js.Any = js.native
  }
  object Args {
    
    @scala.inline
    def apply(getContent: js.Any, hide: js.Any, onDismiss: js.Any, onOk: js.Any): Args = {
      val __obj = js.Dynamic.literal(getContent = getContent.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContent(value: js.Any): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismiss(value: js.Any): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOk(value: js.Any): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
    }
  }
}
