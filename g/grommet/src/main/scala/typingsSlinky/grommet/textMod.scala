package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.`break-all`
import typingsSlinky.grommet.grommetStrings.`break-word`
import typingsSlinky.grommet.grommetStrings.`keep-all`
import typingsSlinky.grommet.grommetStrings.bold
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.normal
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.utilsMod.PolymorphicType
import typingsSlinky.grommet.utilsMod.TextAlignType
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("grommet/components/Text", "Text")
  @js.native
  val Text: ReactComponentClass[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = js.native
  
  @js.native
  trait TextProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var as: js.UndefOr[PolymorphicType] = js.native
    
    var color: js.UndefOr[ColorType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.native
    
    var tag: js.UndefOr[PolymorphicType] = js.native
    
    var textAlign: js.UndefOr[TextAlignType] = js.native
    
    var truncate: js.UndefOr[Boolean] = js.native
    
    var weight: js.UndefOr[normal | bold | Double] = js.native
    
    var wordBreak: js.UndefOr[normal | `break-all` | `keep-all` | `break-word`] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setWeight(value: normal | bold | Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      @scala.inline
      def setWordBreak(value: normal | `break-all` | `keep-all` | `break-word`): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
    }
  }
}
