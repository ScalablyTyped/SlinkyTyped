package typingsSlinky.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSqlFunction extends _OSqlExpression {
  var abs: AbsSqlFunction = js.native
  var avg: AbsSqlFunction = js.native
  var db: ODB = js.native
  var sequence: SequenceSqlFunction = js.native
}

object OSqlFunction {
  @scala.inline
  def apply(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSqlFunction]
  }
  @scala.inline
  implicit class OSqlFunctionOps[Self <: OSqlFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: AbsSqlFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvg(value: AbsSqlFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: ODB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: SequenceSqlFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

