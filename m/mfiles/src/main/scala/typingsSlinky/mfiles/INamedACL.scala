package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedACL extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  val GUID: String = js.native
  var ID: Double = js.native
  var Name: String = js.native
  val NamedACLType: MFNamedACLType = js.native
  def Clone(): INamedACL = js.native
}

object INamedACL {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => INamedACL,
    GUID: String,
    ID: Double,
    Name: String,
    NamedACLType: MFNamedACLType
  ): INamedACL = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLType = NamedACLType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACL]
  }
  @scala.inline
  implicit class INamedACLOps[Self <: INamedACL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedACLType(value: MFNamedACLType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACLType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

