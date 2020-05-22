package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlDefaultExpandCollapseSetting
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlTimelineViewMode
import typingsSlinky.activexOutlook.Outlook.OlViewSaveOption
import typingsSlinky.activexOutlook.Outlook.OlViewType
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TimelineView")
@js.native
class TimelineView protected ()
  extends typingsSlinky.activexOutlook.Outlook.TimelineView {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  /* CompleteClass */
  override var EndField: String = js.native
  /* CompleteClass */
  override var Filter: String = js.native
  /* CompleteClass */
  override val GroupByFields: typingsSlinky.activexOutlook.Outlook.OrderFields = js.native
  /* CompleteClass */
  override val ItemFont: typingsSlinky.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var Language: String = js.native
  /* CompleteClass */
  override var LockUserChanges: Boolean = js.native
  /* CompleteClass */
  override val LowerScaleFont: typingsSlinky.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var MaxLabelWidth: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.TimelineView_typekey")
  override var OutlookDotTimelineView_typekey: typingsSlinky.activexOutlook.Outlook.TimelineView = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowLabelWhenViewingByMonth: Boolean = js.native
  /* CompleteClass */
  override var ShowWeekNumbers: Boolean = js.native
  /* CompleteClass */
  override val Standard: Boolean = js.native
  /* CompleteClass */
  override var StartField: String = js.native
  /* CompleteClass */
  override var TimelineViewMode: OlTimelineViewMode = js.native
  /* CompleteClass */
  override val UpperScaleFont: typingsSlinky.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  /* CompleteClass */
  override var XML: String = js.native
  /* CompleteClass */
  override def Apply(): Unit = js.native
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typingsSlinky.activexOutlook.Outlook.View = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  /* CompleteClass */
  override def Reset(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

