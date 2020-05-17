package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.`bottom-left`
import typingsSlinky.grommet.grommetStrings.`bottom-right`
import typingsSlinky.grommet.grommetStrings.`top-left`
import typingsSlinky.grommet.grommetStrings.`top-right`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod.RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corner extends RoundType {
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
}

object Corner {
  @scala.inline
  def apply(): Corner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Corner]
  }
  @scala.inline
  implicit class CornerOps[Self <: Corner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorner(value: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xsmall | small | medium | large | xlarge | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

