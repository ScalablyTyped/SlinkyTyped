package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.AnonCorner
import typingsSlinky.grommet.AnonDelay
import typingsSlinky.grommet.AnonGrow
import typingsSlinky.grommet.AnonHorizontal
import typingsSlinky.grommet.AnonMax
import typingsSlinky.grommet.boxMod.BoxProps
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
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.grow
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.jiggle
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.pulse
import typingsSlinky.grommet.grommetStrings.reverse
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_BoxProps_1703373612 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    a11yTitle: A11yTitleType = null,
    align: start | center | end | baseline | stretch = null,
    alignContent: AlignContentType = null,
    alignSelf: AlignSelfType = null,
    animation: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay
    ]) = null,
    as: PolymorphicType = null,
    background: BackgroundType = null,
    basis: BasisType = null,
    border: BorderType = null,
    direction: row | column | `row-responsive` | `row-reverse` | `column-reverse` = null,
    elevation: ElevationType = null,
    fill: FillType = null,
    flex: grow | shrink | Boolean | AnonGrow = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    height: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    hoverIndicator: BackgroundType | Boolean = null,
    justify: around | between | center | end | evenly | start | stretch = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => _ = null,
    overflow: auto | hidden | scroll | visible | AnonHorizontal | String = null,
    pad: PadType = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    round: Boolean | xsmall | small | medium | large | xlarge | full | String | AnonCorner = null,
    tag: PolymorphicType = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    wrap: Boolean | reverse = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[slinky.web.html.`*`.tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BoxProps
}

