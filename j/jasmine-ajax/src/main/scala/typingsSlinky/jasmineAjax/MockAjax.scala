package typingsSlinky.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MockAjax")
@js.native
class MockAjax protected () extends js.Object {
  def this(globals: js.Any) = this()
  var requests: JasmineAjaxRequestTracker = js.native
  var stubs: JasmineAjaxStubTracker = js.native
  def addCustomParamParser(parser: JasmineAjaxParamParser): Unit = js.native
  def install(): Unit = js.native
  def stubRequest(url: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: js.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: js.RegExp, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: js.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: js.RegExp, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: js.RegExp, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: js.RegExp, data: js.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: js.RegExp, data: js.RegExp, method: String): JasmineAjaxRequestStub = js.native
  def uninstall(): Unit = js.native
  def withMock(closure: js.Function0[Unit]): Unit = js.native
}

