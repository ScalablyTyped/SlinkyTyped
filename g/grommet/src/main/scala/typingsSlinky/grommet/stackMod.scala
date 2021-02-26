package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.`bottom-left`
import typingsSlinky.grommet.grommetStrings.`bottom-right`
import typingsSlinky.grommet.grommetStrings.`top-left`
import typingsSlinky.grommet.grommetStrings.`top-right`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.center
import typingsSlinky.grommet.grommetStrings.first
import typingsSlinky.grommet.grommetStrings.last
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("grommet/components/Stack", "Stack")
  @js.native
  val Stack: ReactComponentClass[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait StackProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var anchor: js.UndefOr[
        center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ] = js.native
    
    var fill: js.UndefOr[FillType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var guidingChild: js.UndefOr[Double | first | last] = js.native
    
    var interactiveChild: js.UndefOr[Double | first | last] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
  }
  object StackProps {
    
    @scala.inline
    def apply(): StackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackProps]
    }
    
    @scala.inline
    implicit class StackPropsMutableBuilder[Self <: StackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGuidingChild(value: Double | first | last): Self = StObject.set(x, "guidingChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidingChildUndefined: Self = StObject.set(x, "guidingChild", js.undefined)
      
      @scala.inline
      def setInteractiveChild(value: Double | first | last): Self = StObject.set(x, "interactiveChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveChildUndefined: Self = StObject.set(x, "interactiveChild", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
}
