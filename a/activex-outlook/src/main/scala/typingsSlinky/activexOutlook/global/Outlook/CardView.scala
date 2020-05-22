package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexOutlook.Outlook.OlViewSaveOption
import typingsSlinky.activexOutlook.Outlook.OlViewType
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CardView")
@js.native
class CardView protected ()
  extends typingsSlinky.activexOutlook.Outlook.CardView {
  /* CompleteClass */
  override var AllowInCellEditing: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val AutoFormatRules: typingsSlinky.activexOutlook.Outlook.AutoFormatRules = js.native
  /* CompleteClass */
  override val BodyFont: typingsSlinky.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Filter: String = js.native
  /* CompleteClass */
  override val HeadingsFont: typingsSlinky.activexOutlook.Outlook.ViewFont = js.native
  /* CompleteClass */
  override var Language: String = js.native
  /* CompleteClass */
  override var LockUserChanges: Boolean = js.native
  /* CompleteClass */
  override var MultiLineFieldHeight: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.CardView_typekey")
  override var OutlookDotCardView_typekey: typingsSlinky.activexOutlook.Outlook.CardView = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowEmptyFields: Boolean = js.native
  /* CompleteClass */
  override val SortFields: typingsSlinky.activexOutlook.Outlook.OrderFields = js.native
  /* CompleteClass */
  override val Standard: Boolean = js.native
  /* CompleteClass */
  override val ViewFields: typingsSlinky.activexOutlook.Outlook.ViewFields = js.native
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  /* CompleteClass */
  override var Width: Double = js.native
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

