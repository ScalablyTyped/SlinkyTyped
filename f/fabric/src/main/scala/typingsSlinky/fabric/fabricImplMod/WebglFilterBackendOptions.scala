package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebglFilterBackendOptions extends js.Object {
  var tileSize: Double = js.native
}

object WebglFilterBackendOptions {
  @scala.inline
  def apply(tileSize: Double): WebglFilterBackendOptions = {
    val __obj = js.Dynamic.literal(tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebglFilterBackendOptions]
  }
  @scala.inline
  implicit class WebglFilterBackendOptionsOps[Self <: WebglFilterBackendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

