package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateScramSecretResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  
  /**
    * 
    List of errors when disassociating secrets to cluster.
    
    */
  var UnprocessedScramSecrets: js.UndefOr[listOfUnprocessedScramSecret] = js.native
}
object BatchDisassociateScramSecretResponse {
  
  @scala.inline
  def apply(): BatchDisassociateScramSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateScramSecretResponse]
  }
  
  @scala.inline
  implicit class BatchDisassociateScramSecretResponseMutableBuilder[Self <: BatchDisassociateScramSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setUnprocessedScramSecrets(value: listOfUnprocessedScramSecret): Self = StObject.set(x, "UnprocessedScramSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedScramSecretsUndefined: Self = StObject.set(x, "UnprocessedScramSecrets", js.undefined)
    
    @scala.inline
    def setUnprocessedScramSecretsVarargs(value: UnprocessedScramSecret*): Self = StObject.set(x, "UnprocessedScramSecrets", js.Array(value :_*))
  }
}
