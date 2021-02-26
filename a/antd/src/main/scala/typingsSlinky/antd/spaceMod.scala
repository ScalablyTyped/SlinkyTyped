package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.baseline
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.end
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.start
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMod extends Shortcut {
  
  @JSImport("antd/lib/space", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SpaceProps] = js.native
  
  @JSImport("antd/lib/space", "LastIndexContext")
  @js.native
  val LastIndexContext: Context[Double] = js.native
  
  @js.native
  trait SpaceProps extends StObject {
    
    var align: js.UndefOr[start | end | center | baseline] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SizeType | Double] = js.native
    
    var split: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SpaceProps {
    
    @scala.inline
    def apply(): SpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceProps]
    }
    
    @scala.inline
    implicit class SpacePropsMutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | end | center | baseline): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitReactElement(value: ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SpaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `spaceMod.foo` */
  override def _to: ReactComponentClass[SpaceProps] = default
}
