package typingsSlinky.cordovaPluginCanvascamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var CanvasCamera: typingsSlinky.cordovaPluginCanvascamera.CanvasCamera = js.native
}

object CordovaPlugins {
  @scala.inline
  def apply(CanvasCamera: CanvasCamera): CordovaPlugins = {
    val __obj = js.Dynamic.literal(CanvasCamera = CanvasCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  @scala.inline
  implicit class CordovaPluginsOps[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasCamera(value: CanvasCamera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanvasCamera")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

