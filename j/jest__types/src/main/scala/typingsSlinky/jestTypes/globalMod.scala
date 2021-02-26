package typingsSlinky.jestTypes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbulLibCoverage.mod.CoverageMapData
import typingsSlinky.jestTypes.anon.ItBaseconcurrentItConcurr
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.Immediate
import typingsSlinky.node.NodeJS.Timeout
import typingsSlinky.node.anon.TypeofBuffer
import typingsSlinky.std.ArrayBufferConstructor
import typingsSlinky.std.DataViewConstructor
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.Float64ArrayConstructor
import typingsSlinky.std.Int16ArrayConstructor
import typingsSlinky.std.Int32ArrayConstructor
import typingsSlinky.std.Int8ArrayConstructor
import typingsSlinky.std.MapConstructor
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import typingsSlinky.std.SetConstructor
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.std.Uint16ArrayConstructor
import typingsSlinky.std.Uint32ArrayConstructor
import typingsSlinky.std.Uint8ArrayConstructor
import typingsSlinky.std.Uint8ClampedArrayConstructor
import typingsSlinky.std.WeakMapConstructor
import typingsSlinky.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  type ArrayTable = Table | Row
  
  type BlockFn = js.Function0[Unit]
  
  type BlockName = String
  
  type Col = js.Any
  
  type ConcurrentTestFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.Promise[js.UndefOr[Unit | js.Any]]]
  
  @js.native
  trait Describe extends DescribeBase {
    
    def only(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("only")
    var only_Original: DescribeBase = js.native
    
    def skip(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("skip")
    var skip_Original: DescribeBase = js.native
  }
  
  @js.native
  trait DescribeBase extends StObject {
    
    def apply(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    
    var each: Each[BlockFn] = js.native
  }
  
  type DoneFn = js.Function1[/* reason */ js.UndefOr[String | js.Error], Unit]
  
  type Each[EachCallback /* <: TestCallback */] = (js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]) | js.Function0[js.Function0[Unit]]
  
  type EachTable = ArrayTable | TemplateTable
  
  type EachTestFn[EachCallback /* <: TestCallback */] = js.Function1[/* repeated */ js.Any, ReturnType[EachCallback]]
  
  /* Inlined parent @jest/types.@jest/types/build/Global.GlobalAdditions */
  /* Inlined parent std.Omit<node.NodeJS.Global, keyof @jest/types.@jest/types/build/Global.GlobalAdditions> */
  @js.native
  trait Global
    extends /* extras */ StringDictionary[js.Any] {
    
    def Array(): js.Array[_] = js.native
    
    var ArrayBuffer: ArrayBufferConstructor = js.native
    
    @JSName("Array")
    var Array_Original: js.Function0[js.Array[_]] = js.native
    
    def Boolean[T](): scala.Boolean = js.native
    @JSName("Boolean")
    var Boolean_Original: js.Function0[Boolean] = js.native
    
    var Buffer: TypeofBuffer with (Instantiable2[
        /* str */ String, 
        /* encoding */ js.UndefOr[BufferEncoding], 
        typingsSlinky.node.Buffer
      ]) = js.native
    
    var DataView: DataViewConstructor = js.native
    
    def Date(): String = js.native
    @JSName("Date")
    var Date_Original: js.Function0[String] = js.native
    
    def Error(): js.Error = js.native
    @JSName("Error")
    var Error_Original: js.Function0[js.Error] = js.native
    
    def EvalError(): js.EvalError = js.native
    @JSName("EvalError")
    var EvalError_Original: js.Function0[js.EvalError] = js.native
    
    var Float32Array: Float32ArrayConstructor = js.native
    
    var Float64Array: Float64ArrayConstructor = js.native
    
    def Function(args: String*): js.Function = js.native
    @JSName("Function")
    var Function_Original: js.Function1[/* repeated */ String, js.Function] = js.native
    
    var Infinity: Double = js.native
    
    var Int16Array: Int16ArrayConstructor = js.native
    
    var Int32Array: Int32ArrayConstructor = js.native
    
    var Int8Array: Int8ArrayConstructor = js.native
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
    
    var JSON: typingsSlinky.std.JSON = js.native
    
    var Map: MapConstructor = js.native
    
    var Math: typingsSlinky.std.Math = js.native
    
    var NaN: Double = js.native
    
    def Number(): Double = js.native
    @JSName("Number")
    var Number_Original: js.Function0[Double] = js.native
    
    def Object(): js.Any = js.native
    @JSName("Object")
    var Object_Original: js.Function0[_] = js.native
    
    var Promise: PromiseConstructor = js.native
    
    def RangeError(): js.RangeError = js.native
    @JSName("RangeError")
    var RangeError_Original: js.Function0[js.RangeError] = js.native
    
    def ReferenceError(): js.ReferenceError = js.native
    @JSName("ReferenceError")
    var ReferenceError_Original: js.Function0[js.ReferenceError] = js.native
    
    def RegExp(pattern: js.RegExp): js.RegExp = js.native
    @JSName("RegExp")
    var RegExp_Original: js.Function1[/* pattern */ js.RegExp, js.RegExp] = js.native
    
    var Set: SetConstructor = js.native
    
    def String(): java.lang.String = js.native
    @JSName("String")
    var String_Original: js.Function0[String] = js.native
    
    var Symbol: js.Function = js.native
    
    def SyntaxError(): js.SyntaxError = js.native
    @JSName("SyntaxError")
    var SyntaxError_Original: js.Function0[js.SyntaxError] = js.native
    
    def TypeError(): js.TypeError = js.native
    @JSName("TypeError")
    var TypeError_Original: js.Function0[js.TypeError] = js.native
    
    def URIError(): js.URIError = js.native
    @JSName("URIError")
    var URIError_Original: js.Function0[js.URIError] = js.native
    
    var Uint16Array: Uint16ArrayConstructor = js.native
    
    var Uint32Array: Uint32ArrayConstructor = js.native
    
    var Uint8Array: Uint8ArrayConstructor = js.native
    
    var Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
    
    var WeakMap: WeakMapConstructor = js.native
    
    var WeakSet: WeakSetConstructor = js.native
    
    var __coverage__ : CoverageMapData = js.native
    
    def afterAll(fn: HookFn): Unit = js.native
    def afterAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterAll")
    var afterAll_Original: HookBase = js.native
    
    def afterEach(fn: HookFn): Unit = js.native
    def afterEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: HookBase = js.native
    
    def beforeAll(fn: HookFn): Unit = js.native
    def beforeAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeAll")
    var beforeAll_Original: HookBase = js.native
    
    def beforeEach(fn: HookFn): Unit = js.native
    def beforeEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: HookBase = js.native
    
    def clearImmediate(immediateId: Immediate): Unit = js.native
    @JSName("clearImmediate")
    var clearImmediate_Original: js.Function1[/* immediateId */ Immediate, Unit] = js.native
    
    def clearInterval(intervalId: Timeout): Unit = js.native
    @JSName("clearInterval")
    var clearInterval_Original: js.Function1[/* intervalId */ Timeout, Unit] = js.native
    
    def clearTimeout(timeoutId: Timeout): Unit = js.native
    @JSName("clearTimeout")
    var clearTimeout_Original: js.Function1[/* timeoutId */ Timeout, Unit] = js.native
    
    def decodeURI(encodedURI: String): String = js.native
    
    def decodeURIComponent(encodedURIComponent: String): String = js.native
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
    
    def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("describe")
    var describe_Original: Describe = js.native
    
    def encodeURI(uri: String): String = js.native
    
    def encodeURIComponent(uriComponent: Boolean): String = js.native
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: js.Function1[/* uriComponent */ Boolean, String] = js.native
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
    
    def escape(str: String): String = js.native
    @JSName("escape")
    var escape_Original: js.Function1[/* str */ String, String] = js.native
    
    def eval(x: String): js.Any = js.native
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ String, _] = js.native
    
    def fail(): Unit = js.native
    
    def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("fdescribe")
    var fdescribe_Original: DescribeBase = js.native
    
    def fit(testName: TestName, fn: TestFn): Unit = js.native
    def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("fit")
    var fit_Original: ItBaseconcurrentItConcurr = js.native
    
    def gc(): Unit = js.native
    @JSName("gc")
    var gc_Original: js.Function0[Unit] = js.native
    
    var global: typingsSlinky.node.NodeJS.Global = js.native
    
    def isFinite(number: Double): Boolean = js.native
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def isNaN(number: Double): Boolean = js.native
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
    
    def it(testName: TestName, fn: TestFn): Unit = js.native
    def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("it")
    var it_Original: ItConcurrent = js.native
    
    var jasmine: Jasmine = js.native
    
    def parseFloat(string: String): Double = js.native
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
    
    def parseInt(s: String, radix: Double): Double = js.native
    @JSName("parseInt")
    var parseInt_Original: js.Function2[/* s */ String, /* radix */ Double, Double] = js.native
    
    def pending(): Unit = js.native
    
    def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
    @JSName("setImmediate")
    var setImmediate_Original: js.Function2[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* repeated */ js.Any, 
        Immediate
      ] = js.native
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    @JSName("setInterval")
    var setInterval_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ] = js.native
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    @JSName("setTimeout")
    var setTimeout_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ] = js.native
    
    def spyOn(): Unit = js.native
    
    def spyOnProperty(): Unit = js.native
    
    def test(testName: TestName, fn: TestFn): Unit = js.native
    def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("test")
    var test_Original: ItConcurrent = js.native
    
    var undefined: js.UndefOr[scala.Nothing] = js.native
    
    def unescape(str: String): String = js.native
    @JSName("unescape")
    var unescape_Original: js.Function1[/* str */ String, String] = js.native
    
    var v8debug: js.UndefOr[js.Any] = js.native
    
    def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("xdescribe")
    var xdescribe_Original: DescribeBase = js.native
    
    def xit(testName: TestName, fn: TestFn): Unit = js.native
    def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xit")
    var xit_Original: ItBase = js.native
    
    def xtest(testName: TestName, fn: TestFn): Unit = js.native
    def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xtest")
    var xtest_Original: ItBase = js.native
  }
  
  @js.native
  trait GlobalAdditions extends TestFrameworkGlobals {
    
    var __coverage__ : CoverageMapData = js.native
    
    def fail(): Unit = js.native
    
    var jasmine: Jasmine = js.native
    
    def pending(): Unit = js.native
    
    def spyOn(): Unit = js.native
    
    def spyOnProperty(): Unit = js.native
  }
  
  type HookBase = js.Function2[/* fn */ HookFn, /* timeout */ js.UndefOr[Double], Unit]
  
  type HookFn = TestFn
  
  @js.native
  trait It extends ItBase {
    
    def only(testName: TestName, fn: TestFn): Unit = js.native
    def only(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("only")
    var only_Original: ItBase = js.native
    
    def skip(testName: TestName, fn: TestFn): Unit = js.native
    def skip(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("skip")
    var skip_Original: ItBase = js.native
    
    def todo(testName: TestName): Unit = js.native
  }
  
  @js.native
  trait ItBase extends StObject {
    
    def apply(testName: TestName, fn: TestFn): Unit = js.native
    def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    
    var each: Each[TestFn] = js.native
  }
  
  @js.native
  trait ItConcurrent extends It {
    
    def concurrent(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def concurrent(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("concurrent")
    var concurrent_Original: ItConcurrentExtended = js.native
  }
  
  @js.native
  trait ItConcurrentBase extends StObject {
    
    def apply(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def apply(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    
    var each: Each[ConcurrentTestFn] = js.native
  }
  
  @js.native
  trait ItConcurrentExtended extends ItConcurrentBase {
    
    def only(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def only(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("only")
    var only_Original: ItConcurrentBase = js.native
    
    def skip(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def skip(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("skip")
    var skip_Original: ItConcurrentBase = js.native
  }
  
  @js.native
  trait Jasmine extends StObject {
    
    var _DEFAULT_TIMEOUT_INTERVAL: js.UndefOr[Double] = js.native
    
    def addMatchers(matchers: Record[String, _]): Unit = js.native
  }
  object Jasmine {
    
    @scala.inline
    def apply(addMatchers: Record[String, _] => Unit): Jasmine = {
      val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
      __obj.asInstanceOf[Jasmine]
    }
    
    @scala.inline
    implicit class JasmineMutableBuilder[Self <: Jasmine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMatchers(value: Record[String, _] => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_DEFAULT_TIMEOUT_INTERVAL(value: Double): Self = StObject.set(x, "_DEFAULT_TIMEOUT_INTERVAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_DEFAULT_TIMEOUT_INTERVALUndefined: Self = StObject.set(x, "_DEFAULT_TIMEOUT_INTERVAL", js.undefined)
    }
  }
  
  type Row = js.Array[Col]
  
  type Table = js.Array[Row]
  
  type TemplateData = js.Array[js.Any]
  
  type TemplateTable = TemplateStringsArray
  
  type TestCallback = BlockFn | TestFn | ConcurrentTestFn
  
  type TestFn = js.Function1[
    /* done */ js.UndefOr[DoneFn], 
    js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  ]
  
  @js.native
  trait TestFrameworkGlobals extends StObject {
    
    def afterAll(fn: HookFn): Unit = js.native
    def afterAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterAll")
    var afterAll_Original: HookBase = js.native
    
    def afterEach(fn: HookFn): Unit = js.native
    def afterEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("afterEach")
    var afterEach_Original: HookBase = js.native
    
    def beforeAll(fn: HookFn): Unit = js.native
    def beforeAll(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeAll")
    var beforeAll_Original: HookBase = js.native
    
    def beforeEach(fn: HookFn): Unit = js.native
    def beforeEach(fn: HookFn, timeout: Double): Unit = js.native
    @JSName("beforeEach")
    var beforeEach_Original: HookBase = js.native
    
    def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("describe")
    var describe_Original: Describe = js.native
    
    def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("fdescribe")
    var fdescribe_Original: DescribeBase = js.native
    
    def fit(testName: TestName, fn: TestFn): Unit = js.native
    def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("fit")
    var fit_Original: ItBaseconcurrentItConcurr = js.native
    
    def it(testName: TestName, fn: TestFn): Unit = js.native
    def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("it")
    var it_Original: ItConcurrent = js.native
    
    def test(testName: TestName, fn: TestFn): Unit = js.native
    def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("test")
    var test_Original: ItConcurrent = js.native
    
    def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("xdescribe")
    var xdescribe_Original: DescribeBase = js.native
    
    def xit(testName: TestName, fn: TestFn): Unit = js.native
    def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xit")
    var xit_Original: ItBase = js.native
    
    def xtest(testName: TestName, fn: TestFn): Unit = js.native
    def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("xtest")
    var xtest_Original: ItBase = js.native
  }
  
  type TestName = String
}
