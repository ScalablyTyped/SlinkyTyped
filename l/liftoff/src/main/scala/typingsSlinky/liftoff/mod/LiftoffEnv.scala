package typingsSlinky.liftoff.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiftoffEnv extends js.Object {
  /**
    * the base directory of your configuration file (if found)
    */
  var configBase: js.UndefOr[String] = js.native
  /**
    * an object of filepaths for each found config file (filepath values will be null if not found)
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | Null]]] = js.native
  /**
    * the config files searched for
    */
  var configNameSearch: js.Array[String] = js.native
  /**
    * the full path to your configuration file (if found)
    */
  var configPath: js.UndefOr[String] = js.native
  /**
    * the current working directory
    */
  var cwd: String = js.native
  /**
    * the contents of the local module's package.json (if found)
    */
  var modulePackage: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * the full path to the local module your project relies on (if found)
    */
  var modulePath: js.UndefOr[String] = js.native
  /**
    * an array of modules that liftoff tried to pre-load
    */
  var require: js.Array[String] = js.native
}

object LiftoffEnv {
  @scala.inline
  def apply(configNameSearch: js.Array[String], cwd: String, require: js.Array[String]): LiftoffEnv = {
    val __obj = js.Dynamic.literal(configNameSearch = configNameSearch.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftoffEnv]
  }
  @scala.inline
  implicit class LiftoffEnvOps[Self <: LiftoffEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigNameSearch(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configNameSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequire(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBase")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFiles(value: StringDictionary[StringDictionary[String | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
        ret
    }
    @scala.inline
    def withModulePackage(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulePackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePackage")(js.undefined)
        ret
    }
    @scala.inline
    def withModulePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePath")(js.undefined)
        ret
    }
  }
  
}

