package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyPartResultMod {
  
  @js.native
  trait CopyPartResult extends StObject {
    
    /**
      * <p>Entity tag of the object.</p>
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * <p>Date and time at which the object was uploaded.</p>
      */
    var LastModified: js.UndefOr[js.Date | String | Double] = js.native
  }
  object CopyPartResult {
    
    @scala.inline
    def apply(): CopyPartResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyPartResult]
    }
    
    @scala.inline
    implicit class CopyPartResultMutableBuilder[Self <: CopyPartResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: js.Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledCopyPartResult extends CopyPartResult {
    
    /**
      * <p>Date and time at which the object was uploaded.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledCopyPartResult: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledCopyPartResult {
    
    @scala.inline
    def apply(): UnmarshalledCopyPartResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCopyPartResult]
    }
    
    @scala.inline
    implicit class UnmarshalledCopyPartResultMutableBuilder[Self <: UnmarshalledCopyPartResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
