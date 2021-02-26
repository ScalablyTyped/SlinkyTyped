package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionInTransit extends StObject {
  
  /**
    * 
    Indicates the encryption setting for data in transit between clients and brokers. The following are the possible values.
    
    TLS means that client-broker communication is enabled with TLS only.
    
    TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext data.
    
    PLAINTEXT means that client-broker communication is enabled in plaintext only.
    The default value is TLS_PLAINTEXT.
    
    */
  var ClientBroker: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClientBroker] = js.native
  
  /**
    * 
    When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When set to false, the communication happens in plaintext.
    The default value is true.
    
    */
  var InCluster: js.UndefOr[boolean] = js.native
}
object EncryptionInTransit {
  
  @scala.inline
  def apply(): EncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInTransit]
  }
  
  @scala.inline
  implicit class EncryptionInTransitMutableBuilder[Self <: EncryptionInTransit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientBroker(value: ClientBroker): Self = StObject.set(x, "ClientBroker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBrokerUndefined: Self = StObject.set(x, "ClientBroker", js.undefined)
    
    @scala.inline
    def setInCluster(value: boolean): Self = StObject.set(x, "InCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInClusterUndefined: Self = StObject.set(x, "InCluster", js.undefined)
  }
}
