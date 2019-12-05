package typingsSlinky.intlDashMessageformatDashParser

import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.DateTimeSkeleton
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib/printer", JSImport.Namespace)
@js.native
object libPrinterMod extends js.Object {
  def printAST(ast: js.Array[MessageFormatElement]): String = js.native
  def printDateTimeSkeleton(style: DateTimeSkeleton): String = js.native
}

