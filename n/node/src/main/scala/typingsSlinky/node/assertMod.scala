package typingsSlinky.node

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.anon.Actual
import typingsSlinky.node.anon.DeepEqual
import typingsSlinky.node.nodeStrings.ERR_ASSERTION
import typingsSlinky.node.nodeStrings.deepEqual
import typingsSlinky.node.nodeStrings.deepStrictEqual
import typingsSlinky.node.nodeStrings.equal
import typingsSlinky.node.nodeStrings.ifError
import typingsSlinky.node.nodeStrings.notDeepEqual
import typingsSlinky.node.nodeStrings.notEqual
import typingsSlinky.node.nodeStrings.ok
import typingsSlinky.node.nodeStrings.strictEqual
import typingsSlinky.std.Error
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  /** An alias of `assert.ok()`. */
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = js.native
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var code: ERR_ASSERTION = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: java.lang.String = js.native
  }
  
  @JSImport("assert", "CallTracker")
  @js.native
  class CallTracker () extends StObject {
    
    def calls(): js.Function0[Unit] = js.native
    def calls(exact: Double): js.Function0[Unit] = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func, exact: Double): Func = js.native
    def calls[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: js.UndefOr[scala.Nothing], exact: Double): Func = js.native
    @JSName("calls")
    def calls_Func_Function1AnyWildcard_Func[Func /* <: js.Function1[/* repeated */ js.Any, _] */](): Func = js.native
    
    def report(): js.Array[CallTrackerReportInformation] = js.native
    
    def verify(): Unit = js.native
  }
  
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  @JSImport("assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  @JSImport("assert", "doesNotMatch")
  @js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
  
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_]): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.Function): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "doesNotReject")
  @js.native
  def doesNotReject(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_]): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: java.lang.String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: js.Error): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp, message: java.lang.String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp, message: js.Error): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], message: java.lang.String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[_], message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("assert", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: java.lang.String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error, operator: java.lang.String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(message: js.Error): scala.Nothing = js.native
  
  @JSImport("assert", "ifError")
  @js.native
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = js.native
  
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any, message: java.lang.String): /* asserts value */ Boolean = js.native
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_]): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  @JSImport("assert", "rejects")
  @js.native
  def rejects(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  @JSImport("assert", "strict")
  @js.native
  val strict: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ _, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | typingsSlinky.node.nodeStrings.strict
  ]) with DeepEqual = js.native
  
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: java.lang.String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_]): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: java.lang.String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: js.Error): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_], message: java.lang.String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[_], message: js.Error): Unit = js.native
  
  type AssertPredicate = js.RegExp | Instantiable0[js.Object] | (js.Function1[/* thrown */ js.Any, Boolean]) | js.Object | js.Error
  
  @js.native
  trait CallTrackerReportInformation extends StObject {
    
    /** The actual number of times the function was called. */
    var actual: Double = js.native
    
    /** The number of times the function was expected to be called. */
    var expected: Double = js.native
    
    var message: java.lang.String = js.native
    
    /** The name of the function that is wrapped. */
    var operator: java.lang.String = js.native
    
    /** A stack trace of the function. */
    var stack: js.Object = js.native
  }
  object CallTrackerReportInformation {
    
    @scala.inline
    def apply(
      actual: Double,
      expected: Double,
      message: java.lang.String,
      operator: java.lang.String,
      stack: js.Object
    ): CallTrackerReportInformation = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallTrackerReportInformation]
    }
    
    @scala.inline
    implicit class CallTrackerReportInformationMutableBuilder[Self <: CallTrackerReportInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: java.lang.String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Object): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  @JSImport("assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  @JSImport("assert", "match")
  @js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
}
