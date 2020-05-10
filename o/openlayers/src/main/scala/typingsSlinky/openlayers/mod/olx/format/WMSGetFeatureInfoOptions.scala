package typingsSlinky.openlayers.mod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMSGetFeatureInfoOptions extends js.Object {
  var layers: js.UndefOr[js.Array[String]] = js.native
}

object WMSGetFeatureInfoOptions {
  @scala.inline
  def apply(): WMSGetFeatureInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSGetFeatureInfoOptions]
  }
  @scala.inline
  implicit class WMSGetFeatureInfoOptionsOps[Self <: WMSGetFeatureInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
  }
  
}

