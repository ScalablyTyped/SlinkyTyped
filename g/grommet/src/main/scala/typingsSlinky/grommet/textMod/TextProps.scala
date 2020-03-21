package typingsSlinky.grommet.textMod

import typingsSlinky.grommet.grommetStrings.`break-all`
import typingsSlinky.grommet.grommetStrings.`break-word`
import typingsSlinky.grommet.grommetStrings.`keep-all`
import typingsSlinky.grommet.grommetStrings.bold
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
import typingsSlinky.grommet.utilsMod.PolymorphicType
import typingsSlinky.grommet.utilsMod.TextAlignType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var tag: js.UndefOr[PolymorphicType] = js.undefined
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[normal | bold | Double] = js.undefined
  var wordBreak: js.UndefOr[normal | `break-all` | `keep-all` | `break-word`] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    as: PolymorphicType = null,
    color: ColorType = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    size: xsmall | small | medium | large | xlarge | xxlarge | String = null,
    tag: PolymorphicType = null,
    textAlign: TextAlignType = null,
    truncate: js.UndefOr[Boolean] = js.undefined,
    weight: normal | bold | Double = null,
    wordBreak: normal | `break-all` | `keep-all` | `break-word` = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (wordBreak != null) __obj.updateDynamic("wordBreak")(wordBreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

