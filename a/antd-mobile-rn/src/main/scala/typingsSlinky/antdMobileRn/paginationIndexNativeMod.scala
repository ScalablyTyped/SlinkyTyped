package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AntLocale
import typingsSlinky.antdMobileRn.anon.Current
import typingsSlinky.antdMobileRn.paginationPropsTypeMod.PaginationPropsType
import typingsSlinky.antdMobileRn.paginationPropsTypeMod.PaginationState
import typingsSlinky.antdMobileRn.paginationStyleIndexNativeMod.IPaginationStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/pagination/index.native", JSImport.Default)
  @js.native
  class default protected () extends Pagination {
    def this(props: PaginationNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/pagination/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/pagination/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    @scala.inline
    def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pagination
    extends Component[PaginationNativeProps, PaginationState, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MPagination(nextProps: PaginationNativeProps): Unit = js.native
    
    def onChange(p: Double): Unit = js.native
  }
  
  @js.native
  trait PaginationNativeProps extends PaginationPropsType {
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[IPaginationStyle] = js.native
  }
  object PaginationNativeProps {
    
    @scala.inline
    def apply(current: Double, total: Double): PaginationNativeProps = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNativeProps]
    }
    
    @scala.inline
    implicit class PaginationNativePropsMutableBuilder[Self <: PaginationNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: IPaginationStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
