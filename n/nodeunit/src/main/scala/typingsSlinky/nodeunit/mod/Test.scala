package typingsSlinky.nodeunit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends js.Object {
  
  def assert(value: js.Any, message: String): Unit = js.native
  
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def doesNotThrow(block: js.Any): Unit = js.native
  def doesNotThrow(block: js.Any, error: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def doesNotThrow(block: js.Any, error: js.Any): Unit = js.native
  def doesNotThrow(block: js.Any, error: js.Any, message: String): Unit = js.native
  
  def done(): Unit = js.native
  def done(err: js.Any): Unit = js.native
  @JSName("done")
  var done_Original: ICallbackFunction = js.native
  
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  //assertion wrappers
  def equals(actual: js.Any, expected: js.Any): Unit = js.native
  def equals(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def expect(num: Double): Unit = js.native
  
  //assersions from node assert module
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  
  def ifError(value: js.Any): Unit = js.native
  
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  
  def same(actual: js.Any, expected: js.Any): Unit = js.native
  def same(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  def throws(block: js.Any): Unit = js.native
  def throws(block: js.Any, error: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def throws(block: js.Any, error: js.Any): Unit = js.native
  def throws(block: js.Any, error: js.Any, message: String): Unit = js.native
}
