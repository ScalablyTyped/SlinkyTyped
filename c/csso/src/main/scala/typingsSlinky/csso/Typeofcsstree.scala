package typingsSlinky.csso

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.cssDashTree.cssDashTreeMod.CssNode
import typingsSlinky.cssDashTree.cssDashTreeMod.CssNodePlain
import typingsSlinky.cssDashTree.cssDashTreeMod.EnterOrLeaveFn
import typingsSlinky.cssDashTree.cssDashTreeMod.GenerateOptions
import typingsSlinky.cssDashTree.cssDashTreeMod.Keyword
import typingsSlinky.cssDashTree.cssDashTreeMod.ParseOptions
import typingsSlinky.cssDashTree.cssDashTreeMod.Property
import typingsSlinky.cssDashTree.cssDashTreeMod.WalkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcsstree extends js.Object {
  var List: Instantiable0[typingsSlinky.cssDashTree.cssDashTreeMod.List[js.Object]] = js.native
  def clone(node: CssNode): CssNode = js.native
  def fromPlainObject(node: CssNodePlain): CssNode = js.native
  def generate(ast: CssNode): String = js.native
  def generate(ast: CssNode, options: GenerateOptions): String = js.native
  def keyword(value: String): Keyword = js.native
  def parse(text: String): CssNode = js.native
  def parse(text: String, options: ParseOptions): CssNode = js.native
  def property(value: String): Property = js.native
  def toPlainObject(node: CssNode): CssNodePlain = js.native
  def walk(ast: CssNode, options: EnterOrLeaveFn): Unit = js.native
  def walk(ast: CssNode, options: WalkOptions): Unit = js.native
}

