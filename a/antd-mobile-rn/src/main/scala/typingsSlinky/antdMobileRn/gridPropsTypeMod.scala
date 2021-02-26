package typingsSlinky.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridPropsTypeMod {
  
  @js.native
  trait DataItem
    extends /* key */ StringDictionary[js.Any] {
    
    var icon: js.UndefOr[js.Any] = js.native
    
    var text: js.UndefOr[js.Any] = js.native
  }
  object DataItem {
    
    @scala.inline
    def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait GridPropsType extends StObject {
    
    var carouselMaxRow: js.UndefOr[Double] = js.native
    
    var columnNum: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.native
    
    var hasLine: js.UndefOr[Boolean] = js.native
    
    var isCarousel: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.native
    
    var renderItem: js.UndefOr[
        js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, ReactElement]
      ] = js.native
  }
  object GridPropsType {
    
    @scala.inline
    def apply(): GridPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridPropsType]
    }
    
    @scala.inline
    implicit class GridPropsTypeMutableBuilder[Self <: GridPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarouselMaxRow(value: Double): Self = StObject.set(x, "carouselMaxRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselMaxRowUndefined: Self = StObject.set(x, "carouselMaxRow", js.undefined)
      
      @scala.inline
      def setColumnNum(value: Double): Self = StObject.set(x, "columnNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumUndefined: Self = StObject.set(x, "columnNum", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.UndefOr[DataItem]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.UndefOr[DataItem]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHasLine(value: Boolean): Self = StObject.set(x, "hasLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLineUndefined: Self = StObject.set(x, "hasLine", js.undefined)
      
      @scala.inline
      def setIsCarousel(value: Boolean): Self = StObject.set(x, "isCarousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCarouselUndefined: Self = StObject.set(x, "isCarousel", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRenderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    }
  }
}
