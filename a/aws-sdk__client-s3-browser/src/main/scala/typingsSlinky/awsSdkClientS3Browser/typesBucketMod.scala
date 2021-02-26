package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketMod {
  
  @js.native
  trait Bucket extends StObject {
    
    /**
      * <p>Date the bucket was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>The name of the bucket.</p>
      */
    var Name: js.UndefOr[String] = js.native
  }
  object Bucket {
    
    @scala.inline
    def apply(): Bucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bucket]
    }
    
    @scala.inline
    implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledBucket extends Bucket {
    
    /**
      * <p>Date the bucket was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledBucket: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledBucket {
    
    @scala.inline
    def apply(): UnmarshalledBucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledBucket]
    }
    
    @scala.inline
    implicit class UnmarshalledBucketMutableBuilder[Self <: UnmarshalledBucket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    }
  }
}
