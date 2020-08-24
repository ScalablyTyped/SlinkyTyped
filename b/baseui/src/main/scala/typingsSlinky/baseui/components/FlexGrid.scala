package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.blockMod.AlignContent
import typingsSlinky.baseui.blockMod.AlignItems
import typingsSlinky.baseui.blockMod.AlignSelf
import typingsSlinky.baseui.blockMod.BlockOverrides
import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.baseui.blockMod.Flex
import typingsSlinky.baseui.blockMod.FlexDirection
import typingsSlinky.baseui.blockMod.GridAutoFlow
import typingsSlinky.baseui.blockMod.JustifyContent
import typingsSlinky.baseui.blockMod.JustifyItems
import typingsSlinky.baseui.blockMod.JustifySelf
import typingsSlinky.baseui.blockMod.Position
import typingsSlinky.baseui.blockMod.Responsive
import typingsSlinky.baseui.blockMod.Scale
import typingsSlinky.baseui.flexGridMod.FlexGridProps
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlexGrid {
  @JSImport("baseui/flex-grid", "FlexGrid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def $styleFunction1(value: BlockProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def $style(value: StyleProp[BlockProps]): this.type = set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def alignContentVarargs(value: AlignContent*): this.type = set("alignContent", js.Array(value :_*))
    @scala.inline
    def alignContent(value: Responsive[AlignContent]): this.type = set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def alignItemsVarargs(value: AlignItems*): this.type = set("alignItems", js.Array(value :_*))
    @scala.inline
    def alignItems(value: Responsive[AlignItems]): this.type = set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def alignSelfVarargs(value: AlignSelf*): this.type = set("alignSelf", js.Array(value :_*))
    @scala.inline
    def alignSelf(value: Responsive[AlignSelf]): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: ReactElement): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColorVarargs(value: String*): this.type = set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def backgroundColor(value: Responsive[String]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def bottomVarargs(value: Scale*): this.type = set("bottom", js.Array(value :_*))
    @scala.inline
    def bottom(value: Responsive[Scale]): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def colorVarargs(value: String*): this.type = set("color", js.Array(value :_*))
    @scala.inline
    def color(value: Responsive[String]): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def displayVarargs(value: typingsSlinky.baseui.blockMod.Display*): this.type = set("display", js.Array(value :_*))
    @scala.inline
    def display(value: Responsive[typingsSlinky.baseui.blockMod.Display]): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def flexVarargs(value: Flex*): this.type = set("flex", js.Array(value :_*))
    @scala.inline
    def flex(value: Responsive[Flex]): this.type = set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def flexDirectionVarargs(value: FlexDirection*): this.type = set("flexDirection", js.Array(value :_*))
    @scala.inline
    def flexDirection(value: Responsive[FlexDirection]): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def flexGridColumnCountVarargs(value: Double*): this.type = set("flexGridColumnCount", js.Array(value :_*))
    @scala.inline
    def flexGridColumnCount(value: Responsive[Double]): this.type = set("flexGridColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def flexGridColumnGapVarargs(value: Scale*): this.type = set("flexGridColumnGap", js.Array(value :_*))
    @scala.inline
    def flexGridColumnGap(value: Responsive[Scale]): this.type = set("flexGridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def flexGridRowGapVarargs(value: Scale*): this.type = set("flexGridRowGap", js.Array(value :_*))
    @scala.inline
    def flexGridRowGap(value: Responsive[Scale]): this.type = set("flexGridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def flexWrapVarargs(value: Boolean*): this.type = set("flexWrap", js.Array(value :_*))
    @scala.inline
    def flexWrap(value: Responsive[Boolean]): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def fontVarargs(value: String*): this.type = set("font", js.Array(value :_*))
    @scala.inline
    def font(value: String | js.Array[String]): this.type = set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def gridVarargs(value: String*): this.type = set("grid", js.Array(value :_*))
    @scala.inline
    def grid(value: Responsive[String]): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAreaVarargs(value: String*): this.type = set("gridArea", js.Array(value :_*))
    @scala.inline
    def gridArea(value: Responsive[String]): this.type = set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoColumnsVarargs(value: String*): this.type = set("gridAutoColumns", js.Array(value :_*))
    @scala.inline
    def gridAutoColumns(value: Responsive[String]): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoFlowVarargs(value: GridAutoFlow*): this.type = set("gridAutoFlow", js.Array(value :_*))
    @scala.inline
    def gridAutoFlow(value: Responsive[GridAutoFlow]): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoRowsVarargs(value: String*): this.type = set("gridAutoRows", js.Array(value :_*))
    @scala.inline
    def gridAutoRows(value: Responsive[String]): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnVarargs(value: String*): this.type = set("gridColumn", js.Array(value :_*))
    @scala.inline
    def gridColumn(value: Responsive[String]): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnEndVarargs(value: String*): this.type = set("gridColumnEnd", js.Array(value :_*))
    @scala.inline
    def gridColumnEnd(value: Responsive[String]): this.type = set("gridColumnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnGapVarargs(value: Scale*): this.type = set("gridColumnGap", js.Array(value :_*))
    @scala.inline
    def gridColumnGap(value: Responsive[Scale]): this.type = set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnStartVarargs(value: String*): this.type = set("gridColumnStart", js.Array(value :_*))
    @scala.inline
    def gridColumnStart(value: Responsive[String]): this.type = set("gridColumnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def gridGapVarargs(value: Scale*): this.type = set("gridGap", js.Array(value :_*))
    @scala.inline
    def gridGap(value: Responsive[Scale]): this.type = set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowVarargs(value: String*): this.type = set("gridRow", js.Array(value :_*))
    @scala.inline
    def gridRow(value: Responsive[String]): this.type = set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowEndVarargs(value: String*): this.type = set("gridRowEnd", js.Array(value :_*))
    @scala.inline
    def gridRowEnd(value: Responsive[String]): this.type = set("gridRowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowGapVarargs(value: Scale*): this.type = set("gridRowGap", js.Array(value :_*))
    @scala.inline
    def gridRowGap(value: Responsive[Scale]): this.type = set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowStartVarargs(value: String*): this.type = set("gridRowStart", js.Array(value :_*))
    @scala.inline
    def gridRowStart(value: Responsive[String]): this.type = set("gridRowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateVarargs(value: String*): this.type = set("gridTemplate", js.Array(value :_*))
    @scala.inline
    def gridTemplate(value: Responsive[String]): this.type = set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateAreasVarargs(value: String*): this.type = set("gridTemplateAreas", js.Array(value :_*))
    @scala.inline
    def gridTemplateAreas(value: Responsive[String]): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateColumnsVarargs(value: String*): this.type = set("gridTemplateColumns", js.Array(value :_*))
    @scala.inline
    def gridTemplateColumns(value: Responsive[String]): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateRowsVarargs(value: String*): this.type = set("gridTemplateRows", js.Array(value :_*))
    @scala.inline
    def gridTemplateRows(value: Responsive[String]): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def heightVarargs(value: Scale*): this.type = set("height", js.Array(value :_*))
    @scala.inline
    def height(value: Responsive[Scale]): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyContentVarargs(value: JustifyContent*): this.type = set("justifyContent", js.Array(value :_*))
    @scala.inline
    def justifyContent(value: Responsive[JustifyContent]): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyItemsVarargs(value: JustifyItems*): this.type = set("justifyItems", js.Array(value :_*))
    @scala.inline
    def justifyItems(value: Responsive[JustifyItems]): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    @scala.inline
    def justifySelfVarargs(value: JustifySelf*): this.type = set("justifySelf", js.Array(value :_*))
    @scala.inline
    def justifySelf(value: Responsive[JustifySelf]): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def leftVarargs(value: Scale*): this.type = set("left", js.Array(value :_*))
    @scala.inline
    def left(value: Responsive[Scale]): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def marginVarargs(value: Scale*): this.type = set("margin", js.Array(value :_*))
    @scala.inline
    def margin(value: Responsive[Scale]): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def marginBottomVarargs(value: Scale*): this.type = set("marginBottom", js.Array(value :_*))
    @scala.inline
    def marginBottom(value: Responsive[Scale]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def marginLeftVarargs(value: Scale*): this.type = set("marginLeft", js.Array(value :_*))
    @scala.inline
    def marginLeft(value: Responsive[Scale]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def marginRightVarargs(value: Scale*): this.type = set("marginRight", js.Array(value :_*))
    @scala.inline
    def marginRight(value: Responsive[Scale]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def marginTopVarargs(value: Scale*): this.type = set("marginTop", js.Array(value :_*))
    @scala.inline
    def marginTop(value: Responsive[Scale]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeightVarargs(value: Scale*): this.type = set("maxHeight", js.Array(value :_*))
    @scala.inline
    def maxHeight(value: Responsive[Scale]): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidthVarargs(value: Scale*): this.type = set("maxWidth", js.Array(value :_*))
    @scala.inline
    def maxWidth(value: Responsive[Scale]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeightVarargs(value: Scale*): this.type = set("minHeight", js.Array(value :_*))
    @scala.inline
    def minHeight(value: Responsive[Scale]): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidthVarargs(value: Scale*): this.type = set("minWidth", js.Array(value :_*))
    @scala.inline
    def minWidth(value: Responsive[Scale]): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowVarargs(value: typingsSlinky.baseui.blockMod.Overflow*): this.type = set("overflow", js.Array(value :_*))
    @scala.inline
    def overflow(value: Responsive[typingsSlinky.baseui.blockMod.Overflow]): this.type = set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: BlockOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingVarargs(value: Scale*): this.type = set("padding", js.Array(value :_*))
    @scala.inline
    def padding(value: Responsive[Scale]): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingBottomVarargs(value: Scale*): this.type = set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def paddingBottom(value: Responsive[Scale]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingLeftVarargs(value: Scale*): this.type = set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def paddingLeft(value: Responsive[Scale]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingRightVarargs(value: Scale*): this.type = set("paddingRight", js.Array(value :_*))
    @scala.inline
    def paddingRight(value: Responsive[Scale]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingTopVarargs(value: Scale*): this.type = set("paddingTop", js.Array(value :_*))
    @scala.inline
    def paddingTop(value: Responsive[Scale]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def placeContentVarargs(value: String*): this.type = set("placeContent", js.Array(value :_*))
    @scala.inline
    def placeContent(value: Responsive[String]): this.type = set("placeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def placeItemsVarargs(value: String*): this.type = set("placeItems", js.Array(value :_*))
    @scala.inline
    def placeItems(value: Responsive[String]): this.type = set("placeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def placeSelfVarargs(value: String*): this.type = set("placeSelf", js.Array(value :_*))
    @scala.inline
    def placeSelf(value: Responsive[String]): this.type = set("placeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def positionVarargs(value: Position*): this.type = set("position", js.Array(value :_*))
    @scala.inline
    def position(value: Responsive[Position]): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def rightVarargs(value: Scale*): this.type = set("right", js.Array(value :_*))
    @scala.inline
    def right(value: Responsive[Scale]): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def topVarargs(value: Scale*): this.type = set("top", js.Array(value :_*))
    @scala.inline
    def top(value: Responsive[Scale]): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def widthVarargs(value: Scale*): this.type = set("width", js.Array(value :_*))
    @scala.inline
    def width(value: Responsive[Scale]): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlexGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FlexGrid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

