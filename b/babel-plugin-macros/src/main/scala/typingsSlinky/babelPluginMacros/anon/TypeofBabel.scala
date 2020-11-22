package typingsSlinky.babelPluginMacros.anon

import typingsSlinky.babelCore.anon.ReadonlyPartialConfig
import typingsSlinky.babelCore.mod.BabelFileResult
import typingsSlinky.babelCore.mod.ConfigItem
import typingsSlinky.babelCore.mod.CreateConfigItemOptions
import typingsSlinky.babelCore.mod.FileParseCallback
import typingsSlinky.babelCore.mod.FileResultCallback
import typingsSlinky.babelCore.mod.Node
import typingsSlinky.babelCore.mod.ParseResult
import typingsSlinky.babelCore.mod.PluginOptions
import typingsSlinky.babelCore.mod.PluginTarget
import typingsSlinky.babelCore.mod.TransformOptions
import typingsSlinky.babelPluginMacros.babelPluginMacrosStrings.Dotes
import typingsSlinky.babelPluginMacros.babelPluginMacrosStrings.Dotes6
import typingsSlinky.babelPluginMacros.babelPluginMacrosStrings.Dotjs
import typingsSlinky.babelPluginMacros.babelPluginMacrosStrings.Dotjsx
import typingsSlinky.babelPluginMacros.babelPluginMacrosStrings.Dotmjs
import typingsSlinky.babelTemplate.mod.DefaultTemplateBuilder
import typingsSlinky.babelTemplate.mod.PublicReplacements
import typingsSlinky.babelTemplate.mod.TemplateBuilder
import typingsSlinky.babelTemplate.mod.TemplateBuilderOptions
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTraverse.mod.Scope
import typingsSlinky.babelTraverse.mod.TraverseOptions
import typingsSlinky.babelTypes.mod.Statement
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBabel extends js.Object {
  
  val DEFAULT_EXTENSIONS: js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs] = js.native
  
  var NodePath: TypeofNodePath = js.native
  
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = js.native
  def createConfigItem(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]],
    options: CreateConfigItemOptions
  ): ConfigItem = js.native
  def createConfigItem(value: PluginTarget): ConfigItem = js.native
  def createConfigItem(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = js.native
  
  def loadOptions(): js.Object | Null = js.native
  def loadOptions(options: TransformOptions): js.Object | Null = js.native
  
  def loadPartialConfig(): ReadonlyPartialConfig | Null = js.native
  def loadPartialConfig(options: TransformOptions): ReadonlyPartialConfig | Null = js.native
  
  def parse(code: String): ParseResult | Null = js.native
  def parse(code: String, callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: js.UndefOr[scala.Nothing], callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: TransformOptions): ParseResult | Null = js.native
  def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = js.native
  
  def parseAsync(code: String): js.Promise[ParseResult | Null] = js.native
  def parseAsync(code: String, options: TransformOptions): js.Promise[ParseResult | Null] = js.native
  
  def parseSync(code: String): ParseResult | Null = js.native
  def parseSync(code: String, options: TransformOptions): ParseResult | Null = js.native
  
  def resolvePlugin(name: String, dirname: String): String | Null = js.native
  
  def resolvePreset(name: String, dirname: String): String | Null = js.native
  
  /**
    * Building from a string produces an AST builder function by default.
    */
  def template(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  def template(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def template(opts: TemplateBuilderOptions): TemplateBuilder[Statement | js.Array[Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def template(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  @JSName("template")
  val template_Original: DefaultTemplateBuilder = js.native
  
  def transform(code: String): BabelFileResult | Null = js.native
  def transform(code: String, callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transform(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  
  def transformAsync(code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  
  def transformFile(filename: String, callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  
  def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  
  def transformFileSync(filename: String): BabelFileResult | Null = js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = js.native
  
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFromAst(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  
  def transformFromAstAsync(ast: Node): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  
  def transformFromAstSync(ast: Node): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: Node, code: String): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  
  def transformSync(code: String): BabelFileResult | Null = js.native
  def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  
  def traverse(
    parent: js.UndefOr[
      typingsSlinky.babelTypes.mod.Node | js.Array[typingsSlinky.babelTypes.mod.Node] | Null
    ],
    opts: js.UndefOr[TraverseOptions[typingsSlinky.babelTypes.mod.Node]],
    scope: js.UndefOr[Scope],
    state: js.UndefOr[js.Any],
    parentPath: js.UndefOr[NodePath[typingsSlinky.babelTypes.mod.Node]]
  ): Unit = js.native
  def traverse[S](
    parent: js.UndefOr[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.UndefOr[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.UndefOr[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.UndefOr[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typingsSlinky.babelTypes.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  def traverse[S](parent: Null, opts: TraverseOptions[S], scope: js.UndefOr[scala.Nothing], state: S): Unit = js.native
  def traverse[S](
    parent: Null,
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  def traverse[S](parent: Null, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def traverse[S](
    parent: Null,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsSlinky.babelTypes.mod.Node]
  ): Unit = js.native
  @JSName("traverse")
  val traverse_Original: Call = js.native
  
  val types: Typeoftypes = js.native
  
  val version: String = js.native
}
