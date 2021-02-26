package typingsSlinky.reactTextareaAutosize

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.borderBottomWidth
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.borderLeftWidth
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.borderRightWidth
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.borderTopWidth
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.boxSizing
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.fontFamily
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.fontSize
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.fontStyle
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.fontWeight
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.letterSpacing
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.lineHeight
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingBottom
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingLeft
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingRight
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingTop
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.tabSize
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.textIndent
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.textRendering
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.textTransform
import typingsSlinky.reactTextareaAutosize.reactTextareaAutosizeStrings.width
import typingsSlinky.std.Extract
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSizingDataMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/getSizingData", JSImport.Default)
  @js.native
  def default(node: HTMLElement): SizingData | Null = js.native
  
  @js.native
  trait SizingData extends StObject {
    
    var borderSize: Double = js.native
    
    var paddingSize: Double = js.native
    
    var sizingStyle: SizingStyle = js.native
  }
  object SizingData {
    
    @scala.inline
    def apply(borderSize: Double, paddingSize: Double, sizingStyle: SizingStyle): SizingData = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizingData]
    }
    
    @scala.inline
    implicit class SizingDataMutableBuilder[Self <: SizingData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingStyle(value: SizingStyle): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type SizingProps = Extract[
    borderBottomWidth | borderLeftWidth | borderRightWidth | borderTopWidth | boxSizing | fontFamily | fontSize | fontStyle | fontWeight | letterSpacing | lineHeight | paddingBottom | paddingLeft | paddingRight | paddingTop | tabSize | textIndent | textRendering | textTransform | width, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any
  ]
  
  type SizingStyle = Pick[CSSStyleDeclaration, SizingProps]
}
