package typingsSlinky.jestSnapshot.anon

import typingsSlinky.prettier.anon.ShouldBreak
import typingsSlinky.prettier.anon.Type
import typingsSlinky.prettier.mod.doc.builders.Align_
import typingsSlinky.prettier.mod.doc.builders.BreakParent_
import typingsSlinky.prettier.mod.doc.builders.Concat_
import typingsSlinky.prettier.mod.doc.builders.Cursor_
import typingsSlinky.prettier.mod.doc.builders.Doc
import typingsSlinky.prettier.mod.doc.builders.Fill_
import typingsSlinky.prettier.mod.doc.builders.Group_
import typingsSlinky.prettier.mod.doc.builders.IfBreak_
import typingsSlinky.prettier.mod.doc.builders.Indent_
import typingsSlinky.prettier.mod.doc.builders.LineSuffixBoundary_
import typingsSlinky.prettier.mod.doc.builders.LineSuffix_
import typingsSlinky.prettier.mod.doc.builders.Line_
import typingsSlinky.prettier.mod.doc.builders.Trim_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbuilders extends js.Object {
  
  def addAlignmentToDoc(doc: Doc, size: Double, tabWidth: Double): Doc = js.native
  
  def align(n: String, contents: Doc): Align_ = js.native
  def align(n: Double, contents: Doc): Align_ = js.native
  def align(n: Type, contents: Doc): Align_ = js.native
  
  val breakParent: BreakParent_ = js.native
  
  def concat(contents: js.Array[Doc]): Concat_ = js.native
  
  def conditionalGroup(states: js.Array[Doc]): Group_ = js.native
  def conditionalGroup(states: js.Array[Doc], opts: ShouldBreak): Group_ = js.native
  
  val cursor: Cursor_ = js.native
  
  def dedent(contents: Doc): Align_ = js.native
  
  def dedentToRoot(contents: Doc): Align_ = js.native
  
  def fill(parts: js.Array[Doc]): Fill_ = js.native
  
  def group(contents: Doc): Group_ = js.native
  def group(contents: Doc, opts: ShouldBreak): Group_ = js.native
  
  val hardline: Concat_ = js.native
  
  def ifBreak(breakContents: Doc, flatContents: Doc): IfBreak_ = js.native
  
  def indent(contents: Doc): Indent_ = js.native
  
  def join(separator: Doc, parts: js.Array[Doc]): Concat_ = js.native
  
  val line: Line_ = js.native
  
  def lineSuffix(contents: Doc): LineSuffix_ = js.native
  
  val lineSuffixBoundary: LineSuffixBoundary_ = js.native
  
  val literalline: Concat_ = js.native
  
  def markAsRoot(contents: Doc): Align_ = js.native
  
  val softline: Line_ = js.native
  
  val trim: Trim_ = js.native
}
