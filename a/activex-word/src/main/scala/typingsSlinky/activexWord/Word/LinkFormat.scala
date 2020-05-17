package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFormat extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoUpdate: Boolean = js.native
  val Creator: Double = js.native
  var Locked: Boolean = js.native
  val Parent: js.Any = js.native
  var SavePictureWithDocument: Boolean = js.native
  var SourceFullName: String = js.native
  val SourceName: String = js.native
  val SourcePath: String = js.native
  val Type: WdLinkType = js.native
  @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat = js.native
  def BreakLink(): Unit = js.native
  def Update(): Unit = js.native
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    BreakLink: () => Unit,
    Creator: Double,
    Locked: Boolean,
    Parent: js.Any,
    SavePictureWithDocument: Boolean,
    SourceFullName: String,
    SourceName: String,
    SourcePath: String,
    Type: WdLinkType,
    Update: () => Unit,
    WordDotLinkFormat_typekey: LinkFormat
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SavePictureWithDocument = SavePictureWithDocument.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.LinkFormat_typekey")(WordDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  @scala.inline
  implicit class LinkFormatOps[Self <: LinkFormat] (val x: Self) extends AnyVal {
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
    def withAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavePictureWithDocument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavePictureWithDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdLinkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotLinkFormat_typekey(value: LinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.LinkFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

