package typingsSlinky.jqueryAjaxfile.Chai

import typingsSlinky.jqueryAjaxfile.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Include extends js.Object {
  
  def apply(value: String): Assertion = js.native
  def apply(value: String, message: String): Assertion = js.native
  def apply(value: Double): Assertion = js.native
  def apply(value: Double, message: String): Assertion = js.native
  def apply(value: Object): Assertion = js.native
  def apply(value: Object, message: String): Assertion = js.native
  
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  @JSName("members")
  var members_Original: Members = js.native
}
