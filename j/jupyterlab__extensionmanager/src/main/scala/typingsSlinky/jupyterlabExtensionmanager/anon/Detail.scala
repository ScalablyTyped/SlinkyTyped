package typingsSlinky.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detail extends js.Object {
  /**
    * Break down of the search score.
    */
  var detail: Maintenance = js.native
  /**
    * The final normalized search score.
    */
  var `final`: Double = js.native
}

object Detail {
  @scala.inline
  def apply(detail: Maintenance, `final`: Double): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
  @scala.inline
  implicit class DetailOps[Self <: Detail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: Maintenance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

