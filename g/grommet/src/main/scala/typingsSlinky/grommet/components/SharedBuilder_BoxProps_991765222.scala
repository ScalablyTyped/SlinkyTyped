package typingsSlinky.grommet.components

import slinky.core.ReactComponentClass
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Delay
import typingsSlinky.grommet.anon.Grow
import typingsSlinky.grommet.anon.Horizontal
import typingsSlinky.grommet.anon.Max
import typingsSlinky.grommet.anon.SizeStyle
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_BoxProps_991765222 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[slinky.web.html.`*`.tag.type, scala.Nothing] {
  @scala.inline
  def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
  @scala.inline
  def align(value: start | center | end | baseline | stretch): this.type = set("align", value.asInstanceOf[js.Any])
  @scala.inline
  def alignContent(value: AlignContentType): this.type = set("alignContent", value.asInstanceOf[js.Any])
  @scala.inline
  def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
  @scala.inline
  def animationVarargs(
    value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay)*
  ): this.type = set("animation", js.Array(value :_*))
  @scala.inline
  def animation(
    value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
    ])
  ): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("as", value.asInstanceOf[js.Any])
  @scala.inline
  def asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("as", value.asInstanceOf[js.Any])
  @scala.inline
  def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
  @scala.inline
  def background(value: BackgroundType): this.type = set("background", value.asInstanceOf[js.Any])
  @scala.inline
  def basis(value: BasisType): this.type = set("basis", value.asInstanceOf[js.Any])
  @scala.inline
  def borderVarargs(value: SizeStyle*): this.type = set("border", js.Array(value :_*))
  @scala.inline
  def border(value: BorderType): this.type = set("border", value.asInstanceOf[js.Any])
  @scala.inline
  def direction(value: row | column | `row-responsive` | `row-reverse` | `column-reverse`): this.type = set("direction", value.asInstanceOf[js.Any])
  @scala.inline
  def elevation(value: ElevationType): this.type = set("elevation", value.asInstanceOf[js.Any])
  @scala.inline
  def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
  @scala.inline
  def flex(value: grow | shrink | Boolean | Grow): this.type = set("flex", value.asInstanceOf[js.Any])
  @scala.inline
  def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
  @scala.inline
  def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
  @scala.inline
  def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
  @scala.inline
  def height(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): this.type = set("height", value.asInstanceOf[js.Any])
  @scala.inline
  def hoverIndicator(value: BackgroundType | Boolean): this.type = set("hoverIndicator", value.asInstanceOf[js.Any])
  @scala.inline
  def justify(value: around | between | center | end | evenly | start | stretch): this.type = set("justify", value.asInstanceOf[js.Any])
  @scala.inline
  def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
  @scala.inline
  def onClick(value: /* repeated */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def overflow(value: auto | hidden | scroll | visible | Horizontal | String): this.type = set("overflow", value.asInstanceOf[js.Any])
  @scala.inline
  def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
  @scala.inline
  def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
  @scala.inline
  def round(value: RoundType): this.type = set("round", value.asInstanceOf[js.Any])
  @scala.inline
  def tagFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("tag", value.asInstanceOf[js.Any])
  @scala.inline
  def tagComponentClass(value: ReactComponentClass[js.Any]): this.type = set("tag", value.asInstanceOf[js.Any])
  @scala.inline
  def tag(value: PolymorphicType): this.type = set("tag", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): this.type = set("width", value.asInstanceOf[js.Any])
  @scala.inline
  def wrap(value: Boolean | reverse): this.type = set("wrap", value.asInstanceOf[js.Any])
}

