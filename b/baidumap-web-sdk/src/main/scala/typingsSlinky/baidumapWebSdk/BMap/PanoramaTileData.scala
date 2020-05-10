package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaTileData extends js.Object {
  var centerHeading: Double = js.native
  var tileSize: Size = js.native
  var worldSize: Size = js.native
}

object PanoramaTileData {
  @scala.inline
  def apply(centerHeading: Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaTileData]
  }
  @scala.inline
  implicit class PanoramaTileDataOps[Self <: PanoramaTileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

