package typingsSlinky.leafletLabel.mod

import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point_] = js.native
}

object PathOptions {
  @scala.inline
  def apply(): PathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOptions]
  }
  @scala.inline
  implicit class PathOptionsOps[Self <: PathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelAnchor(value: Point_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(js.undefined)
        ret
    }
  }
  
}

