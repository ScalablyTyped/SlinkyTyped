package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.ColorValue
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.BasisType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Distribution", "Distribution")
  @js.native
  class Distribution protected ()
    extends Component[
          DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Distribution", "Distribution")
  @js.native
  val Distribution: ReactComponentClass[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait DistributionProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var basis: js.UndefOr[BasisType] = js.native
    
    var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var fill: js.UndefOr[Boolean] = js.native
    
    var gap: js.UndefOr[GapType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var values: js.Array[ColorValue] = js.native
  }
  object DistributionProps {
    
    @scala.inline
    def apply(values: js.Array[ColorValue]): DistributionProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionProps]
    }
    
    @scala.inline
    implicit class DistributionPropsMutableBuilder[Self <: DistributionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setBasis(value: BasisType): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
      
      @scala.inline
      def setChildren(value: /* repeated */ js.Any => _): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[ColorValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: ColorValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
