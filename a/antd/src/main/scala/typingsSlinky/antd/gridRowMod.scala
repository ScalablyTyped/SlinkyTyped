package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antd.anon.PartialRecordBreakpointnu
import typingsSlinky.antd.antdStrings.`space-around`
import typingsSlinky.antd.antdStrings.`space-between`
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.end
import typingsSlinky.antd.antdStrings.middle
import typingsSlinky.antd.antdStrings.start
import typingsSlinky.antd.antdStrings.stretch
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridRowMod extends Shortcut {
  
  @JSImport("antd/lib/grid/row", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = js.native
  
  type Gutter = Double | PartialRecordBreakpointnu
  
  @js.native
  trait RowProps extends HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.native
    
    var justify: js.UndefOr[start | end | center | `space-around` | `space-between`] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | middle | bottom | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setJustify(value: start | end | center | `space-around` | `space-between`): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `gridRowMod.foo` */
  override def _to: ForwardRefExoticComponent[RowProps with RefAttributes[HTMLDivElement]] = default
}
