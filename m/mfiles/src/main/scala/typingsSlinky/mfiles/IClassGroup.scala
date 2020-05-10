package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClassGroup extends js.Object {
  var ID: Double = js.native
  var Members: IIDs = js.native
  var Name: String = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  def AddMember(Member: Double): Unit = js.native
  def Clone(): IClassGroup = js.native
  def RemoveMember(Member: Double): Unit = js.native
}

object IClassGroup {
  @scala.inline
  def apply(
    AddMember: Double => Unit,
    Clone: () => IClassGroup,
    ID: Double,
    Members: IIDs,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    RemoveMember: Double => Unit
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(AddMember = js.Any.fromFunction1(AddMember), Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], RemoveMember = js.Any.fromFunction1(RemoveMember))
    __obj.asInstanceOf[IClassGroup]
  }
  @scala.inline
  implicit class IClassGroupOps[Self <: IClassGroup] (val x: Self) extends AnyVal {
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
    def withClone(value: () => IClassGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
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
    def withObjectType(value: MFBuiltInObjectType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
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

