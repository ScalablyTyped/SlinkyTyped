package typingsSlinky.jsData

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.jsData.mod.Mapper
import typingsSlinky.jsData.mod.Record
import typingsSlinky.jsData.mod.SchemaValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllOf extends StObject {
    
    def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def dependencies(value: js.Any, schema: js.Any, opts: js.Any): Unit = js.native
    
    def enum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def maxItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def maxLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def maximum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def minItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def minLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def minProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def minimum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def not(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def pattern(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def `type`(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
    
    def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError = js.native
  }
  object AllOf {
    
    @scala.inline
    def apply(
      allOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      anyOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      dependencies: (js.Any, js.Any, js.Any) => Unit,
      enum: (js.Any, js.Any, js.Any) => SchemaValidationError,
      items: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      maxItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
      maxLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
      maxProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
      maximum: (js.Any, js.Any, js.Any) => SchemaValidationError,
      minItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
      minLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
      minProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
      minimum: (js.Any, js.Any, js.Any) => SchemaValidationError,
      multipleOf: (js.Any, js.Any, js.Any) => SchemaValidationError,
      not: (js.Any, js.Any, js.Any) => SchemaValidationError,
      oneOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      pattern: (js.Any, js.Any, js.Any) => SchemaValidationError,
      properties: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      required: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      `type`: (js.Any, js.Any, js.Any) => SchemaValidationError,
      uniqueItems: (js.Any, js.Any, js.Any) => SchemaValidationError
    ): AllOf = {
      val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), enum = js.Any.fromFunction3(enum), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
      __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
      __obj.asInstanceOf[AllOf]
    }
    
    @scala.inline
    implicit class AllOfMutableBuilder[Self <: AllOf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "allOf", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAnyOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "anyOf", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDependencies(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "dependencies", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEnum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "enum", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItems(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "items", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMaxItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "maxItems", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMaxLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "maxLength", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMaxProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "maxProperties", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMaximum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "maximum", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMinItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "minItems", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMinLength(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "minLength", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMinProperties(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "minProperties", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMinimum(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "minimum", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMultipleOf(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "multipleOf", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNot(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "not", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOneOf(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "oneOf", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPattern(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "pattern", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProperties(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "properties", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequired(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "required", js.Any.fromFunction3(value))
      
      @scala.inline
      def setType(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUniqueItems(value: (js.Any, js.Any, js.Any) => SchemaValidationError): Self = StObject.set(x, "uniqueItems", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Array extends StObject {
    
    def array(value: js.Any): Boolean = js.native
    
    def boolean(value: js.Any): Boolean = js.native
    
    def integer(value: js.Any): Boolean = js.native
    
    def `null`(value: js.Any): Boolean = js.native
    
    def number(value: js.Any): Boolean = js.native
    
    def `object`(value: js.Any): Boolean = js.native
    
    def string(value: js.Any): Boolean = js.native
  }
  object Array {
    
    @scala.inline
    def apply(
      array: js.Any => Boolean,
      boolean: js.Any => Boolean,
      integer: js.Any => Boolean,
      `null`: js.Any => Boolean,
      number: js.Any => Boolean,
      `object`: js.Any => Boolean,
      string: js.Any => Boolean
    ): Array = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
      __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
      __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: js.Any => Boolean): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoolean(value: js.Any => Boolean): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInteger(value: js.Any => Boolean): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNull(value: js.Any => Boolean): Self = StObject.set(x, "null", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNumber(value: js.Any => Boolean): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObject(value: js.Any => Boolean): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(value: js.Any => Boolean): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Integer extends StObject {
    
    def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
    
    def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  }
  object Integer {
    
    @scala.inline
    def apply(
      array: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      integer: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      number: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      numeric: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      `object`: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
      string: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]
    ): Integer = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
      __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
      __obj.asInstanceOf[Integer]
    }
    
    @scala.inline
    implicit class IntegerMutableBuilder[Self <: Integer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "array", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInteger(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "integer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNumber(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "number", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNumeric(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "numeric", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObject(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "object", js.Any.fromFunction3(value))
      
      @scala.inline
      def setString(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = StObject.set(x, "string", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait TypeofRecord
    extends Instantiable0[Record]
       with Instantiable1[/* props */ js.Any, Record]
       with Instantiable2[js.UndefOr[/* props */ js.Any], /* opts */ js.Any, Record] {
    
    var mapper: Mapper = js.native
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("==")
    def EqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName("===")
    def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName("!=")
    def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName(">")
    def Greaterthansign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName(">=")
    def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName("<")
    def Lessthansign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    @JSName("<=")
    def LessthansignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
    
    def contains(value: js.Any, predicate: js.Any): Boolean = js.native
    
    def in(value: js.Any, predicate: js.Any): Boolean = js.native
    
    def isectEmpty(value: js.Any, predicate: js.Any): Boolean = js.native
    
    def isectNotEmpty(value: js.Any, predicate: js.Any): Double = js.native
    
    def notContains(value: js.Any, predicate: js.Any): Boolean = js.native
    
    def notIn(value: js.Any, predicate: js.Any): Boolean = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(
      EqualssignEqualssign: (js.Any, js.Any) => Boolean,
      EqualssignEqualssignEqualssign: (js.Any, js.Any) => Boolean,
      ExclamationmarkEqualssign: (js.Any, js.Any) => Boolean,
      ExclamationmarkEqualssignEqualssign: (js.Any, js.Any) => Boolean,
      Greaterthansign: (js.Any, js.Any) => Boolean,
      GreaterthansignEqualssign: (js.Any, js.Any) => Boolean,
      Lessthansign: (js.Any, js.Any) => Boolean,
      LessthansignEqualssign: (js.Any, js.Any) => Boolean,
      contains: (js.Any, js.Any) => Boolean,
      in: (js.Any, js.Any) => Boolean,
      isectEmpty: (js.Any, js.Any) => Boolean,
      isectNotEmpty: (js.Any, js.Any) => Double,
      notContains: (js.Any, js.Any) => Boolean,
      notIn: (js.Any, js.Any) => Boolean
    ): _empty = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), in = js.Any.fromFunction2(in), isectEmpty = js.Any.fromFunction2(isectEmpty), isectNotEmpty = js.Any.fromFunction2(isectNotEmpty), notContains = js.Any.fromFunction2(notContains), notIn = js.Any.fromFunction2(notIn))
      __obj.updateDynamic("==")(js.Any.fromFunction2(EqualssignEqualssign))
      __obj.updateDynamic("===")(js.Any.fromFunction2(EqualssignEqualssignEqualssign))
      __obj.updateDynamic("!=")(js.Any.fromFunction2(ExclamationmarkEqualssign))
      __obj.updateDynamic("!==")(js.Any.fromFunction2(ExclamationmarkEqualssignEqualssign))
      __obj.updateDynamic(">")(js.Any.fromFunction2(Greaterthansign))
      __obj.updateDynamic(">=")(js.Any.fromFunction2(GreaterthansignEqualssign))
      __obj.updateDynamic("<")(js.Any.fromFunction2(Lessthansign))
      __obj.updateDynamic("<=")(js.Any.fromFunction2(LessthansignEqualssign))
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "==", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualssignEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "===", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExclamationmarkEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "!=", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExclamationmarkEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "!==", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterthansign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, ">", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGreaterthansignEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, ">=", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIn(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "in", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsectEmpty(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "isectEmpty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsectNotEmpty(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "isectNotEmpty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessthansign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "<", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessthansignEqualssign(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "<=", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotContains(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "notContains", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotIn(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "notIn", js.Any.fromFunction2(value))
    }
  }
}
