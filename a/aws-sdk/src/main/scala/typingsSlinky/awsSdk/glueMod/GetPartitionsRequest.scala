package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionsRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  /**
    * An expression that filters the partitions to be returned. The expression uses SQL syntax similar to the SQL WHERE filter clause. The SQL statement parser JSQLParser parses the expression.   Operators: The following are the operators that you can use in the Expression API call:  =  Checks whether the values of the two operands are equal; if yes, then the condition becomes true. Example: Assume 'variable a' holds 10 and 'variable b' holds 20.  (a = b) is not true.  &lt; &gt;  Checks whether the values of two operands are equal; if the values are not equal, then the condition becomes true. Example: (a &lt; &gt; b) is true.  &gt;  Checks whether the value of the left operand is greater than the value of the right operand; if yes, then the condition becomes true. Example: (a &gt; b) is not true.  &lt;  Checks whether the value of the left operand is less than the value of the right operand; if yes, then the condition becomes true. Example: (a &lt; b) is true.  &gt;=  Checks whether the value of the left operand is greater than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &gt;= b) is not true.  &lt;=  Checks whether the value of the left operand is less than or equal to the value of the right operand; if yes, then the condition becomes true. Example: (a &lt;= b) is true.  AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL  Logical operators.    Supported Partition Key Types: The following are the supported partition keys.    string     date     timestamp     int     bigint     long     tinyint     smallint     decimal    If an invalid type is encountered, an exception is thrown.  The following list shows the valid operators on each type. When you define a crawler, the partitionKey type is created as a STRING, to be compatible with the catalog partitions.   Sample API Call: 
    */
  var Expression: js.UndefOr[PredicateString] = js.native
  /**
    * The maximum number of partitions to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is not the first call to retrieve these partitions.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The segment of the table's partitions to scan in this request.
    */
  var Segment: js.UndefOr[typingsSlinky.awsSdk.glueMod.Segment] = js.native
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}

object GetPartitionsRequest {
  @scala.inline
  def apply(DatabaseName: NameString, TableName: NameString): GetPartitionsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionsRequest]
  }
  @scala.inline
  implicit class GetPartitionsRequestOps[Self <: GetPartitionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: PredicateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Segment")(js.undefined)
        ret
    }
  }
  
}

