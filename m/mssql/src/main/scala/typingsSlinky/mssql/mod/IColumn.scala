package typingsSlinky.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends ISqlType {
  var name: String = js.native
  var nullable: Boolean = js.native
  var primary: Boolean = js.native
}

object IColumn {
  @scala.inline
  def apply(name: String, nullable: Boolean, primary: Boolean, `type`: ISqlTypeFactory): IColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

