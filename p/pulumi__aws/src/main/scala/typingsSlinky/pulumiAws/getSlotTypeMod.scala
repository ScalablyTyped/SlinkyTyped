package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.lex.GetSlotTypeEnumerationValue
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSlotTypeMod {
  
  @JSImport("@pulumi/aws/lex/getSlotType", "getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs): js.Promise[GetSlotTypeResult] = js.native
  @JSImport("@pulumi/aws/lex/getSlotType", "getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs, opts: InvokeOptions): js.Promise[GetSlotTypeResult] = js.native
  
  @js.native
  trait GetSlotTypeArgs extends StObject {
    
    /**
      * The name of the slot type. The name is case sensitive.
      */
    val name: String = js.native
    
    /**
      * The version of the slot type.
      */
    val version: js.UndefOr[String] = js.native
  }
  object GetSlotTypeArgs {
    
    @scala.inline
    def apply(name: String): GetSlotTypeArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSlotTypeArgs]
    }
    
    @scala.inline
    implicit class GetSlotTypeArgsMutableBuilder[Self <: GetSlotTypeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetSlotTypeResult extends StObject {
    
    /**
      * Checksum identifying the version of the slot type that was created. The checksum is
      * not included as an argument because the resource will add it automatically when updating the slot type.
      */
    val checksum: String = js.native
    
    /**
      * The date when the slot type version was created.
      */
    val createdDate: String = js.native
    
    /**
      * A description of the slot type.
      */
    val description: String = js.native
    
    /**
      * A set of EnumerationValue objects that defines the values that
      * the slot type can take. Each value can have a set of synonyms, which are additional values that help
      * train the machine learning model about the values that it resolves for a slot.
      */
    val enumerationValues: js.Array[GetSlotTypeEnumerationValue] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The date when the $LATEST version of this slot type was updated.
      */
    val lastUpdatedDate: String = js.native
    
    /**
      * The name of the slot type. The name is not case sensitive.
      */
    val name: String = js.native
    
    /**
      * Determines the slot resolution strategy that Amazon Lex
      * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
      * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
      * if there is a resolution list for the slot, otherwise null is returned.
      */
    val valueSelectionStrategy: String = js.native
    
    /**
      * The version of the slot type.
      */
    val version: js.UndefOr[String] = js.native
  }
  object GetSlotTypeResult {
    
    @scala.inline
    def apply(
      checksum: String,
      createdDate: String,
      description: String,
      enumerationValues: js.Array[GetSlotTypeEnumerationValue],
      id: String,
      lastUpdatedDate: String,
      name: String,
      valueSelectionStrategy: String
    ): GetSlotTypeResult = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enumerationValues = enumerationValues.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], valueSelectionStrategy = valueSelectionStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSlotTypeResult]
    }
    
    @scala.inline
    implicit class GetSlotTypeResultMutableBuilder[Self <: GetSlotTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerationValues(value: js.Array[GetSlotTypeEnumerationValue]): Self = StObject.set(x, "enumerationValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerationValuesVarargs(value: GetSlotTypeEnumerationValue*): Self = StObject.set(x, "enumerationValues", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectionStrategy(value: String): Self = StObject.set(x, "valueSelectionStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
