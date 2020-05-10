package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  useInstances  :boolean}> */
@js.native
trait PartialuseInstancesboolea extends js.Object {
  var useInstances: js.UndefOr[Boolean] = js.native
}

object PartialuseInstancesboolea {
  @scala.inline
  def apply(): PartialuseInstancesboolea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseInstancesboolea]
  }
  @scala.inline
  implicit class PartialuseInstancesbooleaOps[Self <: PartialuseInstancesboolea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInstances")(js.undefined)
        ret
    }
  }
  
}

