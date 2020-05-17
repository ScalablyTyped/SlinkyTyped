package typingsSlinky.activexAccess.Access

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultWebOptions extends js.Object {
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var FollowedHyperlinkColor: AcColorIndex = js.native
  var HyperlinkColor: AcColorIndex = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UnderlineHyperlinks: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object DefaultWebOptions {
  @scala.inline
  def apply(
    AccessDotDefaultWebOptions_typekey: DefaultWebOptions,
    AlwaysSaveInDefaultEncoding: Boolean,
    Application: Application,
    CheckIfOfficeIsHTMLEditor: Boolean,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FollowedHyperlinkColor: AcColorIndex,
    HyperlinkColor: AcColorIndex,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UnderlineHyperlinks: Boolean,
    UseLongFileNames: Boolean
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FollowedHyperlinkColor = FollowedHyperlinkColor.asInstanceOf[js.Any], HyperlinkColor = HyperlinkColor.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UnderlineHyperlinks = UnderlineHyperlinks.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DefaultWebOptions_typekey")(AccessDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
  @scala.inline
  implicit class DefaultWebOptionsOps[Self <: DefaultWebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.DefaultWebOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysSaveInDefaultEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlwaysSaveInDefaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckIfOfficeIsHTMLEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckIfOfficeIsHTMLEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadComponents")(value.asInstanceOf[js.Any])
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
    def withFollowedHyperlinkColor(value: AcColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FollowedHyperlinkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkColor(value: AcColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperlinkColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocationOfComponents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationOfComponents")(value.asInstanceOf[js.Any])
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
    def withTargetBrowser(value: MsoTargetBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlineHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnderlineHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseLongFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongFileNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

