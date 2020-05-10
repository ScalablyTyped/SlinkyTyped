package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.format.IGCZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:interface-name */
@js.native
trait IGCOptions extends js.Object {
  var altitudeMode: js.UndefOr[IGCZ] = js.native
}

object IGCOptions {
  @scala.inline
  def apply(): IGCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGCOptions]
  }
  @scala.inline
  implicit class IGCOptionsOps[Self <: IGCOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitudeMode(value: IGCZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitudeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeMode")(js.undefined)
        ret
    }
  }
  
}

