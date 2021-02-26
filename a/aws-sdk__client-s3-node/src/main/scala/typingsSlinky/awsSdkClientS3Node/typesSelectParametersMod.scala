package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.UnmarshalledInputSerialization
import typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.UnmarshalledOutputSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectParametersMod {
  
  @js.native
  trait SelectParameters extends StObject {
    
    /**
      * <p>The expression that is used to query the object.</p>
      */
    var Expression: String = js.native
    
    /**
      * <p>The type of the provided expression (e.g., SQL).</p>
      */
    var ExpressionType: SQL | String = js.native
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    var InputSerialization: typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization = js.native
    
    /**
      * <p>Describes how the results of the Select job are serialized.</p>
      */
    var OutputSerialization: typingsSlinky.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization = js.native
  }
  object SelectParameters {
    
    @scala.inline
    def apply(
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: InputSerialization,
      OutputSerialization: OutputSerialization
    ): SelectParameters = {
      val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectParameters]
    }
    
    @scala.inline
    implicit class SelectParametersMutableBuilder[Self <: SelectParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionType(value: SQL | String): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledSelectParameters extends SelectParameters {
    
    /**
      * <p>Describes the serialization format of the object.</p>
      */
    @JSName("InputSerialization")
    var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization = js.native
    
    /**
      * <p>Describes how the results of the Select job are serialized.</p>
      */
    @JSName("OutputSerialization")
    var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization = js.native
  }
  object UnmarshalledSelectParameters {
    
    @scala.inline
    def apply(
      Expression: String,
      ExpressionType: SQL | String,
      InputSerialization: UnmarshalledInputSerialization,
      OutputSerialization: UnmarshalledOutputSerialization
    ): UnmarshalledSelectParameters = {
      val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSelectParameters]
    }
    
    @scala.inline
    implicit class UnmarshalledSelectParametersMutableBuilder[Self <: UnmarshalledSelectParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputSerialization(value: UnmarshalledInputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSerialization(value: UnmarshalledOutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    }
  }
}
