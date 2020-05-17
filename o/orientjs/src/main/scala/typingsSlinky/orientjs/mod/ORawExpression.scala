package typingsSlinky.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ORawExpression extends OSqlExpression {
  var db: ODB = js.native
  var value: String = js.native
  def as(alias: String): ORawExpression = js.native
}

object ORawExpression {
  @scala.inline
  def apply(as: String => ORawExpression, db: ODB, value: String): ORawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ORawExpression]
  }
  @scala.inline
  implicit class ORawExpressionOps[Self <: ORawExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: String => ORawExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDb(value: ODB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

