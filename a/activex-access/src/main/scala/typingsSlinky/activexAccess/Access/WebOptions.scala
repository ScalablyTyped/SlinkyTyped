package typingsSlinky.activexAccess.Access

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: WebOptions = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

object WebOptions {
  @scala.inline
  def apply(
    AccessDotWebOptions_typekey: WebOptions,
    Application: Application,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean
  ): WebOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WebOptions_typekey")(AccessDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
  @scala.inline
  implicit class WebOptionsOps[Self <: WebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotWebOptions_typekey(value: WebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.WebOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
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
  }
  
}

