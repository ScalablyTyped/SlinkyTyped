package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSESpecification extends StObject {
  
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
    */
  var Enabled: SSEEnabled = js.native
}
object SSESpecification {
  
  @scala.inline
  def apply(Enabled: SSEEnabled): SSESpecification = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
  
  @scala.inline
  implicit class SSESpecificationMutableBuilder[Self <: SSESpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
