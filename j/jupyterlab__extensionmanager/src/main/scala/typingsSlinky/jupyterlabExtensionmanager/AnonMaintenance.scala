package typingsSlinky.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaintenance extends js.Object {
  /**
    * The normalized maintenance score.
    */
  var maintenance: Double = js.native
  /**
    * The normalized popularity score.
    */
  var popularity: Double = js.native
  /**
    * The normalized quality score.
    */
  var quality: Double = js.native
}

object AnonMaintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): AnonMaintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaintenance]
  }
  @scala.inline
  implicit class AnonMaintenanceOps[Self <: AnonMaintenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaintenance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

