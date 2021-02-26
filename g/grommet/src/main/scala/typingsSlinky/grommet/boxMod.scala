package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.Delay
import typingsSlinky.grommet.anon.Error
import typingsSlinky.grommet.anon.Grow
import typingsSlinky.grommet.anon.Horizontal
import typingsSlinky.grommet.anon.Max
import typingsSlinky.grommet.grommetStrings.`column-reverse`
import typingsSlinky.grommet.grommetStrings.`row-responsive`
import typingsSlinky.grommet.grommetStrings.`row-reverse`
import typingsSlinky.grommet.grommetStrings.around
import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.baseline
import typingsSlinky.grommet.grommetStrings.between
import typingsSlinky.grommet.grommetStrings.center
import typingsSlinky.grommet.grommetStrings.column
import typingsSlinky.grommet.grommetStrings.end
import typingsSlinky.grommet.grommetStrings.evenly
import typingsSlinky.grommet.grommetStrings.fadeIn
import typingsSlinky.grommet.grommetStrings.fadeOut
import typingsSlinky.grommet.grommetStrings.grow
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.jiggle
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.pulse
import typingsSlinky.grommet.grommetStrings.reverse
import typingsSlinky.grommet.grommetStrings.rotateLeft
import typingsSlinky.grommet.grommetStrings.rotateRight
import typingsSlinky.grommet.grommetStrings.row
import typingsSlinky.grommet.grommetStrings.scroll
import typingsSlinky.grommet.grommetStrings.shrink
import typingsSlinky.grommet.grommetStrings.slideDown
import typingsSlinky.grommet.grommetStrings.slideLeft
import typingsSlinky.grommet.grommetStrings.slideRight
import typingsSlinky.grommet.grommetStrings.slideUp
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.start
import typingsSlinky.grommet.grommetStrings.stretch
import typingsSlinky.grommet.grommetStrings.visible
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.grommetStrings.zoomIn
import typingsSlinky.grommet.grommetStrings.zoomOut
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignContentType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.BackgroundType
import typingsSlinky.grommet.utilsMod.BasisType
import typingsSlinky.grommet.utilsMod.BorderType
import typingsSlinky.grommet.utilsMod.ElevationType
import typingsSlinky.grommet.utilsMod.FillType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PadType
import typingsSlinky.grommet.utilsMod.PolymorphicType
import typingsSlinky.grommet.utilsMod.RoundType
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod {
  
  @JSImport("grommet/components/Box", "Box")
  @js.native
  val Box: ReactComponentClass[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait BoxProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
    
    var alignContent: js.UndefOr[AlignContentType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var animation: js.UndefOr[
        fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
          fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
        ])
      ] = js.native
    
    var as: js.UndefOr[PolymorphicType] = js.native
    
    var background: js.UndefOr[BackgroundType] = js.native
    
    var basis: js.UndefOr[BasisType] = js.native
    
    var border: js.UndefOr[BorderType] = js.native
    
    var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.native
    
    var elevation: js.UndefOr[ElevationType] = js.native
    
    var fill: js.UndefOr[FillType] = js.native
    
    var flex: js.UndefOr[grow | shrink | Boolean | Grow] = js.native
    
    var focusIndicator: js.UndefOr[Boolean] = js.native
    
    var gap: js.UndefOr[GapType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.native
    
    var hoverIndicator: js.UndefOr[BackgroundType | Boolean] = js.native
    
    var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.native
    
    var pad: js.UndefOr[PadType] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var round: js.UndefOr[RoundType] = js.native
    
    var tag: js.UndefOr[PolymorphicType] = js.native
    
    var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.native
    
    var wrap: js.UndefOr[Boolean | reverse] = js.native
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
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(
        value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
              fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
            ])
      ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAnimationVarargs(
        value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay)*
      ): Self = StObject.set(x, "animation", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBasis(value: BasisType): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
      
      @scala.inline
      def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: row | column | `row-responsive` | `row-reverse` | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFlex(value: grow | shrink | Boolean | Grow): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      @scala.inline
      def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHeight(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHoverIndicator(value: BackgroundType | Boolean): Self = StObject.set(x, "hoverIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverIndicatorUndefined: Self = StObject.set(x, "hoverIndicator", js.undefined)
      
      @scala.inline
      def setJustify(value: around | between | center | end | evenly | start | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setWidth(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean | reverse): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type BoxTypes = BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
}
