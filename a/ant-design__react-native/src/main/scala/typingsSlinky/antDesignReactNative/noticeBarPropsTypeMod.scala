package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarPropsTypeMod {
  
  @js.native
  trait NoticeBarPropsType extends StObject {
    
    var action: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var mode: js.UndefOr[closable | link] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object NoticeBarPropsType {
    
    @scala.inline
    def apply(): NoticeBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeBarPropsType]
    }
    
    @scala.inline
    implicit class NoticeBarPropsTypeMutableBuilder[Self <: NoticeBarPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMode(value: closable | link): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    }
  }
}
