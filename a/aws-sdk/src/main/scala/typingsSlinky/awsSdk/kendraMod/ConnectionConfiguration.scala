package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfiguration extends js.Object {
  
  /**
    * The name of the host for the database. Can be either a string (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
    */
  var DatabaseHost: typingsSlinky.awsSdk.kendraMod.DatabaseHost = js.native
  
  /**
    * The name of the database containing the document data.
    */
  var DatabaseName: typingsSlinky.awsSdk.kendraMod.DatabaseName = js.native
  
  /**
    * The port that the database uses for connections.
    */
  var DatabasePort: typingsSlinky.awsSdk.kendraMod.DatabasePort = js.native
  
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Database Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typingsSlinky.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * The name of the table that contains the document data.
    */
  var TableName: typingsSlinky.awsSdk.kendraMod.TableName = js.native
}
object ConnectionConfiguration {
  
  @scala.inline
  def apply(
    DatabaseHost: DatabaseHost,
    DatabaseName: DatabaseName,
    DatabasePort: DatabasePort,
    SecretArn: SecretArn,
    TableName: TableName
  ): ConnectionConfiguration = {
    val __obj = js.Dynamic.literal(DatabaseHost = DatabaseHost.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], DatabasePort = DatabasePort.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfiguration]
  }
  
  @scala.inline
  implicit class ConnectionConfigurationOps[Self <: ConnectionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDatabaseHost(value: DatabaseHost): Self = this.set("DatabaseHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: DatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasePort(value: DatabasePort): Self = this.set("DatabasePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
}
