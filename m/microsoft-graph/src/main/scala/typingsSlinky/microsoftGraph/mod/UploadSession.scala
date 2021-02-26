package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadSession extends StObject {
  
  /**
    * The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration
    * time is reached.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format
    * 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file). When uploading files as Outlook attachments,
    * instead of a collection of ranges, this property always indicates a single value '{start}', the location in the file
    * where the next upload should begin.
    */
  var nextExpectedRanges: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The URL endpoint that accepts PUT requests for byte ranges of the file.
  var uploadUrl: js.UndefOr[NullableOption[String]] = js.native
}
object UploadSession {
  
  @scala.inline
  def apply(): UploadSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSession]
  }
  
  @scala.inline
  implicit class UploadSessionMutableBuilder[Self <: UploadSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setNextExpectedRanges(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "nextExpectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextExpectedRangesNull: Self = StObject.set(x, "nextExpectedRanges", null)
    
    @scala.inline
    def setNextExpectedRangesUndefined: Self = StObject.set(x, "nextExpectedRanges", js.undefined)
    
    @scala.inline
    def setNextExpectedRangesVarargs(value: String*): Self = StObject.set(x, "nextExpectedRanges", js.Array(value :_*))
    
    @scala.inline
    def setUploadUrl(value: NullableOption[String]): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
