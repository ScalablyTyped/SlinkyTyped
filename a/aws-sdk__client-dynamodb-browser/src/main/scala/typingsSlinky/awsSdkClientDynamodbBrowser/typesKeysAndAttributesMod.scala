package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeysAndAttributesMod {
  
  @js.native
  trait KeysAndAttributes extends StObject {
    
    /**
      * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var AttributesToGet: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p>
      */
    var ConsistentRead: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>The primary key attribute values that define the items and the attributes associated with the items.</p>
      */
    var Keys: (js.Array[
        StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
      ]) | (js.Iterable[
        StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
      ]) = js.native
    
    /**
      * <p>A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the <code>ProjectionExpression</code> must be separated by commas.</p> <p>If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProjectionExpression: js.UndefOr[String] = js.native
  }
  object KeysAndAttributes {
    
    @scala.inline
    def apply(
      Keys: (js.Array[
          StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
        ]) | (js.Iterable[
          StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
        ])
    ): KeysAndAttributes = {
      val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeysAndAttributes]
    }
    
    @scala.inline
    implicit class KeysAndAttributesMutableBuilder[Self <: KeysAndAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetIterable(value: js.Iterable[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
      
      @scala.inline
      def setExpressionAttributeNames(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKeys(
        value: (js.Array[
              StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
            ]) | (js.Iterable[
              StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
            ])
      ): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysIterable(
        value: js.Iterable[
              StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
            ]
      ): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: (StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]))*): Self = StObject.set(x, "Keys", js.Array(value :_*))
      
      @scala.inline
      def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledKeysAndAttributes extends KeysAndAttributes {
    
    /**
      * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("AttributesToGet")
    var AttributesToGet_UnmarshalledKeysAndAttributes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("ExpressionAttributeNames")
    var ExpressionAttributeNames_UnmarshalledKeysAndAttributes: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * <p>The primary key attribute values that define the items and the attributes associated with the items.</p>
      */
    @JSName("Keys")
    var Keys_UnmarshalledKeysAndAttributes: js.Array[StringDictionary[UnmarshalledAttributeValue]] = js.native
  }
  object UnmarshalledKeysAndAttributes {
    
    @scala.inline
    def apply(Keys: js.Array[StringDictionary[UnmarshalledAttributeValue]]): UnmarshalledKeysAndAttributes = {
      val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledKeysAndAttributes]
    }
    
    @scala.inline
    implicit class UnmarshalledKeysAndAttributesMutableBuilder[Self <: UnmarshalledKeysAndAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
      
      @scala.inline
      def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
      
      @scala.inline
      def setExpressionAttributeNames(value: StringDictionary[String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[StringDictionary[UnmarshalledAttributeValue]]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: StringDictionary[UnmarshalledAttributeValue]*): Self = StObject.set(x, "Keys", js.Array(value :_*))
    }
  }
}
