package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementResponse extends js.Object {
  /**
    * Metadata for the columns included in the results.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.native
  /**
    * Values for fields generated during the request.  &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; 
    */
  var generatedFields: js.UndefOr[FieldList] = js.native
  /**
    * The number of records updated by the request.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.native
  /**
    * The records returned by the SQL statement.
    */
  var records: js.UndefOr[SqlRecords] = js.native
}

object ExecuteStatementResponse {
  @scala.inline
  def apply(): ExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResponse]
  }
  @scala.inline
  implicit class ExecuteStatementResponseOps[Self <: ExecuteStatementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratedFields(value: FieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfRecordsUpdated(value: RecordsUpdated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecordsUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfRecordsUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecordsUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: SqlRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.undefined)
        ret
    }
  }
  
}

