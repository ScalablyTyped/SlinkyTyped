package typingsSlinky.libpq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultError extends js.Object {
  var constraintName: js.UndefOr[String] = js.native
  var context: js.UndefOr[String] = js.native
  var dataTypeName: js.UndefOr[String] = js.native
  var internalPosition: js.UndefOr[String] = js.native
  var internalQuery: js.UndefOr[String] = js.native
  var messageDetail: js.UndefOr[String] = js.native
  var messageHint: js.UndefOr[String] = js.native
  var messagePrimary: String = js.native
  var schemaName: js.UndefOr[String] = js.native
  var severity: String = js.native
  var sourceFile: String = js.native
  var sourceFunction: String = js.native
  var sourceLine: String = js.native
  var sqlState: String = js.native
  var statementPosition: js.UndefOr[String] = js.native
  var tableName: js.UndefOr[String] = js.native
}

object ResultError {
  @scala.inline
  def apply(
    messagePrimary: String,
    severity: String,
    sourceFile: String,
    sourceFunction: String,
    sourceLine: String,
    sqlState: String
  ): ResultError = {
    val __obj = js.Dynamic.literal(messagePrimary = messagePrimary.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceFunction = sourceFunction.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any], sqlState = sqlState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultError]
  }
  @scala.inline
  implicit class ResultErrorOps[Self <: ResultError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessagePrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagePrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintName")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageHint")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatementPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatementPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

