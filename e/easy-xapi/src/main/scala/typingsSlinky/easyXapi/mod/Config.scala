package typingsSlinky.easyXapi.mod

import typingsSlinky.easyXapi.anon.Level
import typingsSlinky.express.mod.Application_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var log: Level = js.native
  var name: String = js.native
  var port: Double = js.native
  var root: String = js.native
  var xHeaderDefaults: js.UndefOr[js.Object] = js.native
  def mount(app: Application_): Unit = js.native
}

object Config {
  @scala.inline
  def apply(log: Level, mount: Application_ => Unit, name: String, port: Double, root: String): Config = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], mount = js.Any.fromFunction1(mount), name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMount(value: Application_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHeaderDefaults(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHeaderDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXHeaderDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHeaderDefaults")(js.undefined)
        ret
    }
  }
  
}

