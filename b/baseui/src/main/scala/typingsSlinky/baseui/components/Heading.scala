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
import typingsSlinky.baseui.headingMod.HeadingProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Heading {
  @JSImport("baseui/heading", "Heading")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any]] {
    @scala.inline
    def $styleFunction1(value: BlockProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def $style(value: StyleProp[BlockProps]): this.type = set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def alignContent(value: Responsive[AlignContent]): this.type = set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def alignItems(value: Responsive[AlignItems]): this.type = set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def alignSelf(value: Responsive[AlignSelf]): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: ReactElement): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: Responsive[String]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def bottom(value: Responsive[Scale]): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: Responsive[String]): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def display(value: Responsive[typingsSlinky.baseui.blockMod.Display]): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def flex(value: Responsive[Flex]): this.type = set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def flexDirection(value: Responsive[FlexDirection]): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def flexWrap(value: Responsive[Boolean]): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def font(value: String | js.Array[String]): this.type = set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: Responsive[String]): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def gridArea(value: Responsive[String]): this.type = set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoColumns(value: Responsive[String]): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoFlow(value: Responsive[GridAutoFlow]): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def gridAutoRows(value: Responsive[String]): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumn(value: Responsive[String]): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnEnd(value: Responsive[String]): this.type = set("gridColumnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnGap(value: Responsive[Scale]): this.type = set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridColumnStart(value: Responsive[String]): this.type = set("gridColumnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def gridGap(value: Responsive[Scale]): this.type = set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRow(value: Responsive[String]): this.type = set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowEnd(value: Responsive[String]): this.type = set("gridRowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowGap(value: Responsive[Scale]): this.type = set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def gridRowStart(value: Responsive[String]): this.type = set("gridRowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplate(value: Responsive[String]): this.type = set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateAreas(value: Responsive[String]): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateColumns(value: Responsive[String]): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def gridTemplateRows(value: Responsive[String]): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Responsive[Scale]): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyContent(value: Responsive[JustifyContent]): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyItems(value: Responsive[JustifyItems]): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    @scala.inline
    def justifySelf(value: Responsive[JustifySelf]): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def left(value: Responsive[Scale]): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Responsive[Scale]): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def marginBottom(value: Responsive[Scale]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def marginLeft(value: Responsive[Scale]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def marginRight(value: Responsive[Scale]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def marginTop(value: Responsive[Scale]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Responsive[Scale]): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: Responsive[Scale]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Responsive[Scale]): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Responsive[Scale]): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def overflow(value: Responsive[typingsSlinky.baseui.blockMod.Overflow]): this.type = set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: BlockOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: Responsive[Scale]): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingBottom(value: Responsive[Scale]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingLeft(value: Responsive[Scale]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingRight(value: Responsive[Scale]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingTop(value: Responsive[Scale]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def placeContent(value: Responsive[String]): this.type = set("placeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def placeItems(value: Responsive[String]): this.type = set("placeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def placeSelf(value: Responsive[String]): this.type = set("placeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: Responsive[Position]): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def right(value: Responsive[Scale]): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def styleLevel(value: Double): this.type = set("styleLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: Responsive[Scale]): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Responsive[Scale]): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeadingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Heading.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

