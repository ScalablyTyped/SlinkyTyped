package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.typesCapacityMod.Capacity
import typingsSlinky.awsSdkClientDynamodbNode.typesCapacityMod.UnmarshalledCapacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConsumedCapacityMod {
  
  @js.native
  trait ConsumedCapacity extends StObject {
    
    /**
      * <p>The total number of capacity units consumed by the operation.</p>
      */
    var CapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>The amount of throughput consumed on each global index affected by the operation.</p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])] = js.native
    
    /**
      * <p>The amount of throughput consumed on each local index affected by the operation.</p>
      */
    var LocalSecondaryIndexes: js.UndefOr[StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])] = js.native
    
    /**
      * <p>The amount of throughput consumed on the table affected by the operation.</p>
      */
    var Table: js.UndefOr[Capacity] = js.native
    
    /**
      * <p>The name of the table that was affected by the operation.</p>
      */
    var TableName: js.UndefOr[String] = js.native
  }
  object ConsumedCapacity {
    
    @scala.inline
    def apply(): ConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumedCapacity]
    }
    
    @scala.inline
    implicit class ConsumedCapacityMutableBuilder[Self <: ConsumedCapacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacityUnits(value: Double): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesIterable(value: js.Iterable[js.Tuple2[String, Capacity]]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexes(value: StringDictionary[Capacity] | (js.Iterable[js.Tuple2[String, Capacity]])): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesIterable(value: js.Iterable[js.Tuple2[String, Capacity]]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setTable(value: Capacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledConsumedCapacity extends ConsumedCapacity {
    
    /**
      * <p>The amount of throughput consumed on each global index affected by the operation.</p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
    
    /**
      * <p>The amount of throughput consumed on each local index affected by the operation.</p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledConsumedCapacity: js.UndefOr[StringDictionary[UnmarshalledCapacity]] = js.native
    
    /**
      * <p>The amount of throughput consumed on the table affected by the operation.</p>
      */
    @JSName("Table")
    var Table_UnmarshalledConsumedCapacity: js.UndefOr[UnmarshalledCapacity] = js.native
  }
  object UnmarshalledConsumedCapacity {
    
    @scala.inline
    def apply(): UnmarshalledConsumedCapacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledConsumedCapacity]
    }
    
    @scala.inline
    implicit class UnmarshalledConsumedCapacityMutableBuilder[Self <: UnmarshalledConsumedCapacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexes(value: StringDictionary[UnmarshalledCapacity]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setTable(value: UnmarshalledCapacity): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
}
