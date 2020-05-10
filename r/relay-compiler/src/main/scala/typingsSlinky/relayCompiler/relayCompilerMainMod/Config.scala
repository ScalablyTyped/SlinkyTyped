package typingsSlinky.relayCompiler.relayCompilerMainMod

import typingsSlinky.relayCompiler.relayFlowTypeTransformersMod.ScalarTypeMapping
import typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.PluginInitializer
import typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var artifactDirectory: js.UndefOr[String | Null] = js.native
  var customScalars: js.UndefOr[ScalarTypeMapping] = js.native
  var exclude: js.Array[String] = js.native
  var extensions: js.Array[String] = js.native
  var include: js.Array[String] = js.native
  var language: String | PluginInitializer = js.native
  var noFutureProofEnums: Boolean = js.native
  var persistFunction: js.UndefOr[String | (js.Function1[/* text */ String, js.Promise[String]]) | Null] = js.native
  var persistOutput: js.UndefOr[String | Null] = js.native
  var quiet: Boolean = js.native
  var schema: String = js.native
  var src: String = js.native
  var validate: Boolean = js.native
  var verbose: Boolean = js.native
  var watch: js.UndefOr[Boolean | Null] = js.native
  var watchman: Boolean = js.native
}

object Config {
  @scala.inline
  def apply(
    exclude: js.Array[String],
    extensions: js.Array[String],
    include: js.Array[String],
    language: String | PluginInitializer,
    noFutureProofEnums: Boolean,
    quiet: Boolean,
    schema: String,
    src: String,
    validate: Boolean,
    verbose: Boolean,
    watchman: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageFunction0(value: () => PluginInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLanguage(value: String | PluginInitializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoFutureProofEnums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFutureProofEnums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactDirectory")(null)
        ret
    }
    @scala.inline
    def withCustomScalars(value: ScalarTypeMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomScalars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalars")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistFunctionFunction1(value: /* text */ String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPersistFunction(value: String | (js.Function1[/* text */ String, js.Promise[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistFunction")(null)
        ret
    }
    @scala.inline
    def withPersistOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistOutputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistOutput")(null)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(null)
        ret
    }
  }
  
}

