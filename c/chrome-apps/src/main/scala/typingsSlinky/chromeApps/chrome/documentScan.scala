package typingsSlinky.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.documentScan
///////////////////
// Document Scan //
///////////////////
/**
  * Use the chrome.documentScan API to discover and retrieve
  * images from attached paper document scanners.
  *
  * The Document Scan API is designed to allow apps to view
  * the content of paper documents on an attached document scanner.
  *
  * *Note: This API depends on OS features that may not be available*
  * *depending on the underlying operating system. As of this writing only*
  * *Chrome OS for certain USB-attached devices is known to successfully work.*
  *
  * @since Chrome 44.
  * @requires Permissions: 'documentScan'
  * @requires Important: This API works only on Chrome OS.
  */
object documentScan {
  
  @js.native
  trait DocumentScanCallbackArg extends StObject {
    
    /** The data image URLs in a form that can be passed as the 'src' value to an image tag. */
    var dataUrls: js.Array[String] = js.native
    
    /** The MIME type of dataUrls. */
    var mimeType: String = js.native
  }
  object DocumentScanCallbackArg {
    
    @scala.inline
    def apply(dataUrls: js.Array[String], mimeType: String): DocumentScanCallbackArg = {
      val __obj = js.Dynamic.literal(dataUrls = dataUrls.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentScanCallbackArg]
    }
    
    @scala.inline
    implicit class DocumentScanCallbackArgMutableBuilder[Self <: DocumentScanCallbackArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataUrls(value: js.Array[String]): Self = StObject.set(x, "dataUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUrlsVarargs(value: String*): Self = StObject.set(x, "dataUrls", js.Array(value :_*))
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentScanOptions extends StObject {
    
    /** The number of scanned images allowed (defaults to 1).  */
    var maxImages: js.UndefOr[integer] = js.native
    
    /** The MIME types that are accepted by the caller.  */
    var mimeTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object DocumentScanOptions {
    
    @scala.inline
    def apply(): DocumentScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentScanOptions]
    }
    
    @scala.inline
    implicit class DocumentScanOptionsMutableBuilder[Self <: DocumentScanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxImages(value: integer): Self = StObject.set(x, "maxImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxImagesUndefined: Self = StObject.set(x, "maxImages", js.undefined)
      
      @scala.inline
      def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
    }
  }
}
