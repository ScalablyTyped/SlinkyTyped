package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceCredentials extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When CopySourceArn is not null, the credential pair from the data source in the ARN is used as the credentials for the DataSourceCredentials structure.
    */
  var CopySourceArn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CopySourceArn] = js.native
  
  /**
    * Credential pair. For more information, see CredentialPair.
    */
  var CredentialPair: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CredentialPair] = js.native
}
object DataSourceCredentials {
  
  @scala.inline
  def apply(): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceCredentials]
  }
  
  @scala.inline
  implicit class DataSourceCredentialsMutableBuilder[Self <: DataSourceCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopySourceArn(value: CopySourceArn): Self = StObject.set(x, "CopySourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceArnUndefined: Self = StObject.set(x, "CopySourceArn", js.undefined)
    
    @scala.inline
    def setCredentialPair(value: CredentialPair): Self = StObject.set(x, "CredentialPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialPairUndefined: Self = StObject.set(x, "CredentialPair", js.undefined)
  }
}
