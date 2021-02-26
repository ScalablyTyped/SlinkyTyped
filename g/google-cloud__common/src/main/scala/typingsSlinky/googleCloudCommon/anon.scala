package typingsSlinky.googleCloudCommon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleCloudCommon.utilMod.ApiError
import typingsSlinky.googleCloudCommon.utilMod.GoogleErrorBody
import typingsSlinky.googleCloudCommon.utilMod.GoogleInnerError
import typingsSlinky.teenyRequest.mod.CoreOptions
import typingsSlinky.teenyRequest.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  @js.native
  trait IgnoreNotFound extends StObject {
    
    var ignoreNotFound: js.UndefOr[Boolean] = js.native
  }
  object IgnoreNotFound {
    
    @scala.inline
    def apply(): IgnoreNotFound = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreNotFound]
    }
    
    @scala.inline
    implicit class IgnoreNotFoundMutableBuilder[Self <: IgnoreNotFound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreNotFound(value: Boolean): Self = StObject.set(x, "ignoreNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNotFoundUndefined: Self = StObject.set(x, "ignoreNotFound", js.undefined)
    }
  }
  
  @js.native
  trait OnAuthenticated extends StObject {
    
    def onAuthenticated(): Unit = js.native
    def onAuthenticated(err: js.Error): Unit = js.native
    def onAuthenticated(err: js.Error, authenticatedReqOpts: Options): Unit = js.native
    def onAuthenticated(err: Null, authenticatedReqOpts: Options): Unit = js.native
  }
  
  @js.native
  trait ReqOpts extends StObject {
    
    var reqOpts: js.UndefOr[CoreOptions] = js.native
  }
  object ReqOpts {
    
    @scala.inline
    def apply(): ReqOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqOpts]
    }
    
    @scala.inline
    implicit class ReqOptsMutableBuilder[Self <: ReqOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReqOpts(value: CoreOptions): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqOptsUndefined: Self = StObject.set(x, "reqOpts", js.undefined)
    }
  }
  
  @js.native
  trait TypeofApiError extends Instantiable1[/* errorMessage */ String, ApiError] {
    
    /**
      * Pieces together an error message by combining all unique error messages
      * returned from a single GoogleError
      *
      * @private
      *
      * @param {GoogleErrorBody} err The original error.
      * @param {GoogleInnerError[]} [errors] Inner errors, if any.
      * @returns {string}
      */
    def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
    def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
  }
}
