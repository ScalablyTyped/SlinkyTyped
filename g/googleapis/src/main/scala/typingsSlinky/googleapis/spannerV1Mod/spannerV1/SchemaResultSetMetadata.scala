package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a ResultSet or PartialResultSet.
  */
@js.native
trait SchemaResultSetMetadata extends js.Object {
  /**
    * Indicates the field names and types for the rows in the result set.  For
    * example, a SQL query like `&quot;SELECT UserId, UserName FROM
    * Users&quot;` could return a `row_type` value like: &quot;fields&quot;: [
    * { &quot;name&quot;: &quot;UserId&quot;, &quot;type&quot;: {
    * &quot;code&quot;: &quot;INT64&quot; } },       { &quot;name&quot;:
    * &quot;UserName&quot;, &quot;type&quot;: { &quot;code&quot;:
    * &quot;STRING&quot; } },     ]
    */
  var rowType: js.UndefOr[SchemaStructType] = js.native
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.native
}

object SchemaResultSetMetadata {
  @scala.inline
  def apply(): SchemaResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetMetadata]
  }
  @scala.inline
  implicit class SchemaResultSetMetadataOps[Self <: SchemaResultSetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowType(value: SchemaStructType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: SchemaTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

