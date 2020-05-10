package typingsSlinky.mvdanSh

import typingsSlinky.mvdanSh.mod.LangVariant
import typingsSlinky.mvdanSh.mod.Node
import typingsSlinky.mvdanSh.mod.Parser
import typingsSlinky.mvdanSh.mod.ParserOption
import typingsSlinky.mvdanSh.mod.Printer
import typingsSlinky.mvdanSh.mod.PrinterOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBinaryNextLine extends js.Object {
  // variant
  var LangBash: typingsSlinky.mvdanSh.mod.LangVariant.LangBash = js.native
  var LangMirBSDKorn: typingsSlinky.mvdanSh.mod.LangVariant.LangMirBSDKorn = js.native
  var LangPOSIX: typingsSlinky.mvdanSh.mod.LangVariant.LangPOSIX = js.native
  def BinaryNextLine(enabled: Boolean): PrinterOption = js.native
  // helpers and utils
  def DebugPrint(node: Node): Unit = js.native
  def FunctionNextLine(enabled: Boolean): PrinterOption = js.native
  def Indent(spaces: Double): PrinterOption = js.native
  def KeepComments(): ParserOption = js.native
  def KeepComments(enabled: Boolean): ParserOption = js.native
  def KeepPadding(enabled: Boolean): PrinterOption = js.native
  def Minify(enabled: Boolean): PrinterOption = js.native
  // parser
  def NewParser(options: ParserOption*): Parser = js.native
  // printer
  def NewPrinter(options: PrinterOption*): Printer = js.native
  def NodeType(node: Node): String = js.native
  def SpaceRedirects(enabled: Boolean): PrinterOption = js.native
  def SplitBraces[T](word: T): T = js.native
  def StopAt(word: String): ParserOption = js.native
  def SwitchCaseIndent(enabled: Boolean): PrinterOption = js.native
  def Variant(lang: LangVariant): ParserOption = js.native
  def Walk(node: Node, walker: js.Function1[/* node */ Node, Boolean]): Unit = js.native
}

