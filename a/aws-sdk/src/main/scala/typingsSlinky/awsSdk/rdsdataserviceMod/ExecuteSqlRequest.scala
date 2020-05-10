package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSqlRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
    */
  var awsSecretStoreArn: Arn = js.native
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * The ARN of the Aurora Serverless DB cluster.
    */
  var dbClusterOrInstanceArn: Arn = js.native
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.native
  /**
    * One or more SQL statements to run on the DB cluster. You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted, including data definition, data manipulation, and commit statements. 
    */
  var sqlStatements: SqlStatement = js.native
}

object ExecuteSqlRequest {
  @scala.inline
  def apply(awsSecretStoreArn: Arn, dbClusterOrInstanceArn: Arn, sqlStatements: SqlStatement): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal(awsSecretStoreArn = awsSecretStoreArn.asInstanceOf[js.Any], dbClusterOrInstanceArn = dbClusterOrInstanceArn.asInstanceOf[js.Any], sqlStatements = sqlStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
  @scala.inline
  implicit class ExecuteSqlRequestOps[Self <: ExecuteSqlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsSecretStoreArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSecretStoreArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbClusterOrInstanceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterOrInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlStatements(value: SqlStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabase(value: DbName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: DbName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

