package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interest extends StObject {
  
  /** Metadata about the interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The interest; for example, `stargazing`. */
  var value: js.UndefOr[String] = js.native
}
object Interest {
  
  @scala.inline
  def apply(): Interest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interest]
  }
  
  @scala.inline
  implicit class InterestMutableBuilder[Self <: Interest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
