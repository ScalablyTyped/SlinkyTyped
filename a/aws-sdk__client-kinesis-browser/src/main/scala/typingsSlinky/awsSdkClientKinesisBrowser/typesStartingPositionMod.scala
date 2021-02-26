package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStartingPositionMod {
  
  @js.native
  trait StartingPosition extends StObject {
    
    /**
      * _SequenceNumber shape
      */
    var SequenceNumber: js.UndefOr[String] = js.native
    
    /**
      * _Timestamp shape
      */
    var Timestamp: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * _ShardIteratorType shape
      */
    var Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String = js.native
  }
  object StartingPosition {
    
    @scala.inline
    def apply(Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): StartingPosition = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartingPosition]
    }
    
    @scala.inline
    implicit class StartingPositionMutableBuilder[Self <: StartingPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDate(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
      
      @scala.inline
      def setType(value: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledStartingPosition extends StartingPosition {
    
    /**
      * _Timestamp shape
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledStartingPosition: js.UndefOr[js.Date] = js.native
  }
  object UnmarshalledStartingPosition {
    
    @scala.inline
    def apply(Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): UnmarshalledStartingPosition = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStartingPosition]
    }
    
    @scala.inline
    implicit class UnmarshalledStartingPositionMutableBuilder[Self <: UnmarshalledStartingPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
}
