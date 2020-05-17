package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormRegionStartup extends js.Object {
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup = js.native
  def BeforeFormRegionShow(FormRegion: FormRegion): Unit = js.native
  def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): js.Any = js.native
  def GetFormRegionManifest(FormRegionName: String, LCID: Double): js.Any = js.native
  def GetFormRegionStorage(
    FormRegionName: String,
    Item: js.Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any = js.native
}

object FormRegionStartup {
  @scala.inline
  def apply(
    BeforeFormRegionShow: FormRegion => Unit,
    GetFormRegionIcon: (String, Double, OlFormRegionIcon) => js.Any,
    GetFormRegionManifest: (String, Double) => js.Any,
    GetFormRegionStorage: (String, js.Any, Double, OlFormRegionMode, OlFormRegionSize) => js.Any,
    OutlookDotFormRegionStartup_typekey: FormRegionStartup
  ): FormRegionStartup = {
    val __obj = js.Dynamic.literal(BeforeFormRegionShow = js.Any.fromFunction1(BeforeFormRegionShow), GetFormRegionIcon = js.Any.fromFunction3(GetFormRegionIcon), GetFormRegionManifest = js.Any.fromFunction2(GetFormRegionManifest), GetFormRegionStorage = js.Any.fromFunction5(GetFormRegionStorage))
    __obj.updateDynamic("Outlook.FormRegionStartup_typekey")(OutlookDotFormRegionStartup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegionStartup]
  }
  @scala.inline
  implicit class FormRegionStartupOps[Self <: FormRegionStartup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeFormRegionShow(value: FormRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeFormRegionShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormRegionIcon(value: (String, Double, OlFormRegionIcon) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFormRegionIcon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetFormRegionManifest(value: (String, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFormRegionManifest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFormRegionStorage(value: (String, js.Any, Double, OlFormRegionMode, OlFormRegionSize) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFormRegionStorage")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOutlookDotFormRegionStartup_typekey(value: FormRegionStartup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.FormRegionStartup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

