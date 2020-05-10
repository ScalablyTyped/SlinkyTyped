package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withConsolelogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolelogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivereloadPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livereloadPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerlogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverlogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(js.undefined)
        ret
    }
  }
  
}

