package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlCategoryColor
import typingsSlinky.activexOutlook.Outlook.OlCategoryShortcutKey
import typingsSlinky.activexOutlook.Outlook.OlObjectClass
import typingsSlinky.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Category")
@js.native
class Category protected ()
  extends typingsSlinky.activexOutlook.Outlook.Category {
  /* CompleteClass */
  override val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val CategoryBorderColor: OLE_COLOR = js.native
  /* CompleteClass */
  override val CategoryGradientBottomColor: OLE_COLOR = js.native
  /* CompleteClass */
  override val CategoryGradientTopColor: OLE_COLOR = js.native
  /* CompleteClass */
  override val CategoryID: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Color: OlCategoryColor = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Category_typekey")
  override var OutlookDotCategory_typekey: typingsSlinky.activexOutlook.Outlook.Category = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typingsSlinky.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShortcutKey: OlCategoryShortcutKey = js.native
}

