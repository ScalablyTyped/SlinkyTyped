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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends StObject {
  
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
        /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTypes.mod.Node], 
        /* state */ js.Any, 
        Unit
      ], 
      js.Function2[
        /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTypes.mod.Node], 
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
  implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = StObject.set(x, "ast", null)
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
    
    @scala.inline
    def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
    
    @scala.inline
    def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
    
    @scala.inline
    def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
    
    @scala.inline
    def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
    
    @scala.inline
    def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
    
    @scala.inline
    def setBabelrcRootsRegExp(value: js.RegExp): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
    
    @scala.inline
    def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value :_*))
    
    @scala.inline
    def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
    
    @scala.inline
    def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    @scala.inline
    def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactNull: Self = StObject.set(x, "compact", null)
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileNull: Self = StObject.set(x, "configFile", null)
    
    @scala.inline
    def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdNull: Self = StObject.set(x, "cwd", null)
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
    
    @scala.inline
    def setEnvNull: Self = StObject.set(x, "env", null)
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    @scala.inline
    def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
    
    @scala.inline
    def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
    
    @scala.inline
    def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
    
    @scala.inline
    def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
    
    @scala.inline
    def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
    
    @scala.inline
    def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
    
    @scala.inline
    def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
    
    @scala.inline
    def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreNull: Self = StObject.set(x, "ignore", null)
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: MatchPattern*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setInputSourceMap(value: js.Object): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
    
    @scala.inline
    def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
    
    @scala.inline
    def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinifiedNull: Self = StObject.set(x, "minified", null)
    
    @scala.inline
    def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
    
    @scala.inline
    def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
    
    @scala.inline
    def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
    
    @scala.inline
    def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
    
    @scala.inline
    def setOnly(value: js.Array[MatchPattern]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyNull: Self = StObject.set(x, "only", null)
    
    @scala.inline
    def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: MatchPattern*): Self = StObject.set(x, "only", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    @scala.inline
    def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
    
    @scala.inline
    def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsNull: Self = StObject.set(x, "plugins", null)
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetsNull: Self = StObject.set(x, "presets", null)
    
    @scala.inline
    def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value :_*))
    
    @scala.inline
    def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
    
    @scala.inline
    def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
    
    @scala.inline
    def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
    
    @scala.inline
    def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
    
    @scala.inline
    def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
    
    @scala.inline
    def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapsNull: Self = StObject.set(x, "sourceMaps", null)
    
    @scala.inline
    def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
    
    @scala.inline
    def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    @scala.inline
    def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value :_*))
    
    @scala.inline
    def setWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[
          /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTypes.mod.Node], 
          /* state */ js.Any, 
          Unit
        ]) => js.Function2[
          /* path */ typingsSlinky.babelTraverse.mod.NodePath[typingsSlinky.babelTypes.mod.Node], 
          /* state */ _, 
          Unit
        ]
    ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
    
    @scala.inline
    def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
  }
}
