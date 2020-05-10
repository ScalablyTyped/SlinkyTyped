package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of connection.getStatementInfo().
  */
@js.native
trait StatementInfo extends js.Object {
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[String]] = js.native
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata]] = js.native
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[Double] = js.native
}

object StatementInfo {
  @scala.inline
  def apply(): StatementInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementInfo]
  }
  @scala.inline
  implicit class StatementInfoOps[Self <: StatementInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaData(value: js.Array[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementType")(js.undefined)
        ret
    }
  }
  
}

