package typingsSlinky.grommet.paragraphMod

import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xxlarge
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.TextAlignType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | xxlarge | String] = js.undefined
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
}

object ParagraphProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    color: ColorType = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | xxlarge | String = null,
    textAlign: TextAlignType = null
  ): ParagraphProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphProps]
  }
}

