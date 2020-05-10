package typingsSlinky.dbMigratePg.mod

import typingsSlinky.dbMigrateBase.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConstraint extends js.Object {
  var constraints: String = js.native
  def foreignKey(callback: CallbackFunction): Unit = js.native
}

object ColumnConstraint {
  @scala.inline
  def apply(constraints: String, foreignKey: CallbackFunction => Unit): ColumnConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], foreignKey = js.Any.fromFunction1(foreignKey))
    __obj.asInstanceOf[ColumnConstraint]
  }
  @scala.inline
  implicit class ColumnConstraintOps[Self <: ColumnConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeignKey(value: CallbackFunction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

