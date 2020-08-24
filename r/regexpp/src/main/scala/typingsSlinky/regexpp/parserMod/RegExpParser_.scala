package typingsSlinky.regexpp.parserMod

import typingsSlinky.regexpp.astMod.Flags
import typingsSlinky.regexpp.astMod.Pattern
import typingsSlinky.regexpp.astMod.RegExpLiteral
import typingsSlinky.regexpp.parserMod.RegExpParser.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp/parser", "RegExpParser")
@js.native
class RegExpParser_ () extends js.Object {
  def this(options: Options) = this()
  def parseFlags(source: String): Flags = js.native
  def parseFlags(source: String, start: js.UndefOr[scala.Nothing], end: Double): Flags = js.native
  def parseFlags(source: String, start: Double): Flags = js.native
  def parseFlags(source: String, start: Double, end: Double): Flags = js.native
  def parseLiteral(source: String): RegExpLiteral = js.native
  def parseLiteral(source: String, start: js.UndefOr[scala.Nothing], end: Double): RegExpLiteral = js.native
  def parseLiteral(source: String, start: Double): RegExpLiteral = js.native
  def parseLiteral(source: String, start: Double, end: Double): RegExpLiteral = js.native
  def parsePattern(source: String): Pattern = js.native
  def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], uFlag: Boolean): Pattern = js.native
  def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double): Pattern = js.native
  def parsePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double, uFlag: Boolean): Pattern = js.native
  def parsePattern(source: String, start: Double): Pattern = js.native
  def parsePattern(source: String, start: Double, end: js.UndefOr[scala.Nothing], uFlag: Boolean): Pattern = js.native
  def parsePattern(source: String, start: Double, end: Double): Pattern = js.native
  def parsePattern(source: String, start: Double, end: Double, uFlag: Boolean): Pattern = js.native
}

