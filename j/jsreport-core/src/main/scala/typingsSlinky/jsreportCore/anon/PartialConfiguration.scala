package typingsSlinky.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var autoTempCleanup: js.UndefOr[Boolean] = js.native
  var dataDirectory: js.UndefOr[String] = js.native
  var extensionsLocationCache: js.UndefOr[Boolean] = js.native
  var loadConfig: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[Silent] = js.native
  var rootDirectory: js.UndefOr[String] = js.native
  var scripts: js.UndefOr[AllowedModules] = js.native
  var tasks: js.UndefOr[PartialallowedModulesArra] = js.native
  var tempDirectory: js.UndefOr[String] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
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
    def withoutAutoTempCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTempCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsLocationCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsLocationCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionsLocationCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsLocationCache")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: AllowedModules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withTasks(value: PartialallowedModulesArra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(js.undefined)
        ret
    }
    @scala.inline
    def withTempDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDirectory")(js.undefined)
        ret
    }
  }
  
}

