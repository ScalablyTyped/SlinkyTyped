package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesObjectMod {
  
  @js.native
  trait Object extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.native
    
    /**
      * _LastModified shape
      */
    var LastModified: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
    
    /**
      * _Size shape
      */
    var Size: js.UndefOr[Double] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.native
  }
  object Object {
    
    @scala.inline
    def apply(): Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setLastModified(value: js.Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledObject extends Object {
    
    /**
      * _LastModified shape
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledObject: js.UndefOr[js.Date] = js.native
    
    /**
      * _Owner shape
      */
    @JSName("Owner")
    var Owner_UnmarshalledObject: js.UndefOr[UnmarshalledOwner] = js.native
  }
  object UnmarshalledObject {
    
    @scala.inline
    def apply(): UnmarshalledObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledObject]
    }
    
    @scala.inline
    implicit class UnmarshalledObjectMutableBuilder[Self <: UnmarshalledObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
