package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimeZones")
@js.native
class TimeZones protected ()
  extends typingsSlinky.activexOutlook.Outlook.TimeZones {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val CurrentTimeZone: typingsSlinky.activexOutlook.Outlook.TimeZone = js.native
  /* CompleteClass */
  @JSName("Outlook.TimeZones_typekey")
  override var OutlookDotTimeZones_typekey: typingsSlinky.activexOutlook.Outlook.TimeZones = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def ConvertTime(
    SourceDateTime: VarDate,
    SourceTimeZone: typingsSlinky.activexOutlook.Outlook.TimeZone,
    DestinationTimeZone: typingsSlinky.activexOutlook.Outlook.TimeZone
  ): VarDate = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexOutlook.Outlook.TimeZone = js.native
}

