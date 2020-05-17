package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val BlockLevel: OlAttachmentBlockLevel = js.native
  val Class: OlObjectClass = js.native
  var DisplayName: String = js.native
  val FileName: String = js.native
  val Index: Double = js.native
  val MAPIOBJECT: js.Any = js.native
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: Attachment = js.native
  val Parent: js.Any = js.native
  val PathName: String = js.native
  var Position: Double = js.native
  val PropertyAccessor: typingsSlinky.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  val Type: OlAttachmentType = js.native
  def Delete(): Unit = js.native
  def GetTemporaryFilePath(): String = js.native
  def SaveAsFile(Path: String): Unit = js.native
}

object Attachment {
  @scala.inline
  def apply(
    Application: Application,
    BlockLevel: OlAttachmentBlockLevel,
    Class: OlObjectClass,
    Delete: () => Unit,
    DisplayName: String,
    FileName: String,
    GetTemporaryFilePath: () => String,
    Index: Double,
    MAPIOBJECT: js.Any,
    OutlookDotAttachment_typekey: Attachment,
    Parent: js.Any,
    PathName: String,
    Position: Double,
    PropertyAccessor: PropertyAccessor,
    SaveAsFile: String => Unit,
    Session: NameSpace,
    Size: Double,
    Type: OlAttachmentType
  ): Attachment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BlockLevel = BlockLevel.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayName = DisplayName.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], GetTemporaryFilePath = js.Any.fromFunction0(GetTemporaryFilePath), Index = Index.asInstanceOf[js.Any], MAPIOBJECT = MAPIOBJECT.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathName = PathName.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], SaveAsFile = js.Any.fromFunction1(SaveAsFile), Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Attachment_typekey")(OutlookDotAttachment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
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
    def withBlockLevel(value: OlAttachmentBlockLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTemporaryFilePath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTemporaryFilePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAPIOBJECT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAPIOBJECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotAttachment_typekey(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Attachment_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyAccessor(value: PropertyAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveAsFile(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveAsFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OlAttachmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

