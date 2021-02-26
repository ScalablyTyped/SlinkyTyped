package typingsSlinky.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseStorage.srcReferenceMod.Reference
import typingsSlinky.firebaseStorageTypes.mod.FullMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMetadataMod {
  
  /**
    * @fileoverview Documentation for the metadata format.
    */
  /**
    * The full set of object metadata, including read-only properties.
    */
  @js.native
  trait Metadata
    extends FullMetadata
       with /* prop */ StringDictionary[js.Any] {
    
    @JSName("cacheControl")
    var cacheControl_Metadata: js.UndefOr[String] = js.native
    
    @JSName("contentDisposition")
    var contentDisposition_Metadata: js.UndefOr[String] = js.native
    
    @JSName("contentEncoding")
    var contentEncoding_Metadata: js.UndefOr[String] = js.native
    
    @JSName("contentLanguage")
    var contentLanguage_Metadata: js.UndefOr[String] = js.native
    
    @JSName("contentType")
    var contentType_Metadata: js.UndefOr[String] = js.native
    
    @JSName("customMetadata")
    var customMetadata_Metadata: js.UndefOr[StringDictionary[String]] = js.native
    
    var downloadTokens: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("md5Hash")
    var md5Hash_Metadata: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[Reference] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): Metadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
      
      @scala.inline
      def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
      
      @scala.inline
      def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value :_*))
      
      @scala.inline
      def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
