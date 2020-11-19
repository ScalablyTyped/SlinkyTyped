package typingsSlinky.assert

import typingsSlinky.assert.anon.Actual
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: String): Unit = js.native
  
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def doesNotThrow(block: js.Function0[Unit]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.RegExp): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.RegExp, message: String): Unit = js.native
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = js.native
  
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def fail(): scala.Nothing = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): scala.Nothing = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  def fail(actual: js.Any): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  
  def ifError(value: js.Any): Unit = js.native
  
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def throws(block: js.Function0[Unit]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.RegExp): Unit = js.native
  def throws(block: js.Function0[Unit], error: js.RegExp, message: String): Unit = js.native
  def throws(block: js.Function0[Unit], message: String): Unit = js.native
  
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: String = js.native
  }
}
