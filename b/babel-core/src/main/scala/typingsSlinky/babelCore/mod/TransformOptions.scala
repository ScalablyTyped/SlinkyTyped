package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.babelCoreStrings.`inline`
import typingsSlinky.babelCore.babelCoreStrings.auto
import typingsSlinky.babelCore.babelCoreStrings.both
import typingsSlinky.babelCore.babelCoreStrings.enter
import typingsSlinky.babelCore.babelCoreStrings.exit
import typingsSlinky.babelCore.babelCoreStrings.module
import typingsSlinky.babelCore.babelCoreStrings.script
import typingsSlinky.babelGenerator.mod.GeneratorOptions
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babylon.mod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
  /** Include the AST in the returned object. Default: `true`. */
  var ast: js.UndefOr[Boolean] = js.native
  /** Attach a comment after all non-user injected code. */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.native
  /** Attach a comment before all non-user injected code. */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.native
  /** Specify whether or not to use `.babelrc` and `.babelignore` files. Default: `true`. */
  var babelrc: js.UndefOr[Boolean] = js.native
  /** Enable code generation. Default: `true`. */
  var code: js.UndefOr[Boolean] = js.native
  /** write comments to generated output. Default: `true`. */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"`, `compact` is set to
    * `true` on input sizes of >100KB.
    */
  var compact: js.UndefOr[Boolean | auto] = js.native
  /**
    * This is an object of keys that represent different environments. For example, you may have:
    * `{ env: { production: { / * specific options * / } } }`
    * which will use those options when the enviroment variable `BABEL_ENV` is set to `"production"`.
    * If `BABEL_ENV` isn't set then `NODE_ENV` will be used, if it's not set then it defaults to `"development"`.
    */
  var env: js.UndefOr[js.Object] = js.native
  /** A path to an .babelrc file to extend. */
  var `extends`: js.UndefOr[String] = js.native
  /** Filename to use when reading from stdin - this will be used in source-maps, errors etc. Default: "unknown". */
  var filename: js.UndefOr[String] = js.native
  /** Filename relative to `sourceRoot`. */
  var filenameRelative: js.UndefOr[String] = js.native
  /** An object containing the options to be passed down to the babel code generator, babel-generator. Default: `{}` */
  var generatorOpts: js.UndefOr[GeneratorOptions] = js.native
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`.
    * If falsy value is returned then the generated module id is used.
    */
  var getModuleId: js.UndefOr[js.Function1[/* moduleName */ String, String]] = js.native
  /** Enable/disable ANSI syntax highlighting of code frames. Default: `true`. */
  var highlightCode: js.UndefOr[Boolean] = js.native
  /** list of glob paths to **not** compile. Opposite to the `only` option. */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /** A source map object that the output source map will be based on. */
  var inputSourceMap: js.UndefOr[js.Object] = js.native
  /** Should the output be minified. Default: `false` */
  var minified: js.UndefOr[Boolean] = js.native
  /** Specify a custom name for module ids. */
  var moduleId: js.UndefOr[String] = js.native
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous.
    * (Not available for `common` modules).
    */
  var moduleIds: js.UndefOr[Boolean] = js.native
  /** Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions. */
  var moduleRoot: js.UndefOr[String] = js.native
  /**
    * A glob, regex, or mixed array of both, matching paths to only compile. Can also be an array of arrays containing
    * paths to explicitly match. When attempting to compile a non-matching file it's returned verbatim.
    */
  var only: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /** Babylon parser options. */
  var parserOpts: js.UndefOr[BabylonOptions] = js.native
  /** List of plugins to load and use. */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /** List of presets (a set of plugins) to load and use. */
  var presets: js.UndefOr[js.Array[_]] = js.native
  /** Resolve a module source ie. import "SOURCE"; to a custom value. */
  var resolveModuleSource: js.UndefOr[js.Function2[/* source */ String, /* filename */ String, String]] = js.native
  /** Retain line numbers - will result in really ugly code. Default: `false` */
  var retainLines: js.UndefOr[Boolean] = js.native
  /**
    * An optional callback that controls whether a comment should be output or not. Called as
    * `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comments` option when used.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
  /** Set `sources[0]` on returned source map. */
  var sourceFileName: js.UndefOr[String] = js.native
  /** Set `file` on returned source map. */
  var sourceMapTarget: js.UndefOr[String] = js.native
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a `sourceMappingURL`
    * directive is added to the bottom of the returned code. If set to `"both"` then a map property is returned as well
    * as a source map comment appended.
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both] = js.native
  /** The root from which all sources are relative. */
  var sourceRoot: js.UndefOr[String] = js.native
  /** Indicate the mode the code should be parsed in. Can be either “script” or “module”. Default: "module" */
  var sourceType: js.UndefOr[script | module] = js.native
  /**
    * An optional callback that can be used to wrap visitor methods.
    * NOTE: This is useful for things like introspection, and not really needed for implementing anything.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ js.Any, Unit], 
      js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ _, Unit]
    ]
  ] = js.native
}

object TransformOptions {
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryCommentAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryCommentBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryCommentBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withBabelrc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
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
    def withFilenameRelative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratorOpts(value: GeneratorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatorOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratorOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatorOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModuleId(value: /* moduleName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInputSourceMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withMinified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minified")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withParserOpts(value: BabylonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParserOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleSource(value: (/* source */ String, /* filename */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResolveModuleSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleSource")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPrintComment(value: /* comment */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldPrintComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMaps(value: Boolean | `inline` | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[typingsSlinky.babelTraverse.mod.Node], /* state */ _, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutWrapPluginVisitorMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPluginVisitorMethod")(js.undefined)
        ret
    }
  }
  
}

