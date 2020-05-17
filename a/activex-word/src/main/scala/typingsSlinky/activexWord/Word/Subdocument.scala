package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subdocument extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val HasFile: Boolean = js.native
  val Level: Double = js.native
  var Locked: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  @JSName("Word.Subdocument_typekey")
  var WordDotSubdocument_typekey: Subdocument = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
  def Split(Range: typingsSlinky.activexWord.Word.Range): Unit = js.native
}

object Subdocument {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HasFile: Boolean,
    Level: Double,
    Locked: Boolean,
    Name: String,
    Open: () => Document,
    Parent: js.Any,
    Path: String,
    Range: Range,
    Split: Range => Unit,
    WordDotSubdocument_typekey: Subdocument
  ): Subdocument = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasFile = HasFile.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Split = js.Any.fromFunction1(Split))
    __obj.updateDynamic("Word.Subdocument_typekey")(WordDotSubdocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdocument]
  }
  @scala.inline
  implicit class SubdocumentOps[Self <: Subdocument] (val x: Self) extends AnyVal {
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
    def withHasFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => Document): Self = {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: Range => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Split")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWordDotSubdocument_typekey(value: Subdocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Subdocument_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

