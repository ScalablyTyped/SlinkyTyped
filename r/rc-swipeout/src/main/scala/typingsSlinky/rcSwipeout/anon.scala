package typingsSlinky.rcSwipeout

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoClose extends StObject {
    
    var autoClose: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var left: js.Array[scala.Nothing] = js.native
    
    def onClose(): Unit = js.native
    
    def onOpen(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var right: js.Array[scala.Nothing] = js.native
  }
  object AutoClose {
    
    @scala.inline
    def apply(
      autoClose: Boolean,
      disabled: Boolean,
      left: js.Array[scala.Nothing],
      onClose: () => Unit,
      onOpen: () => Unit,
      prefixCls: String,
      right: js.Array[scala.Nothing]
    ): AutoClose = {
      val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoClose]
    }
    
    @scala.inline
    implicit class AutoCloseMutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: js.Array[scala.Nothing]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftVarargs(value: scala.Nothing*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: js.Array[scala.Nothing]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightVarargs(value: scala.Nothing*): Self = StObject.set(x, "right", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BackgroundColor extends StObject {
    
    var backgroundColor: String = js.native
    
    var color: String = js.native
    
    var component: ReactElement = js.native
    
    var disabled: Boolean = js.native
    
    var onPress: js.Any = js.native
    
    var text: js.Any = js.native
    
    var `type`: String = js.native
  }
  object BackgroundColor {
    
    @scala.inline
    def apply(
      backgroundColor: String,
      color: String,
      component: ReactElement,
      disabled: Boolean,
      onPress: js.Any,
      text: js.Any,
      `type`: String
    ): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPress(value: js.Any): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var text: ReactElement = js.native
    
    var `type`: js.UndefOr[js.Any] = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
