package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIn extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Author: String = js.native
  val CLSID: String = js.native
  val Comments: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.AddIn_typekey")
  var ExcelDotAddIn_typekey: AddIn = js.native
  val FullName: String = js.native
  var Installed: Boolean = js.native
  val IsOpen: Boolean = js.native
  val Keywords: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val Subject: String = js.native
  val Title: String = js.native
  val progID: String = js.native
}

object AddIn {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    CLSID: String,
    Comments: String,
    Creator: XlCreator,
    ExcelDotAddIn_typekey: AddIn,
    FullName: String,
    Installed: Boolean,
    IsOpen: Boolean,
    Keywords: String,
    Name: String,
    Parent: js.Any,
    Path: String,
    Subject: String,
    Title: String,
    progID: String
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CLSID = CLSID.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AddIn_typekey")(ExcelDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  @scala.inline
  implicit class AddInOps[Self <: AddIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotAddIn_typekey(value: AddIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.AddIn_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

