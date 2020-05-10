package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppInfo extends js.Object {
   // equals to serverEnv
  var HOME: String = js.native
   // the application name from package.json
  var baseDir: String = js.native
   // current directory of application
  var env: EggEnvType = js.native
   // package.json
  var name: String = js.native
  var pkg: js.Any = js.native
   // home directory of the OS
  var root: String = js.native
}

object EggAppInfo {
  @scala.inline
  def apply(HOME: String, baseDir: String, env: EggEnvType, name: String, pkg: js.Any, root: String): EggAppInfo = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppInfo]
  }
  @scala.inline
  implicit class EggAppInfoOps[Self <: EggAppInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHOME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: EggEnvType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPkg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

