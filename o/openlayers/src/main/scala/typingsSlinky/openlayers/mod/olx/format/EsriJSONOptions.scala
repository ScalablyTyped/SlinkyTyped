package typingsSlinky.openlayers.mod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsriJSONOptions extends js.Object {
  var geometryName: js.UndefOr[String] = js.native
}

object EsriJSONOptions {
  @scala.inline
  def apply(): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsriJSONOptions]
  }
  @scala.inline
  implicit class EsriJSONOptionsOps[Self <: EsriJSONOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryName")(js.undefined)
        ret
    }
  }
  
}

