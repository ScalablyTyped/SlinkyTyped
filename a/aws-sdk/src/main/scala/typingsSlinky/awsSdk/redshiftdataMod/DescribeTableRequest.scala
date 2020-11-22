package typingsSlinky.awsSdk.redshiftdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableRequest extends js.Object {
  
  /**
    * The cluster identifier. This parameter is required when authenticating using either AWS Secrets Manager or temporary credentials. 
    */
  var ClusterIdentifier: Location = js.native
  
  /**
    * The name of the database. This parameter is required when authenticating using temporary credentials.
    */
  var Database: js.UndefOr[String] = js.native
  
  /**
    * The database user name. This parameter is required when authenticating using temporary credentials. 
    */
  var DbUser: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of tables to return in the response. If more tables exist than fit in one response, then NextToken is returned to page through the results. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned NextToken value in the next NextToken parameter and retrying the command. If the NextToken field is empty, all response records have been retrieved for the request. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The schema that contains the table. If no schema is specified, then matching tables for all schemas are returned. 
    */
  var Schema: js.UndefOr[String] = js.native
  
  /**
    * The name or ARN of the secret that enables access to the database. This parameter is required when authenticating using AWS Secrets Manager. 
    */
  var SecretArn: js.UndefOr[typingsSlinky.awsSdk.redshiftdataMod.SecretArn] = js.native
  
  /**
    * The table name. If no table is specified, then all tables for all matching schemas are returned. If no table and no schema is specified, then all tables for all schemas in the database are returned
    */
  var Table: js.UndefOr[String] = js.native
}
object DescribeTableRequest {
  
  @scala.inline
  def apply(ClusterIdentifier: Location): DescribeTableRequest = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableRequest]
  }
  
  @scala.inline
  implicit class DescribeTableRequestOps[Self <: DescribeTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterIdentifier(value: Location): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("Database", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("SecretArn", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
  }
}
