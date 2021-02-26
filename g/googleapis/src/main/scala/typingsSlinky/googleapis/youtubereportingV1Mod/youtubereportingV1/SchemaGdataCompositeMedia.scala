package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataCompositeMedia extends StObject {
  
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.native
  
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.native
  
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.native
}
object SchemaGdataCompositeMedia {
  
  @scala.inline
  def apply(): SchemaGdataCompositeMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataCompositeMedia]
  }
  
  @scala.inline
  implicit class SchemaGdataCompositeMediaMutableBuilder[Self <: SchemaGdataCompositeMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobRef(value: String): Self = StObject.set(x, "blobRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobRefUndefined: Self = StObject.set(x, "blobRef", js.undefined)
    
    @scala.inline
    def setBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = StObject.set(x, "blobstore2Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobstore2InfoUndefined: Self = StObject.set(x, "blobstore2Info", js.undefined)
    
    @scala.inline
    def setCosmoBinaryReference(value: String): Self = StObject.set(x, "cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosmoBinaryReferenceUndefined: Self = StObject.set(x, "cosmoBinaryReference", js.undefined)
    
    @scala.inline
    def setCrc32cHash(value: Double): Self = StObject.set(x, "crc32cHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc32cHashUndefined: Self = StObject.set(x, "crc32cHash", js.undefined)
    
    @scala.inline
    def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    @scala.inline
    def setObjectId(value: SchemaGdataObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    @scala.inline
    def setSha1Hash(value: String): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
  }
}
