package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Macintosh only */
@JSGlobal("Excel.Mailer")
@js.native
class Mailer protected ()
  extends typingsSlinky.activexExcel.Excel.Mailer {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override var BCCRecipients: js.Any = js.native
  /* CompleteClass */
  override var CCRecipients: js.Any = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var Enclosures: js.Any = js.native
  /* CompleteClass */
  @JSName("Excel.Mailer_typekey")
  override var ExcelDotMailer_typekey: typingsSlinky.activexExcel.Excel.Mailer = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Received: Boolean = js.native
  /* CompleteClass */
  override val SendDateTime: VarDate = js.native
  /* CompleteClass */
  override val Sender: String = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  override var ToRecipients: js.Any = js.native
  /* CompleteClass */
  override var WhichAddress: js.Any = js.native
}

