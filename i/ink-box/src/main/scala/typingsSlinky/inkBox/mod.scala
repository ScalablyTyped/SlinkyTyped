package typingsSlinky.inkBox

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.inkBox.anon.Bottom
import typingsSlinky.inkBox.anon.BottomLeft
import typingsSlinky.inkBox.inkBoxStrings.classic
import typingsSlinky.inkBox.inkBoxStrings.double
import typingsSlinky.inkBox.inkBoxStrings.doubleSingle
import typingsSlinky.inkBox.inkBoxStrings.round
import typingsSlinky.inkBox.inkBoxStrings.single
import typingsSlinky.inkBox.inkBoxStrings.singleDouble
import typingsSlinky.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-box", JSImport.Namespace)
  @js.native
  val ^ : FC[BoxProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.inkBox.inkBoxStrings.right
    - typingsSlinky.inkBox.inkBoxStrings.center
    - typingsSlinky.inkBox.inkBoxStrings.left
  */
  trait Alignment extends StObject
  object Alignment {
    
    @scala.inline
    def center: typingsSlinky.inkBox.inkBoxStrings.center = "center".asInstanceOf[typingsSlinky.inkBox.inkBoxStrings.center]
    
    @scala.inline
    def left: typingsSlinky.inkBox.inkBoxStrings.left = "left".asInstanceOf[typingsSlinky.inkBox.inkBoxStrings.left]
    
    @scala.inline
    def right: typingsSlinky.inkBox.inkBoxStrings.right = "right".asInstanceOf[typingsSlinky.inkBox.inkBoxStrings.right]
  }
  
  @js.native
  trait BoxProps extends StObject {
    
    var align: js.UndefOr[Alignment] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var borderStyle: js.UndefOr[single | double | round | singleDouble | doubleSingle | classic | BottomLeft] = js.native
    
    var dimBorder: js.UndefOr[Boolean] = js.native
    
    var float: js.UndefOr[Alignment] = js.native
    
    var margin: js.UndefOr[Spacing] = js.native
    
    var padding: js.UndefOr[Spacing] = js.native
  }
  object BoxProps {
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      @scala.inline
      def setFloat(value: Alignment): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type Spacing = Double | Bottom
  
  type _To = FC[BoxProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[BoxProps] = ^
}
