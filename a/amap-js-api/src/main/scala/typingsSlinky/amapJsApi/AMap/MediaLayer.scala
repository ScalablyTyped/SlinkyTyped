package typingsSlinky.amapJsApi.AMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaLayer[E /* <: HTMLElement */] extends Layer {
  
  /**
    * 获取显示的范围
    */
  def getBounds(): Bounds = js.native
  
  /**
    * 获取元素
    */
  def getElement(): E | Null = js.native
  
  /**
    * 获取图层选项
    */
  def getOptions(): PartialOptions = js.native
  
  /**
    * 设置显示范围
    * @param bounds 显示范围
    */
  def setBounds(bounds: Bounds): Unit = js.native
  
  /**
    * 设置图层选项
    * @param options 图层选项
    */
  def setOptions(options: PartialOptions): Unit = js.native
}
object MediaLayer {
  
  @js.native
  trait Options
    extends typingsSlinky.amapJsApi.AMap.Layer.Options {
    
    /**
      * 显示范围
      */
    var bounds: js.UndefOr[Bounds] = js.native
    
    /**
      * 透明度
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * 是否可见
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * 缩放范围
      */
    var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
    }
  }
}
