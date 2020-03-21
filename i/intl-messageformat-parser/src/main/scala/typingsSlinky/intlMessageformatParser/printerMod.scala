package typingsSlinky.intlMessageformatParser

import typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
import typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib/printer", JSImport.Namespace)
@js.native
object printerMod extends js.Object {
  def doPrintAST(ast: js.Array[MessageFormatElement], isInPlural: Boolean): String = js.native
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}

