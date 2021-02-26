package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.cardMod.CardProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartCardMod {
  
  @JSImport("ant-design-pro/lib/Charts/ChartCard", JSImport.Default)
  @js.native
  class default ()
    extends Component[IChartCardProps, js.Any, js.Any]
  
  type ChartCard = ReactComponentClass[IChartCardProps]
  
  @js.native
  trait IChartCardProps extends CardProps {
    
    var action: js.UndefOr[ReactElement] = js.native
    
    var avatar: js.UndefOr[ReactElement] = js.native
    
    var contentHeight: js.UndefOr[Double] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    @JSName("title")
    var title_IChartCardProps: ReactElement = js.native
    
    var total: js.UndefOr[ReactElement | Double | (js.Function0[ReactElement | Double])] = js.native
  }
  object IChartCardProps {
    
    @scala.inline
    def apply(): IChartCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChartCardProps]
    }
    
    @scala.inline
    implicit class IChartCardPropsMutableBuilder[Self <: IChartCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionReactElement(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarReactElement(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTotal(value: ReactElement | Double | (js.Function0[ReactElement | Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFunction0(value: () => ReactElement | Double): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTotalReactElement(value: ReactElement): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
