package typingsSlinky.activexWord.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Comment: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  val SavedBy: String = js.native
  @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: Version = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
  def OpenOld(): Unit = js.native
}

object Version {
  @scala.inline
  def apply(
    Application: Application,
    Comment: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Index: Double,
    Open: () => Document,
    OpenOld: () => Unit,
    Parent: js.Any,
    SavedBy: String,
    WordDotVersion_typekey: Version
  ): Version = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), OpenOld = js.Any.fromFunction0(OpenOld), Parent = Parent.asInstanceOf[js.Any], SavedBy = SavedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Version_typekey")(WordDotVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
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
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
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
    def withOpen(value: () => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenOld(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenOld")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotVersion_typekey(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Version_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

