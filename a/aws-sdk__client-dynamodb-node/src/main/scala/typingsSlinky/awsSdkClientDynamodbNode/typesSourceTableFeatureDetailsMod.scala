package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription
import typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typingsSlinky.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceTableFeatureDetailsMod {
  
  @js.native
  trait SourceTableFeatureDetails extends StObject {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]] = js.native
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]] = js.native
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    var SSEDescription: js.UndefOr[typingsSlinky.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription] = js.native
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.native
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    var TimeToLiveDescription: js.UndefOr[
        typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
      ] = js.native
  }
  object SourceTableFeatureDetails {
    
    @scala.inline
    def apply(): SourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceTableFeatureDetails]
    }
    
    @scala.inline
    implicit class SourceTableFeatureDetailsMutableBuilder[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo] | js.Iterable[GlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesIterable(value: js.Iterable[GlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo] | js.Iterable[LocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesIterable(value: js.Iterable[LocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      @scala.inline
      def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSourceTableFeatureDetails extends SourceTableFeatureDetails {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.native
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.native
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    @JSName("SSEDescription")
    var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.native
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    @JSName("StreamDescription")
    var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.native
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    @JSName("TimeToLiveDescription")
    var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.native
  }
  object UnmarshalledSourceTableFeatureDetails {
    
    @scala.inline
    def apply(): UnmarshalledSourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
    }
    
    @scala.inline
    implicit class UnmarshalledSourceTableFeatureDetailsMutableBuilder[Self <: UnmarshalledSourceTableFeatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSSEDescription(value: UnmarshalledSSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamDescription(value: UnmarshalledStreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      @scala.inline
      def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
}
