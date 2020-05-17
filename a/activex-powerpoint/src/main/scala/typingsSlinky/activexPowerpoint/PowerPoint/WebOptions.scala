package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  var AllowPNG: MsoTriState = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var FrameColors: PpFrameColors = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  var IncludeNavigation: MsoTriState = js.native
  var OrganizeInFolder: MsoTriState = js.native
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: WebOptions = js.native
  var RelyOnVML: MsoTriState = js.native
  var ResizeGraphics: MsoTriState = js.native
  var ScreenSize: MsoScreenSize = js.native
  var ShowSlideAnimation: MsoTriState = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: MsoTriState = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

object WebOptions {
  @scala.inline
  def apply(
    AllowPNG: MsoTriState,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FrameColors: PpFrameColors,
    HTMLVersion: PpHTMLVersion,
    IncludeNavigation: MsoTriState,
    OrganizeInFolder: MsoTriState,
    PowerPointDotWebOptions_typekey: WebOptions,
    RelyOnVML: MsoTriState,
    ResizeGraphics: MsoTriState,
    ScreenSize: MsoScreenSize,
    ShowSlideAnimation: MsoTriState,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: MsoTriState
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FrameColors = FrameColors.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], IncludeNavigation = IncludeNavigation.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ResizeGraphics = ResizeGraphics.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], ShowSlideAnimation = ShowSlideAnimation.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.WebOptions_typekey")(PowerPointDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  @scala.inline
  implicit class WebOptionsOps[Self <: WebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPNG(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowPNG")(value.asInstanceOf[js.Any])
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
    def withFrameColors(value: PpFrameColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTMLVersion(value: PpHTMLVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeNavigation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizeInFolder(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizeInFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotWebOptions_typekey(value: WebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.WebOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelyOnVML(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelyOnVML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeGraphics(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeGraphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenSize(value: MsoScreenSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSlideAnimation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSlideAnimation")(value.asInstanceOf[js.Any])
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
    def withUseLongFileNames(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongFileNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

