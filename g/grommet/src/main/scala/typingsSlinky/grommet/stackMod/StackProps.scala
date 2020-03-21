package typingsSlinky.grommet.stackMod

import typingsSlinky.grommet.grommetStrings.`bottom-left`
import typingsSlinky.grommet.grommetStrings.`bottom-right`
import typingsSlinky.grommet.grommetStrings.`top-left`
import typingsSlinky.grommet.grommetStrings.`top-right`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.center
import typingsSlinky.grommet.grommetStrings.first
import typingsSlinky.grommet.grommetStrings.last
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
  ] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var guidingChild: js.UndefOr[Double | first | last] = js.undefined
  var interactiveChild: js.UndefOr[Double | first | last] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object StackProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    anchor: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right` = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    guidingChild: Double | first | last = null,
    interactiveChild: Double | first | last = null,
    margin: MarginType = null
  ): StackProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (guidingChild != null) __obj.updateDynamic("guidingChild")(guidingChild.asInstanceOf[js.Any])
    if (interactiveChild != null) __obj.updateDynamic("interactiveChild")(interactiveChild.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackProps]
  }
}

