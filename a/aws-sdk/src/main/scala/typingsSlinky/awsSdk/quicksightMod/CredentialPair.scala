package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialPair extends js.Object {
  
  /**
    * A set of alternate data source parameters that you want to share for these credentials. The credentials are applied in tandem with the data source parameters when you copy a data source by using a create or update request. The API compares the DataSourceParameters structure that's in the request with the structures in the AlternateDataSourceParameters allowlist. If the structures are an exact match, the request is allowed to use the new data source with the existing credentials. If the AlternateDataSourceParameters list is null, the DataSourceParameters originally used with these Credentials is automatically allowed.
    */
  var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.native
  
  /**
    * Password.
    */
  var Password: typingsSlinky.awsSdk.quicksightMod.Password = js.native
  
  /**
    * User name.
    */
  var Username: typingsSlinky.awsSdk.quicksightMod.Username = js.native
}
object CredentialPair {
  
  @scala.inline
  def apply(Password: Password, Username: Username): CredentialPair = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPair]
  }
  
  @scala.inline
  implicit class CredentialPairOps[Self <: CredentialPair] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateDataSourceParametersVarargs(value: DataSourceParameters*): Self = this.set("AlternateDataSourceParameters", js.Array(value :_*))
    
    @scala.inline
    def setAlternateDataSourceParameters(value: DataSourceParametersList): Self = this.set("AlternateDataSourceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateDataSourceParameters: Self = this.set("AlternateDataSourceParameters", js.undefined)
  }
}
