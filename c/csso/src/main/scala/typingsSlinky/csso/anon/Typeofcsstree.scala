package typingsSlinky.csso.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.cssTree.mod.CssNode
import typingsSlinky.cssTree.mod.CssNodePlain
import typingsSlinky.cssTree.mod.DefinitionSyntax_
import typingsSlinky.cssTree.mod.EnterOrLeaveFn
import typingsSlinky.cssTree.mod.FindFn
import typingsSlinky.cssTree.mod.GenerateOptions
import typingsSlinky.cssTree.mod.Keyword_
import typingsSlinky.cssTree.mod.ParseOptions
import typingsSlinky.cssTree.mod.Property_
import typingsSlinky.cssTree.mod.WalkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcsstree extends js.Object {
  
  var List: Instantiable0[typingsSlinky.cssTree.mod.List[js.Object]] = js.native
  
  def clone(node: CssNode): CssNode = js.native
  
  val definitionSyntax: DefinitionSyntax_ = js.native
  
  def find(ast: CssNode, fn: FindFn): CssNode = js.native
  
  def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = js.native
  
  def findLast(ast: CssNode, fn: FindFn): CssNode = js.native
  
  def fromPlainObject(node: CssNodePlain): CssNode = js.native
  
  def generate(ast: CssNode): String = js.native
  def generate(ast: CssNode, options: GenerateOptions): String = js.native
  
  def keyword(value: String): Keyword_ = js.native
  
  def parse(text: String): CssNode = js.native
  def parse(text: String, options: ParseOptions): CssNode = js.native
  
  def property(value: String): Property_ = js.native
  
  def toPlainObject(node: CssNode): CssNodePlain = js.native
  
  def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = js.native
  def walk(ast: CssNode, options: WalkOptions): Unit = js.native
}
