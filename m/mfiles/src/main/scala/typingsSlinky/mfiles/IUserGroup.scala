package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserGroup extends js.Object {
  var ID: Double = js.native
  var Members: IIDs = js.native
  var Name: String = js.native
  val Predefined: Boolean = js.native
  def AddMember(ID: Double): Unit = js.native
  def Clone(): IUserGroup = js.native
  def CloneFrom(UserGroup: IUserGroup): Unit = js.native
  def RemoveMember(ID: Double): Unit = js.native
}

object IUserGroup {
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IUserGroup,
    CloneFrom: IUserGroup => Unit,
    ID: Double,
    Members: IIDs,
    Name: String,
    Predefined: Boolean,
    RemoveMember: Double => Unit
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IUserGroup]
  }
  @scala.inline
  implicit class IUserGroupOps[Self <: IUserGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMember(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IUserGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IUserGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: IIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMember(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveMember")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

