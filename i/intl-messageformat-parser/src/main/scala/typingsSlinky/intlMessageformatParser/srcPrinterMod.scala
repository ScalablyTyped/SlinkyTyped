package typingsSlinky.intlMessageformatParser

import typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/src/printer", JSImport.Namespace)
@js.native
object srcPrinterMod extends js.Object {
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = js.native
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}

