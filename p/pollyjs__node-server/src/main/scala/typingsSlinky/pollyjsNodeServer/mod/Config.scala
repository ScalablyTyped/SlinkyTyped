package typingsSlinky.pollyjsNodeServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var apiNamespace: String = js.native
  var port: Double = js.native
  var quiet: Boolean = js.native
  var recordingSizeLimit: String = js.native
  var recordingsDir: String = js.native
}

object Config {
  @scala.inline
  def apply(
    apiNamespace: String,
    port: Double,
    quiet: Boolean,
    recordingSizeLimit: String,
    recordingsDir: String
  ): Config = {
    val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingSizeLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingsDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

