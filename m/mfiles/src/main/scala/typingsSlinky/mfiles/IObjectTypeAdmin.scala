package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTypeAdmin extends js.Object {
  var ColumnMappings: IObjectTypeColumnMappings = js.native
  var ConnectionString: String = js.native
  var DefaultForAutomaticPermissions: IAutomaticPermissions = js.native
  var DeleteStatement: String = js.native
  var InsertIntoStatement: String = js.native
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  var ObjectType: IObjectType = js.native
  var SelectExtIDStatement: String = js.native
  var SelectStatement: String = js.native
  var SelectStatementOneRecord: String = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var Translatable: Boolean = js.native
  var UpdateStatement: String = js.native
  def Clone(): IObjectTypeAdmin = js.native
}

object IObjectTypeAdmin {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeAdmin,
    ColumnMappings: IObjectTypeColumnMappings,
    ConnectionString: String,
    DefaultForAutomaticPermissions: IAutomaticPermissions,
    DeleteStatement: String,
    InsertIntoStatement: String,
    NamedValueNamespaces: INamedValueNamespaces,
    ObjectType: IObjectType,
    SelectExtIDStatement: String,
    SelectStatement: String,
    SelectStatementOneRecord: String,
    SemanticAliases: ISemanticAliases,
    Translatable: Boolean,
    UpdateStatement: String
  ): IObjectTypeAdmin = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ColumnMappings = ColumnMappings.asInstanceOf[js.Any], ConnectionString = ConnectionString.asInstanceOf[js.Any], DefaultForAutomaticPermissions = DefaultForAutomaticPermissions.asInstanceOf[js.Any], DeleteStatement = DeleteStatement.asInstanceOf[js.Any], InsertIntoStatement = InsertIntoStatement.asInstanceOf[js.Any], NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], SelectExtIDStatement = SelectExtIDStatement.asInstanceOf[js.Any], SelectStatement = SelectStatement.asInstanceOf[js.Any], SelectStatementOneRecord = SelectStatementOneRecord.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Translatable = Translatable.asInstanceOf[js.Any], UpdateStatement = UpdateStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeAdmin]
  }
  @scala.inline
  implicit class IObjectTypeAdminOps[Self <: IObjectTypeAdmin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjectTypeAdmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumnMappings(value: IObjectTypeColumnMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultForAutomaticPermissions(value: IAutomaticPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultForAutomaticPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertIntoStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertIntoStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedValueNamespaces(value: INamedValueNamespaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedValueNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: IObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectExtIDStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectExtIDStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectStatementOneRecord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectStatementOneRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Translatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateStatement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

