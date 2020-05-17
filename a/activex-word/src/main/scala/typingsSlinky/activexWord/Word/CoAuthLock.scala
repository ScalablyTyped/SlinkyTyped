package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoAuthLock extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val HeaderFooter: Boolean = js.native
  val Owner: CoAuthor = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Type: WdLockType = js.native
  @JSName("Word.CoAuthLock_typekey")
  var WordDotCoAuthLock_typekey: CoAuthLock = js.native
  def Unlock(): Unit = js.native
}

object CoAuthLock {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    HeaderFooter: Boolean,
    Owner: CoAuthor,
    Parent: js.Any,
    Range: Range,
    Type: WdLockType,
    Unlock: () => Unit,
    WordDotCoAuthLock_typekey: CoAuthLock
  ): CoAuthLock = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HeaderFooter = HeaderFooter.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlock = js.Any.fromFunction0(Unlock))
    __obj.updateDynamic("Word.CoAuthLock_typekey")(WordDotCoAuthLock_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthLock]
  }
  @scala.inline
  implicit class CoAuthLockOps[Self <: CoAuthLock] (val x: Self) extends AnyVal {
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
    def withHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: CoAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdLockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unlock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotCoAuthLock_typekey(value: CoAuthLock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CoAuthLock_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

