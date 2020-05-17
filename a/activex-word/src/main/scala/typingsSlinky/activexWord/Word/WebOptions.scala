package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  var AllowPNG: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BrowserLevel: WdBrowserLevel = js.native
  val Creator: Double = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var OptimizeForBrowser: Boolean = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  @JSName("Word.WebOptions_typekey")
  var WordDotWebOptions_typekey: WebOptions = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

object WebOptions {
  @scala.inline
  def apply(
    AllowPNG: Boolean,
    Application: Application,
    BrowserLevel: WdBrowserLevel,
    Creator: Double,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    OptimizeForBrowser: Boolean,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean,
    WordDotWebOptions_typekey: WebOptions
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BrowserLevel = BrowserLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], OptimizeForBrowser = OptimizeForBrowser.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WebOptions_typekey")(WordDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  @scala.inline
  implicit class WebOptionsOps[Self <: WebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPNG(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowPNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserLevel(value: WdBrowserLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrowserLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: MsoEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FolderSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeForBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeForBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizeInFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizeInFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelsPerInch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PixelsPerInch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelyOnCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelyOnCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelyOnVML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelyOnVML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenSize(value: MsoScreenSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetBrowser(value: MsoTargetBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDefaultFolderSuffix(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDefaultFolderSuffix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseLongFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotWebOptions_typekey(value: WebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.WebOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

