package typingsSlinky.browserify.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.insertModuleGlobals.mod.VarsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options pertaining to a Browserify instance.
  */
@js.native
trait Options extends CustomOptions {
  // sets the list of built-ins to use, which by default is set in lib/builtins.js in this distribution.
  var builtins: js.UndefOr[js.Array[String] | StringDictionary[String] | Boolean] = js.native
  // set if external modules should be bundled. Defaults to true.
  var bundleExternal: js.UndefOr[Boolean] = js.native
  // sets the algorithm used to parse out the common paths. Use false to turn this off, otherwise it uses the commondir module.
  var commondir: js.UndefOr[Boolean] = js.native
  // When true, add a source map inline to the end of the bundle. This makes debugging easier because you can see all the original files if you are in a modern enough browser.
  var debug: js.UndefOr[Boolean] = js.native
  // When true, scan all files for process, global, __filename, and __dirname, defining as necessary.
  // With this option npm modules are more likely to work but bundling takes longer. Default true.
  var detectGlobals: js.UndefOr[Boolean] = js.native
  // String, file object, or array of those types (they may be mixed) specifying entry file(s).
  var entries: js.UndefOr[InputFile | js.Array[InputFile]] = js.native
  // an array of optional extra extensions for the module lookup machinery to use when the extension has not been specified.
  // By default Browserify considers only .js and .json files in such cases.
  var extensions: js.UndefOr[js.Array[String]] = js.native
  // defaults to 'require' in expose mode but you can use another name.
  var externalRequireName: js.UndefOr[String] = js.native
  // disables converting module ids into numerical indexes. This is useful for preserving the original paths that a bundle was generated with.
  var fullPaths: js.UndefOr[Boolean] = js.native
  // will be passed to insert-module-globals as the opts.vars parameter.
  var insertGlobalVars: js.UndefOr[VarsOption] = js.native
  // When true, always insert process, global, __filename, and __dirname without analyzing the AST for faster builds but larger output bundles. Default false.
  var insertGlobals: js.UndefOr[Boolean] = js.native
  // an array which will skip all require() and global parsing for each file in the array.
  // Use this for giant libs like jquery or threejs that don't have any requires or node-style globals but take forever to parse.
  var noParse: js.UndefOr[js.Array[String]] = js.native
  // an array of directories that Browserify searches when looking for modules which are not referenced using relative path.
  // Can be absolute or relative to basedir. Equivalent of setting NODE_PATH environmental variable when calling Browserify command.
  var paths: js.UndefOr[js.Array[String]] = js.native
  // When a non-empty string, a standalone module is created with that name and a umd wrapper.
  // You can use namespaces in the standalone global export using a . in the string name as a separator, for example 'A.B.C'.
  // The global export will be sanitized and camel cased.
  var standalone: js.UndefOr[String] = js.native
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
    def withBuiltins(value: js.Array[String] | StringDictionary[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtins")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleExternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleExternal")(js.undefined)
        ret
    }
    @scala.inline
    def withCommondir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commondir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommondir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commondir")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectGlobals")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: InputFile | js.Array[InputFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalRequireName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalRequireName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalRequireName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalRequireName")(js.undefined)
        ret
    }
    @scala.inline
    def withFullPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertGlobalVars(value: VarsOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertGlobalVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertGlobalVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertGlobalVars")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertGlobals")(js.undefined)
        ret
    }
    @scala.inline
    def withNoParse(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noParse")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
  }
  
}

