package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlListComponentContainer extends js.Object {
  val Count: Double = js.native
  def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent = js.native
  def GetKeys(): IAccessControlListComponentKeys = js.native
  def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): Boolean = js.native
}

object IAccessControlListComponentContainer {
  @scala.inline
  def apply(
    At: IAccessControlListComponentKey => IAccessControlListComponent,
    Count: Double,
    GetKeys: () => IAccessControlListComponentKeys,
    HasKey: IAccessControlListComponentKey => Boolean
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal(At = js.Any.fromFunction1(At), Count = Count.asInstanceOf[js.Any], GetKeys = js.Any.fromFunction0(GetKeys), HasKey = js.Any.fromFunction1(HasKey))
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
  @scala.inline
  implicit class IAccessControlListComponentContainerOps[Self <: IAccessControlListComponentContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: IAccessControlListComponentKey => IAccessControlListComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("At")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKeys(value: () => IAccessControlListComponentKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasKey(value: IAccessControlListComponentKey => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

