package typingsSlinky.grommet.componentsHeadingMod

import typingsSlinky.grommet.grommetStrings.`1`
import typingsSlinky.grommet.grommetStrings.`2`
import typingsSlinky.grommet.grommetStrings.`3`
import typingsSlinky.grommet.grommetStrings.`4`
import typingsSlinky.grommet.grommetStrings.`5`
import typingsSlinky.grommet.grommetStrings.`6`
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
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

trait HeadingProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var level: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | typingsSlinky.grommet.grommetNumbers.`1` | typingsSlinky.grommet.grommetNumbers.`2` | typingsSlinky.grommet.grommetNumbers.`3` | typingsSlinky.grommet.grommetNumbers.`4` | typingsSlinky.grommet.grommetNumbers.`5` | typingsSlinky.grommet.grommetNumbers.`6`
  ] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
}

object HeadingProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    as: PolymorphicType = null,
    color: ColorType = null,
    gridArea: GridAreaType = null,
    level: `1` | `2` | `3` | `4` | `5` | `6` | typingsSlinky.grommet.grommetNumbers.`1` | typingsSlinky.grommet.grommetNumbers.`2` | typingsSlinky.grommet.grommetNumbers.`3` | typingsSlinky.grommet.grommetNumbers.`4` | typingsSlinky.grommet.grommetNumbers.`5` | typingsSlinky.grommet.grommetNumbers.`6` = null,
    margin: MarginType = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    textAlign: TextAlignType = null,
    truncate: js.UndefOr[Boolean] = js.undefined
  ): HeadingProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingProps]
  }
}

