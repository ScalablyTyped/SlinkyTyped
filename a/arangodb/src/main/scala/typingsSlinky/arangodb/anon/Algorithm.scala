package typingsSlinky.arangodb.anon

import typingsSlinky.arangodb.ArangoDB.HashAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[HashAlgorithm] = js.native
  
  var secret: js.UndefOr[String] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
