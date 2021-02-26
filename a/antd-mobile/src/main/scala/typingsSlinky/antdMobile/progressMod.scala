package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antdMobile.anon.AppearTransition
import typingsSlinky.antdMobile.progressPropsTypeMod.ProgressPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("antd-mobile/lib/progress", JSImport.Default)
  @js.native
  class default () extends Progress
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/progress", "default.defaultProps")
    @js.native
    def defaultProps: AppearTransition = js.native
    @scala.inline
    def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Progress
    extends Component[ProgressProps, js.Any, js.Any] {
    
    var barRef: HTMLDivElement | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MProgress(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MProgress(): Unit = js.native
    
    var noAppearTransition: js.Any = js.native
  }
  
  @js.native
  trait ProgressProps extends ProgressPropsType {
    
    var barStyle: js.UndefOr[CSSProperties] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarStyle(value: CSSProperties): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
