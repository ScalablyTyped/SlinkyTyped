package typingsSlinky.rotJs.anon

import typingsSlinky.rotJs.rotJsNumbers.`4`
import typingsSlinky.rotJs.rotJsNumbers.`6`
import typingsSlinky.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/path/path.Options> */
@js.native
trait PartialOptions extends js.Object {
  var topology: js.UndefOr[`4` | `6` | `8`] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopology(value: `4` | `6` | `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(js.undefined)
        ret
    }
  }
  
}

