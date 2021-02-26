package typingsSlinky.jestMock

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jestMock.jestMockBooleans.`true`
import typingsSlinky.jestMock.jestMockStrings.get
import typingsSlinky.jestMock.jestMockStrings.set
import typingsSlinky.std.Map
import typingsSlinky.std.Parameters
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jest-mock", JSImport.Namespace)
  @js.native
  val ^ : ModuleMockerClass = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jest-mock", "ModuleMocker")
  @js.native
  class ModuleMockerCls protected () extends ModuleMockerClass {
    /**
      * @see README.md
      * @param global Global object of the test environment, used to create
      * mocks
      */
    def this(global: Global) = this()
  }
  
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  
  type Global = typingsSlinky.node.NodeJS.Global
  
  @js.native
  trait Mock[T, Y /* <: js.Array[_] */]
    extends js.Function
       with MockInstance[T, Y]
       with Instantiable1[/* args */ Y, T] {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Y is not an array type */ args: Y
    ): T = js.native
  }
  
  @js.native
  trait MockFunctionMetadata[T, Y /* <: js.Array[_] */, Type] extends StObject {
    
    var length: js.UndefOr[Double] = js.native
    
    var members: js.UndefOr[Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]] = js.native
    
    var mockImpl: js.UndefOr[js.Function1[/* args */ Y, T]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[Double] = js.native
    
    var refID: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  object MockFunctionMetadata {
    
    @scala.inline
    def apply[T, Y /* <: js.Array[_] */, Type](): MockFunctionMetadata[T, Y, Type] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockFunctionMetadata[T, Y, Type]]
    }
    
    @scala.inline
    implicit class MockFunctionMetadataMutableBuilder[Self <: MockFunctionMetadata[_, _, _], T, Y /* <: js.Array[_] */, Type] (val x: Self with (MockFunctionMetadata[T, Y, Type])) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMembers(value: Record[String, MockFunctionMetadata[T, Y, MockFunctionMetadataType]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMockImpl(value: /* args */ Y => T): Self = StObject.set(x, "mockImpl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMockImplUndefined: Self = StObject.set(x, "mockImpl", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefID(value: Double): Self = StObject.set(x, "refID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIDUndefined: Self = StObject.set(x, "refID", js.undefined)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestMock.jestMockStrings.`object`
    - typingsSlinky.jestMock.jestMockStrings.array
    - typingsSlinky.jestMock.jestMockStrings.regexp
    - typingsSlinky.jestMock.jestMockStrings.function
    - typingsSlinky.jestMock.jestMockStrings.constant
    - typingsSlinky.jestMock.jestMockStrings.collection
    - typingsSlinky.jestMock.jestMockStrings.`null`
    - typingsSlinky.jestMock.jestMockStrings.undefined
  */
  trait MockFunctionMetadataType extends StObject
  object MockFunctionMetadataType {
    
    @scala.inline
    def array: typingsSlinky.jestMock.jestMockStrings.array = "array".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.array]
    
    @scala.inline
    def collection: typingsSlinky.jestMock.jestMockStrings.collection = "collection".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.collection]
    
    @scala.inline
    def constant: typingsSlinky.jestMock.jestMockStrings.constant = "constant".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.constant]
    
    @scala.inline
    def function: typingsSlinky.jestMock.jestMockStrings.function = "function".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.function]
    
    @scala.inline
    def `null`: typingsSlinky.jestMock.jestMockStrings.`null` = "null".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`null`]
    
    @scala.inline
    def `object`: typingsSlinky.jestMock.jestMockStrings.`object` = "object".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`object`]
    
    @scala.inline
    def regexp: typingsSlinky.jestMock.jestMockStrings.regexp = "regexp".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.regexp]
    
    @scala.inline
    def undefined: typingsSlinky.jestMock.jestMockStrings.undefined = "undefined".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.undefined]
  }
  
  /**
    * Represents the result of a single call to a mock function.
    */
  @js.native
  trait MockFunctionResult extends StObject {
    
    /**
      * Indicates how the call completed.
      */
    var `type`: MockFunctionResultType = js.native
    
    /**
      * The value that was either thrown or returned by the function.
      * Undefined when type === 'incomplete'.
      */
    var value: js.Any = js.native
  }
  object MockFunctionResult {
    
    @scala.inline
    def apply(`type`: MockFunctionResultType, value: js.Any): MockFunctionResult = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockFunctionResult]
    }
    
    @scala.inline
    implicit class MockFunctionResultMutableBuilder[Self <: MockFunctionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: MockFunctionResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible types of a MockFunctionResult.
    * 'return': The call completed by returning normally.
    * 'throw': The call completed by throwing a value.
    * 'incomplete': The call has not completed yet. This is possible if you read
    *               the  mock function result from within the mock function itself
    *               (or a function called by the mock function).
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestMock.jestMockStrings.`return`
    - typingsSlinky.jestMock.jestMockStrings.`throw`
    - typingsSlinky.jestMock.jestMockStrings.incomplete
  */
  trait MockFunctionResultType extends StObject
  object MockFunctionResultType {
    
    @scala.inline
    def incomplete: typingsSlinky.jestMock.jestMockStrings.incomplete = "incomplete".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.incomplete]
    
    @scala.inline
    def `return`: typingsSlinky.jestMock.jestMockStrings.`return` = "return".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`return`]
    
    @scala.inline
    def `throw`: typingsSlinky.jestMock.jestMockStrings.`throw` = "throw".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`throw`]
  }
  
  @js.native
  trait MockFunctionState[T, Y /* <: js.Array[_] */] extends StObject {
    
    var calls: js.Array[Y] = js.native
    
    var instances: js.Array[T] = js.native
    
    var invocationCallOrder: js.Array[Double] = js.native
    
    /**
      * List of results of calls to the mock function.
      */
    var results: js.Array[MockFunctionResult] = js.native
  }
  object MockFunctionState {
    
    @scala.inline
    def apply[T, Y /* <: js.Array[_] */](
      calls: js.Array[Y],
      instances: js.Array[T],
      invocationCallOrder: js.Array[Double],
      results: js.Array[MockFunctionResult]
    ): MockFunctionState[T, Y] = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockFunctionState[T, Y]]
    }
    
    @scala.inline
    implicit class MockFunctionStateMutableBuilder[Self <: MockFunctionState[_, _], T, Y /* <: js.Array[_] */] (val x: Self with (MockFunctionState[T, Y])) extends AnyVal {
      
      @scala.inline
      def setCalls(value: js.Array[Y]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallsVarargs(value: Y*): Self = StObject.set(x, "calls", js.Array(value :_*))
      
      @scala.inline
      def setInstances(value: js.Array[T]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesVarargs(value: T*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setInvocationCallOrder(value: js.Array[Double]): Self = StObject.set(x, "invocationCallOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationCallOrderVarargs(value: Double*): Self = StObject.set(x, "invocationCallOrder", js.Array(value :_*))
      
      @scala.inline
      def setResults(value: js.Array[MockFunctionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: MockFunctionResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MockInstance[T, Y /* <: js.Array[_] */] extends StObject {
    
    var _isMockFunction: `true` = js.native
    
    var _protoImpl: js.Function = js.native
    
    def getMockImplementation(): js.UndefOr[js.Function] = js.native
    
    def getMockName(): String = js.native
    
    var mock: MockFunctionState[T, Y] = js.native
    
    def mockClear(): this.type = js.native
    
    def mockImplementation(fn: js.Function0[js.Promise[T]]): this.type = js.native
    def mockImplementation(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    
    def mockImplementationOnce(fn: js.Function0[js.Promise[T]]): this.type = js.native
    def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    
    def mockName(name: String): this.type = js.native
    
    def mockRejectedValue(value: T): this.type = js.native
    
    def mockRejectedValueOnce(value: T): this.type = js.native
    
    def mockReset(): this.type = js.native
    
    def mockResolvedValue(value: T): this.type = js.native
    
    def mockResolvedValueOnce(value: T): this.type = js.native
    
    def mockRestore(): Unit = js.native
    
    def mockReturnThis(): this.type = js.native
    
    def mockReturnValue(value: T): this.type = js.native
    
    def mockReturnValueOnce(value: T): this.type = js.native
  }
  
  type ModuleMocker = ModuleMockerClass
  
  @js.native
  trait ModuleMockerClass extends StObject {
    
    var ModuleMocker: Instantiable1[/* global */ Global, ModuleMockerClass] = js.native
    
    var _createMockFunction: js.Any = js.native
    
    var _defaultMockConfig: js.Any = js.native
    
    var _defaultMockState: js.Any = js.native
    
    var _ensureMockConfig: js.Any = js.native
    
    var _ensureMockState: js.Any = js.native
    
    var _environmentGlobal: js.Any = js.native
    
    var _generateMock: js.Any = js.native
    
    var _getSlots: js.Any = js.native
    
    var _invocationCallCounter: js.Any = js.native
    
    var _makeComponent: js.Any = js.native
    
    var _mockConfigRegistry: js.Any = js.native
    
    var _mockState: js.Any = js.native
    
    var _spyOnProperty: js.Any = js.native
    
    var _spyState: js.Any = js.native
    
    var _typeOf: js.Any = js.native
    
    def clearAllMocks(): Unit = js.native
    
    def fn[T, Y /* <: js.Array[_] */](): Mock[T, Y] = js.native
    def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): Mock[T, Y] = js.native
    
    /**
      * @see README.md
      * @param _metadata Metadata for the mock in the schema returned by the
      * getMetadata method of this module.
      */
    def generateFromMetadata[T, Y /* <: js.Array[_] */](_metadata: MockFunctionMetadata[T, Y, MockFunctionMetadataType]): Mock[T, Y] = js.native
    
    /**
      * @see README.md
      * @param component The component for which to retrieve metadata.
      */
    def getMetadata[T, Y /* <: js.Array[_] */](component: T): (MockFunctionMetadata[T, Y, MockFunctionMetadataType]) | Null = js.native
    def getMetadata[T, Y /* <: js.Array[_] */](component: T, _refs: Map[T, Double]): (MockFunctionMetadata[T, Y, MockFunctionMetadataType]) | Null = js.native
    
    def isMockFunction[T](fn: js.Any): /* is jest-mock.jest-mock.Mock<T, std.Array<unknown>> */ Boolean = js.native
    
    def resetAllMocks(): Unit = js.native
    
    def restoreAllMocks(): Unit = js.native
    
    def spyOn[T /* <: js.Object */, M /* <: FunctionPropertyNames[T] */](`object`: T, methodName: M): SpyInstance[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
        ], 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
        ]
      ] = js.native
    @JSName("spyOn")
    def spyOn_get[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[T] */](`object`: T, methodName: M, accessType: get): SpyInstance[
        /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any, 
        js.Array[js.Any]
      ] = js.native
    @JSName("spyOn")
    def spyOn_set[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[T] */](`object`: T, methodName: M, accessType: set): SpyInstance[
        Unit, 
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[M] */ js.Any
        ]
      ] = js.native
  }
  
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with String
  
  type SpyInstance[T, Y /* <: js.Array[_] */] = MockInstance[T, Y]
  
  type _To = ModuleMockerClass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ModuleMockerClass = ^
}
