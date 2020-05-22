package typingsSlinky.babelPluginTester.mod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.babelCore.anon.ReadonlyPartialConfig
import typingsSlinky.babelCore.mod.BabelFileResult
import typingsSlinky.babelCore.mod.ConfigItem
import typingsSlinky.babelCore.mod.CreateConfigItemOptions
import typingsSlinky.babelCore.mod.FileParseCallback
import typingsSlinky.babelCore.mod.FileResultCallback
import typingsSlinky.babelCore.mod.ParseResult
import typingsSlinky.babelCore.mod.PluginOptions
import typingsSlinky.babelCore.mod.PluginTarget
import typingsSlinky.babelCore.mod.TransformOptions
import typingsSlinky.babelPluginTester.anon.Typeoftypes
import typingsSlinky.babelPluginTester.babelPluginTesterStrings.Dotes
import typingsSlinky.babelPluginTester.babelPluginTesterStrings.Dotes6
import typingsSlinky.babelPluginTester.babelPluginTesterStrings.Dotjs
import typingsSlinky.babelPluginTester.babelPluginTesterStrings.Dotjsx
import typingsSlinky.babelPluginTester.babelPluginTesterStrings.Dotmjs
import typingsSlinky.babelTemplate.mod.DefaultTemplateBuilder
import typingsSlinky.babelTemplate.mod.PublicReplacements
import typingsSlinky.babelTemplate.mod.TemplateBuilder
import typingsSlinky.babelTemplate.mod.TemplateBuilderOptions
import typingsSlinky.babelTraverse.mod.Hub
import typingsSlinky.babelTraverse.mod.Node
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTraverse.mod.Scope
import typingsSlinky.babelTraverse.mod.TraverseOptions
import typingsSlinky.babelTypes.mod.Statement
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelType extends js.Object {
  val DEFAULT_EXTENSIONS: js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs] = js.native
  var NodePath: Instantiable2[/* hub */ Hub, /* parent */ Node, typingsSlinky.babelCore.mod.NodePath[js.Object]] = js.native
  @JSName("template")
  val template_Original: DefaultTemplateBuilder = js.native
  val types: Typeoftypes = js.native
  val version: String = js.native
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
  def parse(code: String, options: js.UndefOr[TransformOptions], callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: TransformOptions): ParseResult | Null = js.native
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
  def transform(code: String): BabelFileResult | Null = js.native
  def transform(code: String, callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: js.UndefOr[TransformOptions], callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformAsync(code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFile(filename: String, callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: js.UndefOr[TransformOptions], callback: FileResultCallback): Unit = js.native
  def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFileSync(filename: String): BabelFileResult | Null = js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformFromAst(ast: typingsSlinky.babelCore.mod.Node, code: js.UndefOr[String], callback: FileResultCallback): Unit = js.native
  def transformFromAst(
    ast: typingsSlinky.babelCore.mod.Node,
    code: js.UndefOr[String],
    opts: js.UndefOr[TransformOptions],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAstAsync(ast: typingsSlinky.babelCore.mod.Node): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typingsSlinky.babelCore.mod.Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typingsSlinky.babelCore.mod.Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstSync(ast: typingsSlinky.babelCore.mod.Node): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typingsSlinky.babelCore.mod.Node, code: String): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typingsSlinky.babelCore.mod.Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformSync(code: String): BabelFileResult | Null = js.native
  def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(
    parent: js.Array[Node],
    opts: TraverseOptions[Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any, parentPath: NodePath[Node]): Unit = js.native
  def traverse[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: js.UndefOr[Scope], state: S): Unit = js.native
  def traverse[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: js.UndefOr[Scope], state: S): Unit = js.native
  def traverse[S](
    parent: Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[Scope],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
}

