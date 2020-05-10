package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: Boolean = js.native
  val IsBasedOnObjectACL: Boolean = js.native
  val IsDefault: Boolean = js.native
  val NamedACL: INamedACL = js.native
  def Clone(): IAutomaticPermissions = js.native
  def SetBasedOnObjectACL(): Unit = js.native
  def SetNamedACL(NamedACL: INamedACL): Unit = js.native
}

object IAutomaticPermissions {
  @scala.inline
  def apply(
    CanDeactivate: Boolean,
    Clone: () => IAutomaticPermissions,
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: () => Unit,
    SetNamedACL: INamedACL => Unit
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SetBasedOnObjectACL = js.Any.fromFunction0(SetBasedOnObjectACL), SetNamedACL = js.Any.fromFunction1(SetNamedACL))
    __obj.asInstanceOf[IAutomaticPermissions]
  }
  @scala.inline
  implicit class IAutomaticPermissionsOps[Self <: IAutomaticPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDeactivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanDeactivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAutomaticPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBasedOnObjectACL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBasedOnObjectACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedACL(value: INamedACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBasedOnObjectACL(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetBasedOnObjectACL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetNamedACL(value: INamedACL => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetNamedACL")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

