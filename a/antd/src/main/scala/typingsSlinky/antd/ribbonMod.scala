package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ribbonMod extends Shortcut {
  
  @JSImport("antd/lib/badge/Ribbon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RibbonProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.start
    - typingsSlinky.antd.antdStrings.end
  */
  trait RibbonPlacement extends StObject
  object RibbonPlacement {
    
    @scala.inline
    def end: typingsSlinky.antd.antdStrings.end = "end".asInstanceOf[typingsSlinky.antd.antdStrings.end]
    
    @scala.inline
    def start: typingsSlinky.antd.antdStrings.start = "start".asInstanceOf[typingsSlinky.antd.antdStrings.start]
  }
  
  @js.native
  trait RibbonProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.native
    
    var placement: js.UndefOr[RibbonPlacement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var text: js.UndefOr[ReactElement] = js.native
  }
  object RibbonProps {
    
    @scala.inline
    def apply(): RibbonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonProps]
    }
    
    @scala.inline
    implicit class RibbonPropsMutableBuilder[Self <: RibbonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setPlacement(value: RibbonPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextReactElement(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RibbonProps]
  
  /* This means you don't have to write `default`, but can instead just say `ribbonMod.foo` */
  override def _to: ReactComponentClass[RibbonProps] = default
}
