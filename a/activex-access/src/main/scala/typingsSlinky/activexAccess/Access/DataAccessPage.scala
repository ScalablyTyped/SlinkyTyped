package typingsSlinky.activexAccess.Access

import typingsSlinky.activexOffice.Office.MsoEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataAccessPage extends js.Object {
  @JSName("Access.DataAccessPage_typekey")
  var AccessDotDataAccessPage_typekey: DataAccessPage = js.native
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  var ConnectionString: String = js.native
  val CurrentSelection: js.Any = js.native
  val CurrentView: Double = js.native
  val Document: js.Any = js.native
  val FieldListConnection: js.Any = js.native
  val MSODSC: js.Any = js.native
  val MailEnvelope: MsoEnvelope = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var RemovePersonalInformation: Boolean = js.native
  var Tag: String = js.native
  var Visible: Boolean = js.native
  val WebOptions: typingsSlinky.activexAccess.Access.WebOptions = js.native
  val WindowHeight: Double = js.native
  val WindowWidth: Double = js.native
  val _Name: String = js.native
  def ApplyTheme(ThemeName: String): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object DataAccessPage {
  @scala.inline
  def apply(
    AccessDotDataAccessPage_typekey: DataAccessPage,
    Application: Application,
    ApplyTheme: String => Unit,
    ConnectionString: String,
    CurrentSelection: js.Any,
    CurrentView: Double,
    Document: js.Any,
    FieldListConnection: js.Any,
    IsMemberSafe: Double => Boolean,
    MSODSC: js.Any,
    MailEnvelope: MsoEnvelope,
    Name: String,
    Parent: js.Any,
    RemovePersonalInformation: Boolean,
    Tag: String,
    Visible: Boolean,
    WebOptions: WebOptions,
    WindowHeight: Double,
    WindowWidth: Double,
    _Name: String
  ): DataAccessPage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ApplyTheme = js.Any.fromFunction1(ApplyTheme), ConnectionString = ConnectionString.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], CurrentView = CurrentView.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], FieldListConnection = FieldListConnection.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MSODSC = MSODSC.asInstanceOf[js.Any], MailEnvelope = MailEnvelope.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemovePersonalInformation = RemovePersonalInformation.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WebOptions = WebOptions.asInstanceOf[js.Any], WindowHeight = WindowHeight.asInstanceOf[js.Any], WindowWidth = WindowWidth.asInstanceOf[js.Any], _Name = _Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DataAccessPage_typekey")(AccessDotDataAccessPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAccessPage]
  }
  @scala.inline
  implicit class DataAccessPageOps[Self <: DataAccessPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotDataAccessPage_typekey(value: DataAccessPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.DataAccessPage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyTheme(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldListConnection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldListConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMSODSC(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSODSC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailEnvelope(value: MsoEnvelope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailEnvelope")(value.asInstanceOf[js.Any])
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
    def withRemovePersonalInformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemovePersonalInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebOptions(value: WebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

