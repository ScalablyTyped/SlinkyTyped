package typingsSlinky.cordovaPluginMapsforge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var mapsforge: MapsforgePlugin = js.native
}

object Window {
  @scala.inline
  def apply(mapsforge: MapsforgePlugin): Window = {
    val __obj = js.Dynamic.literal(mapsforge = mapsforge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapsforge(value: MapsforgePlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapsforge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

