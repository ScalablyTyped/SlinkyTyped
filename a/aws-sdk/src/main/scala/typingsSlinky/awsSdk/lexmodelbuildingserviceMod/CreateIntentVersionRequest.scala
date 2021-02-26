package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntentVersionRequest extends StObject {
  
  /**
    * Checksum of the $LATEST version of the intent that should be used to create the new version. If you specify a checksum and the $LATEST version of the intent has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The name of the intent that you want to create a new version of. The name is case sensitive. 
    */
  var name: IntentName = js.native
}
object CreateIntentVersionRequest {
  
  @scala.inline
  def apply(name: IntentName): CreateIntentVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntentVersionRequest]
  }
  
  @scala.inline
  implicit class CreateIntentVersionRequestMutableBuilder[Self <: CreateIntentVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
