package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoAuthor extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val EmailAddress: String = js.native
  val ID: String = js.native
  val IsMe: Boolean = js.native
  val Locks: CoAuthLocks = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CoAuthor_typekey")
  var WordDotCoAuthor_typekey: CoAuthor = js.native
}

object CoAuthor {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EmailAddress: String,
    ID: String,
    IsMe: Boolean,
    Locks: CoAuthLocks,
    Name: String,
    Parent: js.Any,
    WordDotCoAuthor_typekey: CoAuthor
  ): CoAuthor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsMe = IsMe.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthor_typekey")(WordDotCoAuthor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthor]
  }
  @scala.inline
  implicit class CoAuthorOps[Self <: CoAuthor] (val x: Self) extends AnyVal {
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
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocks(value: CoAuthLocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locks")(value.asInstanceOf[js.Any])
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
    def withWordDotCoAuthor_typekey(value: CoAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CoAuthor_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

