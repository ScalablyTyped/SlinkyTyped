package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLibraryVersion extends js.Object {
  val Application: js.Any = js.native
  val Comments: String = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Modified: VarDate = js.native
  val ModifiedBy: String = js.native
  @JSName("Office.DocumentLibraryVersion_typekey")
  var OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
  def Open(): js.Any = js.native
  def Restore(): js.Any = js.native
}

object DocumentLibraryVersion {
  @scala.inline
  def apply(
    Application: js.Any,
    Comments: String,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Modified: VarDate,
    ModifiedBy: String,
    OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion,
    Open: () => js.Any,
    Parent: js.Any,
    Restore: () => js.Any
  ): DocumentLibraryVersion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore))
    __obj.updateDynamic("Office.DocumentLibraryVersion_typekey")(OfficeDotDocumentLibraryVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLibraryVersion]
  }
  @scala.inline
  implicit class DocumentLibraryVersionOps[Self <: DocumentLibraryVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotDocumentLibraryVersion_typekey(value: DocumentLibraryVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.DocumentLibraryVersion_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestore(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restore")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

