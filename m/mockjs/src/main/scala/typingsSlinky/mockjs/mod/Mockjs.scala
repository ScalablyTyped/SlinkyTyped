package typingsSlinky.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface for global namespace 'Mockjs'
@js.native
trait Mockjs extends js.Object {
  
  var Random: MockjsRandom = js.native
  
  def mock(rurl: S, rtype: S, template: js.Any): Mockjs = js.native
  def mock(rurl: S, template: js.Any): Mockjs = js.native
  def mock(rurl: js.RegExp, rtype: S, template: js.Any): Mockjs = js.native
  def mock(rurl: js.RegExp, template: js.Any): Mockjs = js.native
  def mock(template: js.Any): js.Any = js.native
  @JSName("mock")
  var mock_Original: MockjsMock = js.native
  
  def setup(settings: MockjsSetupSettings): Unit = js.native
  @JSName("setup")
  var setup_Original: MockjsSetup = js.native
  
  def toJSONSchema(template: js.Any): MockjsToJSONSchemaRs = js.native
  @JSName("toJSONSchema")
  var toJSONSchema_Original: MockjsToJSONSchema = js.native
  
  def valid(template: js.Any, data: js.Any): js.Array[MockjsValidRsItem] = js.native
  @JSName("valid")
  var valid_Original: MockjsValid = js.native
  
  var version: Double = js.native
}
