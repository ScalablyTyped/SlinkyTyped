package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinition[Name /* <: String */, Type] extends Named[Name] {
  var dataType: String = js.native
  var defaultValue: js.UndefOr[Type] = js.native
  var jsType: js.UndefOr[Type] = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var primaryKey: js.UndefOr[Boolean] = js.native
  var references: js.UndefOr[typingsSlinky.nodeSql2.anon.Column] = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object ColumnDefinition {
  @scala.inline
  def apply[Name, Type](dataType: String): ColumnDefinition[Name, Type] = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition[Name, Type]]
  }
  @scala.inline
  implicit class ColumnDefinitionOps[Self[name, `type`] <: ColumnDefinition[name, `type`], Name, Type] (val x: Self[Name, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Name, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Name, Type]) with Other]
    @scala.inline
    def withDataType(value: String): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: Type): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withJsType(value: Type): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsType: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsType")(js.undefined)
        ret
    }
    @scala.inline
    def withNotNull(value: Boolean): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotNull: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: Boolean): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: typingsSlinky.nodeSql2.anon.Column): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self[Name, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

