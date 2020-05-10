package typingsSlinky.rotJs

import typingsSlinky.rotJs.rotJsNumbers.`4`
import typingsSlinky.rotJs.rotJsNumbers.`6`
import typingsSlinky.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/cellular.Options> */
@js.native
trait PartialOptionsBorn extends js.Object {
  var born: js.UndefOr[js.Array[Double]] = js.native
  var survive: js.UndefOr[js.Array[Double]] = js.native
  var topology: js.UndefOr[`4` | `6` | `8`] = js.native
}

object PartialOptionsBorn {
  @scala.inline
  def apply(): PartialOptionsBorn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsBorn]
  }
  @scala.inline
  implicit class PartialOptionsBornOps[Self <: PartialOptionsBorn] (val x: Self) extends AnyVal {
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
    def withoutBorn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("born")(js.undefined)
        ret
    }
    @scala.inline
    def withSurvive(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("survive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurvive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("survive")(js.undefined)
        ret
    }
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

