package typingsSlinky.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginInfo extends js.Object {
  /** the package name of plugin */
  @JSName("package")
  var _package: String = js.native
  /** the dependent plugins, you can use the plugin name */
  var dependencies: js.Array[String] = js.native
  /** whether enabled */
  var enable: Boolean = js.native
  /** specify the serverEnv that only enable the plugin in it */
  var env: js.Array[String] = js.native
  /** the file plugin config in. */
  var from: String = js.native
  /** the plugin name, it can be used in `dep` */
  var name: String = js.native
  /** the optional dependent plugins. */
  var optionalDependencies: js.Array[String] = js.native
  /** the directory of the plugin package */
  var path: String = js.native
}

object PluginInfo {
  @scala.inline
  def apply(
    _package: String,
    dependencies: js.Array[String],
    enable: Boolean,
    env: js.Array[String],
    from: String,
    name: String,
    optionalDependencies: js.Array[String],
    path: String
  ): PluginInfo = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginInfo]
  }
  @scala.inline
  implicit class PluginInfoOps[Self <: PluginInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

