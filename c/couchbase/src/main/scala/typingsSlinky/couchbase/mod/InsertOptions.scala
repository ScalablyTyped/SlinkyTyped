package typingsSlinky.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOptions extends StObject {
  
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.native
  
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  
  /**
    *     Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}
object InsertOptions {
  
  @scala.inline
  def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  
  @scala.inline
  implicit class InsertOptionsMutableBuilder[Self <: InsertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setPersist_to(value: Double): Self = StObject.set(x, "persist_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersist_toUndefined: Self = StObject.set(x, "persist_to", js.undefined)
    
    @scala.inline
    def setReplicate_to(value: Double): Self = StObject.set(x, "replicate_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicate_toUndefined: Self = StObject.set(x, "replicate_to", js.undefined)
  }
}
