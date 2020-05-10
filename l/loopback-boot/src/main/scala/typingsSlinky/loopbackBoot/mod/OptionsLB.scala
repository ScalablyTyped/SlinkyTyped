package typingsSlinky.loopbackBoot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsLB extends js.Object {
  /**
    * Directory to use when loading config.json. Defaults to appRootDir.
    */
  var appConfigRootDir: String = js.native
  /**
    * Directory to use when loading JSON and JavaScript files.
    * Defaults to the current directory (process.cwd()).
    */
  var appRootDir: String = js.native
  /**
    * List of directories where to look for boot scripts.
    */
  var bootDirs: js.Array[String] = js.native
  /**
    * List of script files to execute on boot.
    */
  var bootScripts: js.Array[String] = js.native
  /**
    * Directory to use when loading component-config.json. Defaults to appRootDir.
    */
  var componentRootDir: String = js.native
  /**
    * Component configuration to use instead of {appRootDir}/component-config.json
    */
  var components: js.Any = js.native
  /**
    * Object containing DataSource definitions.
    */
  var dataSources: js.Any = js.native
  /**
    * Directory to use when loading datasources.json. Defaults to appRootDir.
    */
  var dsRootDir: String = js.native
  /**
    * Environment type, defaults to process.env.NODE_ENV or development.
    * Common values are development, staging and production;
    * however the applications are free to use any names.
    */
  var env: String = js.native
  /**
    * Middleware configuration to use instead of {appRootDir}/middleware.json
    */
  var middleware: js.Any = js.native
  /**
    * Directory to use when loading middleware.json. Defaults to appRootDir.
    */
  var middlewareRootDir: String = js.native
  /**
    * List of directories where to look for files containing model mixin definitions.
    * All files (mixins) found in these directory are loaded.
    */
  var mixinDirs: js.Array[String] = js.native
  /**
    * List of directories where to look for files containing model mixin definitions.
    *  Only mixins used by application models are loaded from these directories.
    */
  var mixinSources: js.Array[String] = js.native
  /**
    * List of model definitions to use. When options.modelDefinitions is provided,
    * loopback-boot does not search filesystem and use only the models provided in this argument.
    */
  var modelDefinitions: js.Array[_] = js.native
  /**
    * List of directories where to look for files containing model definitions.
    */
  var modelSources: js.Array[String] = js.native
  /**
    * Object containing Model configurations.
    */
  var models: js.Any = js.native
  /**
    * Directory to use when loading model-config.json. Defaults to appRootDir.
    */
  var modelsRootDir: String = js.native
  /**
    * Mixin normalization format: false, 'none', 'classify', 'dasherize' - defaults to 'classify'.
    */
  var normalization: String | Boolean | js.Any = js.native
}

object OptionsLB {
  @scala.inline
  def apply(
    appConfigRootDir: String,
    appRootDir: String,
    bootDirs: js.Array[String],
    bootScripts: js.Array[String],
    componentRootDir: String,
    components: js.Any,
    dataSources: js.Any,
    dsRootDir: String,
    env: String,
    middleware: js.Any,
    middlewareRootDir: String,
    mixinDirs: js.Array[String],
    mixinSources: js.Array[String],
    modelDefinitions: js.Array[_],
    modelSources: js.Array[String],
    models: js.Any,
    modelsRootDir: String,
    normalization: String | Boolean | js.Any
  ): OptionsLB = {
    val __obj = js.Dynamic.literal(appConfigRootDir = appConfigRootDir.asInstanceOf[js.Any], appRootDir = appRootDir.asInstanceOf[js.Any], bootDirs = bootDirs.asInstanceOf[js.Any], bootScripts = bootScripts.asInstanceOf[js.Any], componentRootDir = componentRootDir.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], dsRootDir = dsRootDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], middlewareRootDir = middlewareRootDir.asInstanceOf[js.Any], mixinDirs = mixinDirs.asInstanceOf[js.Any], mixinSources = mixinSources.asInstanceOf[js.Any], modelDefinitions = modelDefinitions.asInstanceOf[js.Any], modelSources = modelSources.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], modelsRootDir = modelsRootDir.asInstanceOf[js.Any], normalization = normalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLB]
  }
  @scala.inline
  implicit class OptionsLBOps[Self <: OptionsLB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppConfigRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfigRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBootScripts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDsRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleware(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddlewareRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewareRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixinDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixinDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixinSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixinSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelDefinitions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelsRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelsRootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalization(value: String | Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

