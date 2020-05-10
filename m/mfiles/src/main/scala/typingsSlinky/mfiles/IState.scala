package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IState extends js.Object {
  val ID: Double = js.native
  var Name: String = js.native
  var Selectable: Boolean = js.native
  var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
  def GetAsLookup(): ILookup = js.native
  def GetAsTypedValue(): ITypedValue = js.native
}

object IState {
  @scala.inline
  def apply(
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    Selectable: Boolean,
    SelectableFlagAffectedByPseudoUsers: Boolean
  ): IState = {
    val __obj = js.Dynamic.literal(GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], SelectableFlagAffectedByPseudoUsers = SelectableFlagAffectedByPseudoUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAsLookup(value: () => ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsLookup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAsTypedValue(value: () => ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsTypedValue")(js.Any.fromFunction0(value))
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
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectableFlagAffectedByPseudoUsers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectableFlagAffectedByPseudoUsers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

