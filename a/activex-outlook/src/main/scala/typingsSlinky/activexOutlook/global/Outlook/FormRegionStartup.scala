package typingsSlinky.activexOutlook.global.Outlook

import typingsSlinky.activexOutlook.Outlook.OlFormRegionIcon
import typingsSlinky.activexOutlook.Outlook.OlFormRegionMode
import typingsSlinky.activexOutlook.Outlook.OlFormRegionSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegionStartup")
@js.native
class FormRegionStartup protected ()
  extends typingsSlinky.activexOutlook.Outlook.FormRegionStartup {
  /* CompleteClass */
  @JSName("Outlook.FormRegionStartup_typekey")
  override var OutlookDotFormRegionStartup_typekey: typingsSlinky.activexOutlook.Outlook.FormRegionStartup = js.native
  /* CompleteClass */
  override def BeforeFormRegionShow(FormRegion: typingsSlinky.activexOutlook.Outlook.FormRegion): Unit = js.native
  /* CompleteClass */
  override def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): js.Any = js.native
  /* CompleteClass */
  override def GetFormRegionManifest(FormRegionName: String, LCID: Double): js.Any = js.native
  /* CompleteClass */
  override def GetFormRegionStorage(
    FormRegionName: String,
    Item: js.Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any = js.native
}

