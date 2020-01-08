package typingsSlinky.fillDashPdf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fill-pdf", JSImport.Namespace)
@js.native
object fillDashPdfMod extends js.Object {
  def generateFdf(data: FormData): Buffer = js.native
  def generatePdf(data: FormData, templatePath: String, extendArgs: js.Array[String]): Unit = js.native
  def generatePdf(
    data: FormData,
    templatePath: String,
    extendArgs: js.Array[String],
    callback: js.Function2[/* err */ js.Error, /* output */ Buffer, Unit]
  ): Unit = js.native
  type FormData = StringDictionary[String]
}

