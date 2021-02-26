package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("rc-picker/es/panels/Header", JSImport.Default)
  @js.native
  def default(
    hasPrefixClsPrevIconNextIconSuperPrevIconSuperNextIconOnSuperPrevOnSuperNextOnPrevOnNextChildren: HeaderProps
  ): ReactElement = js.native
  
  @js.native
  trait HeaderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    /** Next one step */
    var onNext: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Last one step */
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Next multiple steps */
    var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Last multiple steps */
    var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
  }
  object HeaderProps {
    
    @scala.inline
    def apply(prefixCls: String): HeaderProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      @scala.inline
      def setOnSuperNext(value: () => Unit): Self = StObject.set(x, "onSuperNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuperNextUndefined: Self = StObject.set(x, "onSuperNext", js.undefined)
      
      @scala.inline
      def setOnSuperPrev(value: () => Unit): Self = StObject.set(x, "onSuperPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuperPrevUndefined: Self = StObject.set(x, "onSuperPrev", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIcon(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconReactElement(value: ReactElement): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
    }
  }
}
