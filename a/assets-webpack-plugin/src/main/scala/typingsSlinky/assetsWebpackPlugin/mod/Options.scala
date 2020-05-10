package typingsSlinky.assetsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If the "entrypoints" option is given, the output will be limited to the entrypoints and the chunks associated with them.
    * false by default
    */
  var entrypoints: js.UndefOr[Boolean] = js.native
  /**
    * When set and "includeAllFileTypes" is set false, only assets matching these types will be included in the assets file.
    * ['js', 'css'] by default
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Name for the created json file.
    * "webpack-assets.json" by default
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * If false the output will not include the full path of the generated file.
    * true by default
    */
  var fullPath: js.UndefOr[Boolean] = js.native
  /**
    * When set false, falls back to the "fileTypes" option array to decide which file types to include in the assets file.
    * true by default
    */
  var includeAllFileTypes: js.UndefOr[Boolean] = js.native
  /**
    * Inserts the manifest javascript as a text property in your assets.
    * Accepts the name of your manifest chunk.
    * A manifest is the last CommonChunk that only contains the webpack bootstrap code.
    * This is useful for production use when you want to inline the manifest
    * in your HTML skeleton for long-term caching.
    * false by default
    */
  var includeManifest: js.UndefOr[Boolean] = js.native
  /**
    * When set the assets file will only be generated in memory while running webpack-dev-server and not written to disk.
    * false by default
    */
  var keepInMemory: js.UndefOr[Boolean] = js.native
  /**
    * Orders the assets output so that manifest is the first entry.
    * This is useful for cases where script tags are generated from the assets json output, and order of import is important.
    * false by default
    */
  var manifestFirst: js.UndefOr[Boolean] = js.native
  /**
    * Inject metadata into the output file. All values will be injected into the key "metadata"
    */
  var metadata: js.UndefOr[js.Object] = js.native
  /**
    * Path where to save the created JSON file.
    * Defaults to the current directory
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Whether to format the JSON output for readability.
    * false by default
    */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Formats the assets output.
    * Defaults to JSON.stringify
    */
  var processOutput: js.UndefOr[ProcessOutputFn] = js.native
  /**
    * When set to true, the output JSON file will be updated instead of overwritten.
    * false by default
    */
  var update: js.UndefOr[Boolean] = js.native
  /**
    * Will override the path to use the compiler output path set in your webpack config.
    * false by default
    */
  var useCompilerPath: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntrypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAllFileTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAllFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeManifest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepInMemory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessOutput(value: /* assets */ Assets => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCompilerPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCompilerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCompilerPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCompilerPath")(js.undefined)
        ret
    }
  }
  
}

