package typingsSlinky.node

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.anon.Actual
import typingsSlinky.node.nodeStrings.ERR_ASSERTION
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", JSImport.Namespace)
@js.native
object assertMod extends js.Object {
  
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: java.lang.String): Unit = js.native
  def apply(value: js.Any, message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use `deepStrictEqual()` instead. */
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  def doesNotMatch(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
  
  def doesNotReject(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.Function, message: js.Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], error: js.RegExp, message: js.Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_]): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: js.Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp, message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.RegExp, message: js.Error): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  def doesNotThrow(block: js.Function0[_]): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.Function, message: js.Error): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp, message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], error: js.RegExp, message: js.Error): Unit = js.native
  def doesNotThrow(block: js.Function0[_], message: java.lang.String): Unit = js.native
  def doesNotThrow(block: js.Function0[_], message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use `strictEqual()` instead. */
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use `fail([message])` or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: js.UndefOr[scala.Nothing],
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Error, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: js.Error,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def fail(message: js.Error): scala.Nothing = js.native
  
  def ifError(value: js.Any): Unit = js.native
  
  def `match`(value: java.lang.String, regExp: js.RegExp): Unit = js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: java.lang.String): Unit = js.native
  def `match`(value: java.lang.String, regExp: js.RegExp, message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use `notDeepStrictEqual()` instead. */
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  /** @deprecated since v9.9.0 - use `notStrictEqual()` instead. */
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: java.lang.String): Unit = js.native
  def ok(value: js.Any, message: js.Error): Unit = js.native
  
  def rejects(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_]): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: AssertPredicate): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], message: java.lang.String): js.Promise[Unit] = js.native
  def rejects(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
  
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  
  def throws(block: js.Function0[_]): Unit = js.native
  def throws(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], error: AssertPredicate, message: js.Error): Unit = js.native
  def throws(block: js.Function0[_], message: java.lang.String): Unit = js.native
  def throws(block: js.Function0[_], message: js.Error): Unit = js.native
  
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var code: ERR_ASSERTION = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: java.lang.String = js.native
  }
  
  type AssertPredicate = js.RegExp | Instantiable0[js.Object] | (js.Function1[/* thrown */ js.Any, Boolean]) | js.Object | js.Error
}
