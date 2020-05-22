package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Row")
@js.native
class Row protected ()
  extends typingsSlinky.activexOutlook.Outlook.Row {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  @JSName("Outlook.Row_typekey")
  override var OutlookDotRow_typekey: typingsSlinky.activexOutlook.Outlook.Row = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def BinaryToString(Index: js.Any): String = js.native
  /* CompleteClass */
  override def GetValues(): js.Any = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): js.Any = js.native
  /* CompleteClass */
  override def LocalTimeToUTC(Index: js.Any): VarDate = js.native
  /* CompleteClass */
  override def UTCToLocalTime(Index: js.Any): VarDate = js.native
}

