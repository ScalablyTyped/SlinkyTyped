package typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.ScriptKind
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQueryApi extends js.Object {
  
  def apply[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
  def apply[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
  def apply[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
  def apply[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
  
  def ast(source: String): SourceFile = js.native
  def ast(source: String, fileName: js.UndefOr[scala.Nothing], scriptKind: ScriptKind): SourceFile = js.native
  def ast(source: String, fileName: String): SourceFile = js.native
  def ast(source: String, fileName: String, scriptKind: ScriptKind): SourceFile = js.native
  
  def map(ast: SourceFile, selector: String, nodeTransformer: TSQueryNodeTransformer): SourceFile = js.native
  def map(
    ast: SourceFile,
    selector: String,
    nodeTransformer: TSQueryNodeTransformer,
    options: TSQueryOptions
  ): SourceFile = js.native
  
  def `match`[T /* <: Node */](ast: Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
  def `match`[T /* <: Node */](ast: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
  
  def parse(selector: String): TSQuerySelectorNode = js.native
  def parse(selector: String, options: TSQueryOptions): TSQuerySelectorNode = js.native
  
  def project(configFilePath: String): js.Array[SourceFile] = js.native
  
  def projectFiles(configFilePath: String): js.Array[String] = js.native
  
  def query[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
  def query[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
  def query[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
  def query[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
  
  def replace(source: String, selector: String, stringTransformer: TSQueryStringTransformer): String = js.native
  def replace(
    source: String,
    selector: String,
    stringTransformer: TSQueryStringTransformer,
    options: TSQueryOptions
  ): String = js.native
  
  def syntaxKindName(node: SyntaxKind): String = js.native
}
