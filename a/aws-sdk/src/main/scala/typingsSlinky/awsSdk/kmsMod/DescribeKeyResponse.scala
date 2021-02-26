package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeKeyResponse extends StObject {
  
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typingsSlinky.awsSdk.kmsMod.KeyMetadata] = js.native
}
object DescribeKeyResponse {
  
  @scala.inline
  def apply(): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  
  @scala.inline
  implicit class DescribeKeyResponseMutableBuilder[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
