package typingsSlinky.easyXapiSupertest.supertestMod

import typingsSlinky.easyXapiSupertest.superagentMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends Request[Test] {
  var url: String = js.native
  def expect(body: String): Test = js.native
  def expect(body: String, callback: CallbackHandler): Test = js.native
  def expect(body: js.Object): Test = js.native
  def expect(body: js.Object, callback: CallbackHandler): Test = js.native
  def expect(body: js.RegExp): Test = js.native
  def expect(body: js.RegExp, callback: CallbackHandler): Test = js.native
  def expect(checker: js.Function1[/* res */ Response, _]): Test = js.native
  def expect(field: String, `val`: String): Test = js.native
  def expect(field: String, `val`: String, callback: CallbackHandler): Test = js.native
  def expect(field: String, `val`: js.RegExp): Test = js.native
  def expect(field: String, `val`: js.RegExp, callback: CallbackHandler): Test = js.native
  def expect(status: Double): Test = js.native
  def expect(status: Double, body: String): Test = js.native
  def expect(status: Double, body: String, callback: CallbackHandler): Test = js.native
  def expect(status: Double, callback: CallbackHandler): Test = js.native
  def serverAddress(app: js.Any, path: String): String = js.native
}

