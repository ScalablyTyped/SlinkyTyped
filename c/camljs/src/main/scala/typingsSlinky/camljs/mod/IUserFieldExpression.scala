package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserFieldExpression extends js.Object {
  /** DEPRECATED. Please use IsIn* methods instead. This property will be removed in next release(!!) */
  var Membership: IMembership = js.native
  /** Checks whether the value of the User field is equal to id of the current user */
  def EqualToCurrentUser(): IExpression = js.native
  /** Specifies that id of the user will be used for further comparisons. */
  def Id(): INumberFieldExpression = js.native
  /** Checks whether the group specified by the value of the field includes the current user. */
  def IsInCurrentUserGroups(): IExpression = js.native
  /** Checks whether the user specified by the value of the field is member of the specified SharePoint Group. */
  def IsInSPGroup(groupId: Double): IExpression = js.native
  /** Checks whether the user specified by the value of the field is in current SPWeb users. */
  def IsInSPWebAllUsers(): IExpression = js.native
  /** Checks whether the user specified by the value of the field is member of current SPWeb groups. */
  def IsInSPWebGroups(): IExpression = js.native
  /** Checks whether the user specified by the value of the field has received the rights to the site directly (not through a group). */
  def IsInSPWebUsers(): IExpression = js.native
  /** Specifies that lookup target field value will be used for further comparisons. */
  def ValueAsText(): ITextFieldExpression = js.native
}

object IUserFieldExpression {
  @scala.inline
  def apply(
    EqualToCurrentUser: () => IExpression,
    Id: () => INumberFieldExpression,
    IsInCurrentUserGroups: () => IExpression,
    IsInSPGroup: Double => IExpression,
    IsInSPWebAllUsers: () => IExpression,
    IsInSPWebGroups: () => IExpression,
    IsInSPWebUsers: () => IExpression,
    Membership: IMembership,
    ValueAsText: () => ITextFieldExpression
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal(EqualToCurrentUser = js.Any.fromFunction0(EqualToCurrentUser), Id = js.Any.fromFunction0(Id), IsInCurrentUserGroups = js.Any.fromFunction0(IsInCurrentUserGroups), IsInSPGroup = js.Any.fromFunction1(IsInSPGroup), IsInSPWebAllUsers = js.Any.fromFunction0(IsInSPWebAllUsers), IsInSPWebGroups = js.Any.fromFunction0(IsInSPWebGroups), IsInSPWebUsers = js.Any.fromFunction0(IsInSPWebUsers), Membership = Membership.asInstanceOf[js.Any], ValueAsText = js.Any.fromFunction0(ValueAsText))
    __obj.asInstanceOf[IUserFieldExpression]
  }
  @scala.inline
  implicit class IUserFieldExpressionOps[Self <: IUserFieldExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualToCurrentUser(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualToCurrentUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: () => INumberFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInCurrentUserGroups(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInCurrentUserGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInSPGroup(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInSPGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsInSPWebAllUsers(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInSPWebAllUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInSPWebGroups(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInSPWebGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInSPWebUsers(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInSPWebUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMembership(value: IMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Membership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAsText(value: () => ITextFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueAsText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

