package typingsSlinky.grommet.componentsTableCellMod

import typingsSlinky.grommet.grommetStrings.`1/2`
import typingsSlinky.grommet.grommetStrings.`1/3`
import typingsSlinky.grommet.grommetStrings.`1/4`
import typingsSlinky.grommet.grommetStrings.`2/3`
import typingsSlinky.grommet.grommetStrings.`2/4`
import typingsSlinky.grommet.grommetStrings.`3/4`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.col
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.middle
import typingsSlinky.grommet.grommetStrings.row
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[col | row] = js.undefined
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | String
  ] = js.undefined
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    plain: js.UndefOr[Boolean] = js.undefined,
    scope: col | row = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | String = null,
    verticalAlign: top | middle | bottom = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

