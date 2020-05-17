package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoHyperlinkType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperlink extends js.Object {
  var Address: String = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var EmailSubject: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Hyperlink_typekey")
  var PowerPointDotHyperlink_typekey: Hyperlink = js.native
  var ScreenTip: String = js.native
  var ShowAndReturn: MsoTriState = js.native
  var SubAddress: String = js.native
  var TextToDisplay: String = js.native
  val Type: MsoHyperlinkType = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit = js.native
  def Delete(): Unit = js.native
  def Follow(): Unit = js.native
}

object Hyperlink {
  @scala.inline
  def apply(
    AddToFavorites: () => Unit,
    Address: String,
    Application: Application,
    CreateNewDocument: (String, MsoTriState, MsoTriState) => Unit,
    Delete: () => Unit,
    EmailSubject: String,
    Follow: () => Unit,
    Parent: js.Any,
    PowerPointDotHyperlink_typekey: Hyperlink,
    ScreenTip: String,
    ShowAndReturn: MsoTriState,
    SubAddress: String,
    TextToDisplay: String,
    Type: MsoHyperlinkType
  ): Hyperlink = {
    val __obj = js.Dynamic.literal(AddToFavorites = js.Any.fromFunction0(AddToFavorites), Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CreateNewDocument = js.Any.fromFunction3(CreateNewDocument), Delete = js.Any.fromFunction0(Delete), EmailSubject = EmailSubject.asInstanceOf[js.Any], Follow = js.Any.fromFunction0(Follow), Parent = Parent.asInstanceOf[js.Any], ScreenTip = ScreenTip.asInstanceOf[js.Any], ShowAndReturn = ShowAndReturn.asInstanceOf[js.Any], SubAddress = SubAddress.asInstanceOf[js.Any], TextToDisplay = TextToDisplay.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlink_typekey")(PowerPointDotHyperlink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  @scala.inline
  implicit class HyperlinkOps[Self <: Hyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToFavorites(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddToFavorites")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateNewDocument(value: (String, MsoTriState, MsoTriState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateNewDocument")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmailSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Follow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotHyperlink_typekey(value: Hyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Hyperlink_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScreenTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAndReturn(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowAndReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextToDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextToDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoHyperlinkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

