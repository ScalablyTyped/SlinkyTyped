package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicAngularServeOptions extends ServeOptions {
  
  var consolelogs: Boolean = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var livereloadPort: Double = js.native
  
  var notificationPort: Double = js.native
  
  var serverlogs: Boolean = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
}
object IonicAngularServeOptions {
  
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    consolelogs: Boolean,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    livereloadPort: Double,
    notificationPort: Double,
    open: Boolean,
    port: Double,
    proxy: Boolean,
    serverlogs: Boolean
  ): IonicAngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], consolelogs = consolelogs.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], livereloadPort = livereloadPort.asInstanceOf[js.Any], notificationPort = notificationPort.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], serverlogs = serverlogs.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularServeOptions]
  }
  
  @scala.inline
  implicit class IonicAngularServeOptionsOps[Self <: IonicAngularServeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsolelogs(value: Boolean): Self = this.set("consolelogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivereloadPort(value: Double): Self = this.set("livereloadPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPort(value: Double): Self = this.set("notificationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerlogs(value: Boolean): Self = this.set("serverlogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
  }
}
