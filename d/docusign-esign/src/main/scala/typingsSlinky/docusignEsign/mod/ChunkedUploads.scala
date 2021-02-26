package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkedUploads extends StObject {
  
  /**
    * A 64-byte, Secure Hash Algorithm 256 (SHA256) checksum that the caller computes across the entirety of the original content that has been uploaded to the chunked upload.
    * DocuSign compares this value to its own computation. If the two values are not equal,
    * the original content and received content are not the same and the commit action is refused.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The id of the chunked upload.
    */
  var chunkedUploadId: js.UndefOr[String] = js.native
  
  /**
    * A list of the parts that compose the chunked upload, including their byte sizes. The list must be contiguous before you can commit the chunked upload.
    */
  var chunkedUploadParts: js.UndefOr[
    js.Array[
      /* An object that contains information about the chunked upload part. */ ChunkedUploadPart
    ]
  ] = js.native
  
  /**
    * The URI that you use to reference the chunked upload in other API requests, such as envelope document and envelope attachment requests.
    */
  var chunkedUploadUri: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the chunked upload has been committed. A committed chunked upload can no longer receive any additional parts and is ready
    * for use within other API requests.
    */
  var committed: js.UndefOr[String] = js.native
  
  /**
    * The UTC time at which the chunked upload expires and is no longer addressable.
    *
    * **Note**: The length of time before expiration is configurable, and begins when you initiate the chunked upload. You must fully upload and use a
    * chunked upload within this time. The default value for this duration is 20 minutes.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of parts allowed for a chunked upload. This value is configurable per DocuSign environment, account, or integrator.
    * The default value is 128. The maximum possible value is 256.
    *
    */
  var maxChunkedUploadParts: js.UndefOr[String] = js.native
  
  /**
    * The maximum total size allowed for a chunked upload. This value is configured per DocuSign environment, account, or integrator. The default value is 50 MB.
    */
  var maxTotalSize: js.UndefOr[String] = js.native
  
  /**
    * The total size of the parts of the chunked upload.
    *
    * **Note**: When a chunked upload is used as an envelope document, it is subject to the PDF size limit (25 MB) and page count limit that apply to all envelope documents.
    */
  var totalSize: js.UndefOr[String] = js.native
}
object ChunkedUploads {
  
  @scala.inline
  def apply(): ChunkedUploads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploads]
  }
  
  @scala.inline
  implicit class ChunkedUploadsMutableBuilder[Self <: ChunkedUploads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setChunkedUploadId(value: String): Self = StObject.set(x, "chunkedUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkedUploadIdUndefined: Self = StObject.set(x, "chunkedUploadId", js.undefined)
    
    @scala.inline
    def setChunkedUploadParts(
      value: js.Array[
          /* An object that contains information about the chunked upload part. */ ChunkedUploadPart
        ]
    ): Self = StObject.set(x, "chunkedUploadParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkedUploadPartsUndefined: Self = StObject.set(x, "chunkedUploadParts", js.undefined)
    
    @scala.inline
    def setChunkedUploadPartsVarargs(
      value: (/* An object that contains information about the chunked upload part. */ ChunkedUploadPart)*
    ): Self = StObject.set(x, "chunkedUploadParts", js.Array(value :_*))
    
    @scala.inline
    def setChunkedUploadUri(value: String): Self = StObject.set(x, "chunkedUploadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkedUploadUriUndefined: Self = StObject.set(x, "chunkedUploadUri", js.undefined)
    
    @scala.inline
    def setCommitted(value: String): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommittedUndefined: Self = StObject.set(x, "committed", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setMaxChunkedUploadParts(value: String): Self = StObject.set(x, "maxChunkedUploadParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChunkedUploadPartsUndefined: Self = StObject.set(x, "maxChunkedUploadParts", js.undefined)
    
    @scala.inline
    def setMaxTotalSize(value: String): Self = StObject.set(x, "maxTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalSizeUndefined: Self = StObject.set(x, "maxTotalSize", js.undefined)
    
    @scala.inline
    def setTotalSize(value: String): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
