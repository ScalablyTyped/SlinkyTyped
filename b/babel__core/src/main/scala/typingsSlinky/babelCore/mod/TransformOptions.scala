package typingsSlinky.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelCore.babelCoreStrings.`inline`
import typingsSlinky.babelCore.babelCoreStrings.`upward-optional`
import typingsSlinky.babelCore.babelCoreStrings.auto
import typingsSlinky.babelCore.babelCoreStrings.both
import typingsSlinky.babelCore.babelCoreStrings.enter
import typingsSlinky.babelCore.babelCoreStrings.exit
import typingsSlinky.babelCore.babelCoreStrings.module
import typingsSlinky.babelCore.babelCoreStrings.root
import typingsSlinky.babelCore.babelCoreStrings.script
import typingsSlinky.babelCore.babelCoreStrings.unambiguous
import typingsSlinky.babelCore.babelCoreStrings.upward
import typingsSlinky.babelGenerator.mod.GeneratorOptions
import typingsSlinky.babelParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
  /**
    * Include the AST in the returned object
    *
    * Default: `false`
    */
  var ast: js.UndefOr[Boolean | Null] = js.native
  /**
    * Attach a comment after all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.native
  /**
    * Attach a comment before all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.native
  /**
    * Specify whether or not to use .babelrc and
    * .babelignore files.
    *
    * Default: `true`
    */
  var babelrc: js.UndefOr[Boolean | Null] = js.native
  /**
    * Specify which packages should be search for .babelrc files when they are being compiled. `true` to always search, or a path string or an array of paths to packages to search
    * inside of. Defaults to only searching the "root" package.
    *
    * Default: `(root)`
    */
  var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.native
  /**
    * Utilities may pass a caller object to identify themselves to Babel and
    * pass capability-related flags for use by configs, presets and plugins.
    *
    * @see https://babeljs.io/docs/en/next/options#caller
    */
  var caller: js.UndefOr[TransformCaller] = js.native
  /**
    * Enable code generation
    *
    * Default: `true`
    */
  var code: js.UndefOr[Boolean | Null] = js.native
  /**
    * Output comments in generated output
    *
    * Default: `true`
    */
  var comments: js.UndefOr[Boolean | Null] = js.native
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"` compact is set to `true` on input sizes of >500KB
    *
    * Default: `"auto"`
    */
  var compact: js.UndefOr[Boolean | auto | Null] = js.native
  /**
    * The config file to load Babel's config from. Defaults to searching for "babel.config.js" inside the "root" folder. `false` will disable searching for config files.
    *
    * Default: `undefined`
    */
  var configFile: js.UndefOr[String | Boolean | Null] = js.native
  /**
    * The working directory that Babel's programmatic options are loaded relative to.
    *
    * Default: `"."`
    */
  var cwd: js.UndefOr[String | Null] = js.native
  /**
    * This is an object of keys that represent different environments. For example, you may have: `{ env: { production: { \/ * specific options *\/ } } }`
    * which will use those options when the `envName` is `production`
    *
    * Default: `{}`
    */
  var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.native
  /**
    * Defaults to environment variable `BABEL_ENV` if set, or else `NODE_ENV` if set, or else it defaults to `"development"`
    *
    * Default: env vars
    */
  var envName: js.UndefOr[String] = js.native
  /**
    * If any of patterns match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  /**
    * A path to a `.babelrc` file to extend
    *
    * Default: `null`
    */
  var `extends`: js.UndefOr[String | Null] = js.native
  /**
    * Filename for use in errors etc
    *
    * Default: `"unknown"`
    */
  var filename: js.UndefOr[String | Null] = js.native
  /**
    * Filename relative to `sourceRoot`
    *
    * Default: `(filename)`
    */
  var filenameRelative: js.UndefOr[String | Null] = js.native
  /**
    * An object containing the options to be passed down to the babel code generator, @babel/generator
    *
    * Default: `{}`
    */
  var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.native
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`. If falsy value is returned then the generated module id is used
    *
    * Default: `null`
    */
  var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.native
  /**
    * ANSI highlight syntax error code frames
    *
    * Default: `true`
    */
  var highlightCode: js.UndefOr[Boolean | Null] = js.native
  /**
    * Opposite to the `only` option. `ignore` is disregarded if `only` is specified
    *
    * Default: `null`
    */
  var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.native
  /**
    * This option is a synonym for "test"
    */
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  /**
    * A source map object that the output source map will be based on
    *
    * Default: `null`
    */
  var inputSourceMap: js.UndefOr[js.Object | Null] = js.native
  /**
    * Should the output be minified (not printing last semicolons in blocks, printing literal string values instead of escaped ones, stripping `()` from `new` when safe)
    *
    * Default: `false`
    */
  var minified: js.UndefOr[Boolean | Null] = js.native
  /**
    * Specify a custom name for module ids
    *
    * Default: `null`
    */
  var moduleId: js.UndefOr[String | Null] = js.native
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous. (Not available for `common` modules)
    *
    * Default: `false`
    */
  var moduleIds: js.UndefOr[Boolean | Null] = js.native
  /**
    * Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions
    *
    * Default: `(sourceRoot)`
    */
  var moduleRoot: js.UndefOr[String | Null] = js.native
  /**
    * A glob, regex, or mixed array of both, matching paths to **only** compile. Can also be an array of arrays containing paths to explicitly match. When attempting to compile
    * a non-matching file it's returned verbatim
    *
    * Default: `null`
    */
  var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.native
  /**
    * Allows users to provide an array of options that will be merged into the current configuration one at a time.
    * This feature is best used alongside the "test"/"include"/"exclude" options to provide conditions for which an override should apply
    */
  var overrides: js.UndefOr[js.Array[TransformOptions]] = js.native
  /**
    * An object containing the options to be passed down to the babel parser, @babel/parser
    *
    * Default: `{}`
    */
  var parserOpts: js.UndefOr[ParserOptions | Null] = js.native
  /**
    * List of plugins to load and use
    *
    * Default: `[]`
    */
  var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  /**
    * List of presets (a set of plugins) to load and use
    *
    * Default: `[]`
    */
  var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  /**
    * Retain line numbers. This will lead to wacky code but is handy for scenarios where you can't use source maps. (**NOTE**: This will not retain the columns)
    *
    * Default: `false`
    */
  var retainLines: js.UndefOr[Boolean | Null] = js.native
  /**
    * Specify the "root" folder that defines the location to search for "babel.config.js", and the default folder to allow `.babelrc` files inside of.
    *
    * Default: `"."`
    */
  var root: js.UndefOr[String | Null] = js.native
  /**
    * This option, combined with the "root" value, defines how Babel chooses its project root.
    * The different modes define different ways that Babel can process the "root" value to get
    * the final project root.
    *
    * @see https://babeljs.io/docs/en/next/options#rootmode
    */
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.native
  /**
    * An optional callback that controls whether a comment should be output or not. Called as `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comment` option when used
    *
    * Default: `null`
    */
  var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.native
  /**
    * Set `sources[0]` on returned source map
    *
    * Default: `(filenameRelative)`
    */
  var sourceFileName: js.UndefOr[String | Null] = js.native
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a sourceMappingURL directive is added to the bottom of the returned code. If set to `"both"`
    * then a `map` property is returned as well as a source map comment appended. **This does not emit sourcemap files by itself!**
    *
    * Default: `false`
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.native
  /**
    * The root from which all sources are relative
    *
    * Default: `(moduleRoot)`
    */
  var sourceRoot: js.UndefOr[String | Null] = js.native
  /**
    * Indicate the mode the code should be parsed in. Can be one of "script", "module", or "unambiguous". `"unambiguous"` will make Babel attempt to guess, based on the presence of ES6
    * `import` or `export` statements. Files with ES6 `import`s and `export`s are considered `"module"` and are otherwise `"script"`.
    *
    * Default: `("module")`
    */
  var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.native
  /**
    * If all patterns fail to match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  /**
    * An optional callback that can be used to wrap visitor methods. **NOTE**: This is useful for things like introspection, and not really needed for implementing anything. Called as
    * `wrapPluginVisitorMethod(pluginAlias, visitorType, callback)`.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    (js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[
        /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTraverse.mod.Node], 
        /* state */ js.Any, 
        Unit
      ], 
      js.Function2[
        /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTraverse.mod.Node], 
        /* state */ _, 
        Unit
      ]
    ]) | Null
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
    def withAstNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(null)
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
    def withAuxiliaryCommentAfterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentAfter")(null)
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
    def withAuxiliaryCommentBeforeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryCommentBefore")(null)
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
    def withBabelrcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(null)
        ret
    }
    @scala.inline
    def withBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrcRoots")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBabelrcRootsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrcRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrcRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelrcRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrcRoots")(js.undefined)
        ret
    }
    @scala.inline
    def withBabelrcRootsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrcRoots")(null)
        ret
    }
    @scala.inline
    def withCaller(value: TransformCaller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(js.undefined)
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
    def withCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(null)
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
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
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
    def withCompactNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(null)
        ret
    }
    @scala.inline
    def withConfigFile(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configFile")(null)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withCwdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(null)
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = {
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
    def withEnvNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(null)
        ret
    }
    @scala.inline
    def withEnvName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envName")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: MatchPattern | js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
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
    def withExtendsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(null)
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
    def withFilenameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(null)
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
    def withFilenameRelativeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameRelative")(null)
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
    def withGeneratorOptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatorOpts")(null)
        ret
    }
    @scala.inline
    def withGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = {
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
    def withGetModuleIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleId")(null)
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
    def withHighlightCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCode")(null)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[MatchPattern]): Self = {
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
    def withIgnoreNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(null)
        ret
    }
    @scala.inline
    def withIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: MatchPattern | js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
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
    def withInputSourceMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSourceMap")(null)
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
    def withMinifiedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minified")(null)
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
    def withModuleIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(null)
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
    def withModuleIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(null)
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
    def withModuleRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleRoot")(null)
        ret
    }
    @scala.inline
    def withOnly(value: js.Array[MatchPattern]): Self = {
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
    def withOnlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(null)
        ret
    }
    @scala.inline
    def withOverrides(value: js.Array[TransformOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withParserOpts(value: ParserOptions): Self = {
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
    def withParserOptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOpts")(null)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginItem]): Self = {
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
    def withPluginsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(null)
        ret
    }
    @scala.inline
    def withPresets(value: js.Array[PluginItem]): Self = {
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
    def withPresetsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(null)
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
    def withRetainLinesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainLines")(null)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withRootMode(value: root | upward | `upward-optional`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldPrintComment(value: /* commentContents */ String => Boolean): Self = {
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
    def withShouldPrintCommentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintComment")(null)
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
    def withSourceFileNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileName")(null)
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
    def withSourceMapsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMaps")(null)
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
    def withSourceRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(null)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module | unambiguous): Self = {
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
    def withSourceTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(null)
        ret
    }
    @scala.inline
    def withTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: MatchPattern | js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[
          /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTraverse.mod.Node], 
          /* state */ js.Any, 
          Unit
        ]) => js.Function2[
          /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTraverse.mod.Node], 
          /* state */ _, 
          Unit
        ]
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
    @scala.inline
    def withWrapPluginVisitorMethodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapPluginVisitorMethod")(null)
        ret
    }
  }
  
}

