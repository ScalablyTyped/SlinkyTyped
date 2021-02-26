package typingsSlinky.angularOdataResources

import typingsSlinky.angularOdataResources.OData.IExecutable
import typingsSlinky.angularOdataResources.OData.ProviderCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OData {
    
    @JSGlobal("OData.BinaryOperation")
    @js.native
    class BinaryOperation protected ()
      extends typingsSlinky.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrPredicate: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.UndefOr[scala.Nothing], value: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
    }
    
    @JSGlobal("OData.Global")
    @js.native
    class Global protected ()
      extends typingsSlinky.angularOdataResources.OData.Global {
      def this(
        ODataBinaryOperation: js.Any,
        ODataProvider: js.Any,
        ODataValue: js.Any,
        ODataProperty: js.Any,
        ODataMethodCall: js.Any,
        ODataPredicate: js.Any,
        ODataOrderByStatement: js.Any
      ) = this()
    }
    object Global {
      
      @JSGlobal("OData.Global")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("OData.Global.$inject")
      @js.native
      def inject: js.Array[String] = js.native
      
      @scala.inline
      def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("OData.MethodCall")
    @js.native
    class MethodCall protected ()
      extends typingsSlinky.angularOdataResources.OData.MethodCall {
      def this(methodName: String, args: js.Any*) = this()
    }
    
    @JSGlobal("OData.Operators")
    @js.native
    class Operators ()
      extends typingsSlinky.angularOdataResources.OData.Operators
    
    @JSGlobal("OData.OrderByStatement")
    @js.native
    class OrderByStatement protected ()
      extends typingsSlinky.angularOdataResources.OData.OrderByStatement {
      def this(propertyName: String) = this()
      def this(propertyName: String, sortOrder: String) = this()
    }
    
    @JSGlobal("OData.Predicate")
    @js.native
    class Predicate protected ()
      extends typingsSlinky.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrValueOrPredicate: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.UndefOr[scala.Nothing], value: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
    }
    object Predicate {
      
      /* static member */
      @JSGlobal("OData.Predicate.and")
      @js.native
      def and(andStatements: js.Any): IExecutable = js.native
      
      /* static member */
      @JSGlobal("OData.Predicate.create")
      @js.native
      def create(propertyOrPredicate: js.Any): IExecutable = js.native
      @JSGlobal("OData.Predicate.create")
      @js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): IExecutable = js.native
      @JSGlobal("OData.Predicate.create")
      @js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
      @JSGlobal("OData.Predicate.create")
      @js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
      
      /* static member */
      @JSGlobal("OData.Predicate.or")
      @js.native
      def or(orStatements: js.Array[_]): IExecutable = js.native
    }
    
    @JSGlobal("OData.Property")
    @js.native
    class Property protected ()
      extends typingsSlinky.angularOdataResources.OData.Property {
      def this(value: String) = this()
    }
    
    @JSGlobal("OData.Provider")
    @js.native
    class Provider[T] protected ()
      extends typingsSlinky.angularOdataResources.OData.Provider[T] {
      def this(callback: ProviderCallback[T]) = this()
    }
    
    @JSGlobal("OData.Value")
    @js.native
    class Value protected ()
      extends typingsSlinky.angularOdataResources.OData.Value {
      def this(value: js.Any) = this()
      def this(value: js.Any, `type`: String) = this()
    }
    
    @JSGlobal("OData.ValueTypes")
    @js.native
    class ValueTypes ()
      extends typingsSlinky.angularOdataResources.OData.ValueTypes
    object ValueTypes {
      
      @JSGlobal("OData.ValueTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Boolean")
      @js.native
      def Boolean: String = js.native
      @scala.inline
      def Boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Byte")
      @js.native
      def Byte: String = js.native
      @scala.inline
      def Byte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Byte")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.DateTime")
      @js.native
      def DateTime: String = js.native
      @scala.inline
      def DateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Decimal")
      @js.native
      def Decimal: String = js.native
      @scala.inline
      def Decimal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Double")
      @js.native
      def Double: String = js.native
      @scala.inline
      def Double_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Guid")
      @js.native
      def Guid: String = js.native
      @scala.inline
      def Guid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Guid")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Int32")
      @js.native
      def Int32: String = js.native
      @scala.inline
      def Int32_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Single")
      @js.native
      def Single: String = js.native
      @scala.inline
      def Single_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.String")
      @js.native
      def String: java.lang.String = js.native
      @scala.inline
      def String_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    }
  }
}
