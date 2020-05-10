package typingsSlinky.jsreportCore.mod

import typingsSlinky.jsreportCore.AnonAllowedModules
import typingsSlinky.jsreportCore.AnonSilent
import typingsSlinky.jsreportCore.PartialallowedModulesArra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var autoTempCleanup: Boolean = js.native
  var dataDirectory: String = js.native
  var extensionsLocationCache: Boolean = js.native
  var loadConfig: Boolean = js.native
  var logger: AnonSilent = js.native
  var rootDirectory: String = js.native
  var scripts: AnonAllowedModules = js.native
  var tasks: PartialallowedModulesArra = js.native
  var tempDirectory: String = js.native
}

object Configuration {
  @scala.inline
  def apply(
    autoTempCleanup: Boolean,
    dataDirectory: String,
    extensionsLocationCache: Boolean,
    loadConfig: Boolean,
    logger: AnonSilent,
    rootDirectory: String,
    scripts: AnonAllowedModules,
    tasks: PartialallowedModulesArra,
    tempDirectory: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], extensionsLocationCache = extensionsLocationCache.asInstanceOf[js.Any], loadConfig = loadConfig.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoTempCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTempCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionsLocationCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsLocationCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: AnonSilent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScripts(value: AnonAllowedModules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: PartialallowedModulesArra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDirectory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

