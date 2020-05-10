package typingsSlinky.awsSdkClientDynamodbNode.typesListTablesOutputMod

import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTablesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The name of the last table in the current page of results. Use this value as the <code>ExclusiveStartTableName</code> in a new request to obtain the next page of results, until all the table names are returned.</p> <p>If you do not receive a <code>LastEvaluatedTableName</code> value in the response, this means that there are no more table names to be retrieved.</p>
    */
  var LastEvaluatedTableName: js.UndefOr[String] = js.native
  /**
    * <p>The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100.</p> <p>If <code>LastEvaluatedTableName</code> also appears in the output, you can use this value as the <code>ExclusiveStartTableName</code> parameter in a subsequent <code>ListTables</code> request and obtain the next page of results.</p>
    */
  var TableNames: js.UndefOr[js.Array[String]] = js.native
}

object ListTablesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTablesOutput]
  }
  @scala.inline
  implicit class ListTablesOutputOps[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
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
    def withLastEvaluatedTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNames")(js.undefined)
        ret
    }
  }
  
}

