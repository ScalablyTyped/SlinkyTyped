package typingsSlinky.babelGenerator.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/generator", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(ast: Node): GeneratorResult = js.native
  def apply(ast: Node, opts: js.UndefOr[scala.Nothing], code: String): GeneratorResult = js.native
  def apply(ast: Node, opts: js.UndefOr[scala.Nothing], code: StringDictionary[String]): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions, code: String): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions, code: StringDictionary[String]): GeneratorResult = js.native
}
