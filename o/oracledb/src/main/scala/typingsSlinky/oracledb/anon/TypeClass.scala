package typingsSlinky.oracledb.anon

import typingsSlinky.oracledb.mod.DBObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeClass extends js.Object {
  /** One of the DB_TYPE constants. */
  var `type`: Double = js.native
  /** Set if the value of type is a DBObject. */
  var typeClass: js.UndefOr[DBObjectClass] = js.native
  /** Type, such as 'VARCHAR2' or 'NUMBER'. */
  var typeName: String = js.native
}

object TypeClass {
  @scala.inline
  def apply(`type`: Double, typeName: String): TypeClass = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeClass]
  }
  @scala.inline
  implicit class TypeClassOps[Self <: TypeClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeClass(value: DBObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeClass")(js.undefined)
        ret
    }
  }
  
}

