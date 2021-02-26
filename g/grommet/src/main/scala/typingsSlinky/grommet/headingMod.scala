package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLHeadingElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.`1`
import typingsSlinky.grommet.grommetStrings.`2`
import typingsSlinky.grommet.grommetStrings.`3`
import typingsSlinky.grommet.grommetStrings.`4`
import typingsSlinky.grommet.grommetStrings.`5`
import typingsSlinky.grommet.grommetStrings.`6`
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
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

object headingMod {
  
  @JSImport("grommet/components/Heading", "Heading")
  @js.native
  val Heading: ReactComponentClass[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = js.native
  
  @js.native
  trait HeadingProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var as: js.UndefOr[PolymorphicType] = js.native
    
    var color: js.UndefOr[ColorType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var level: js.UndefOr[
        `1` | `2` | `3` | `4` | `5` | `6` | typingsSlinky.grommet.grommetNumbers.`1` | typingsSlinky.grommet.grommetNumbers.`2` | typingsSlinky.grommet.grommetNumbers.`3` | typingsSlinky.grommet.grommetNumbers.`4` | typingsSlinky.grommet.grommetNumbers.`5` | typingsSlinky.grommet.grommetNumbers.`6`
      ] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var textAlign: js.UndefOr[TextAlignType] = js.native
    
    var truncate: js.UndefOr[Boolean] = js.native
  }
  object HeadingProps {
    
    @scala.inline
    def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
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
      def setLevel(
        value: `1` | `2` | `3` | `4` | `5` | `6` | typingsSlinky.grommet.grommetNumbers.`1` | typingsSlinky.grommet.grommetNumbers.`2` | typingsSlinky.grommet.grommetNumbers.`3` | typingsSlinky.grommet.grommetNumbers.`4` | typingsSlinky.grommet.grommetNumbers.`5` | typingsSlinky.grommet.grommetNumbers.`6`
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
