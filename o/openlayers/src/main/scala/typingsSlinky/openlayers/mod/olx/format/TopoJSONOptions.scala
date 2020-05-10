package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike = js.native
}

object TopoJSONOptions {
  @scala.inline
  def apply(): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSONOptions]
  }
  @scala.inline
  implicit class TopoJSONOptionsOps[Self <: TopoJSONOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDataProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataProjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDataProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataProjection")(js.undefined)
        ret
    }
  }
  
}

