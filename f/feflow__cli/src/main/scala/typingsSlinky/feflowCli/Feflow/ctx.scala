package typingsSlinky.feflowCli.Feflow

import typingsSlinky.feflowCli.Anon
import typingsSlinky.feflowCli.Command
import typingsSlinky.feflowCli.Hook
import typingsSlinky.feflowCli.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * feflow context
  */
@js.native
trait ctx extends js.Object {
  /**
    * Feflow context params
    */
  var args: Anon = js.native
  /**
    * Feflow command includes: (register)
    */
  var commander: Command = js.native
  /**
    * feflow config
    */
  var config: String = js.native
  /**
    * feflow config path
    */
  var configPath: String = js.native
  /**
    * Feflow hook includes: (hook)
    */
  var hook: Hook = js.native
  /**
    * Feflow logger includes: (trace、debug、info、warn、error、fatal)
    */
  var logger: Logger = js.native
  /**
    * Feflow configuration file in the current directory
    * ( .feflowrc.json/.feflowrc.js/.feflowrc.yml )
    */
  var projectConfig: String = js.native
  /**
    * Current project path
    */
  var projectPath: String = js.native
  /**
    * Feflow home directory path
    */
  var root: String = js.native
  /**
    * Feflow home directory package.json path
    */
  var rootPkg: String = js.native
  /**
    * Feflow version
    */
  var version: String = js.native
}

object ctx {
  @scala.inline
  def apply(
    args: Anon,
    commander: Command,
    config: String,
    configPath: String,
    hook: Hook,
    logger: Logger,
    projectConfig: String,
    projectPath: String,
    root: String,
    rootPkg: String,
    version: String
  ): ctx = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], commander = commander.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configPath = configPath.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootPkg = rootPkg.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ctx]
  }
  @scala.inline
  implicit class ctxOps[Self <: ctx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: Anon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommander(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHook(value: Hook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootPkg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

