package typingsSlinky.rotJs.cellularMod

import typingsSlinky.rotJs.rotJsNumbers.`4`
import typingsSlinky.rotJs.rotJsNumbers.`6`
import typingsSlinky.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var born: js.Array[Double] = js.native
  var survive: js.Array[Double] = js.native
  var topology: `4` | `6` | `8` = js.native
}

object Options {
  @scala.inline
  def apply(born: js.Array[Double], survive: js.Array[Double], topology: `4` | `6` | `8`): Options = {
    val __obj = js.Dynamic.literal(born = born.asInstanceOf[js.Any], survive = survive.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorn(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("born")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurvive(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("survive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopology(value: `4` | `6` | `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topology")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

