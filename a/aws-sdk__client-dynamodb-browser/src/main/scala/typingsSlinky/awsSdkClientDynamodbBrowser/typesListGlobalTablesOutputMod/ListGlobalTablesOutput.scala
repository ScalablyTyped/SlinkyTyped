package typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesOutputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableMod.UnmarshalledGlobalTable
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>List of global table names.</p>
    */
  var GlobalTables: js.UndefOr[js.Array[UnmarshalledGlobalTable]] = js.native
  /**
    * <p>Last evaluated global table name.</p>
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.native
}

object ListGlobalTablesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  @scala.inline
  implicit class ListGlobalTablesOutputOps[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalTables(value: js.Array[UnmarshalledGlobalTable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTables")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEvaluatedGlobalTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedGlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedGlobalTableName")(js.undefined)
        ret
    }
  }
  
}

