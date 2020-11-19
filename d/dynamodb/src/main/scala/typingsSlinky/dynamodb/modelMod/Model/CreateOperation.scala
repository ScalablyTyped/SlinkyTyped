package typingsSlinky.dynamodb.modelMod.Model

import typingsSlinky.dynamodb.callbackMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOperation extends js.Object {
  
  def apply(doc: js.Any): js.Promise[_] = js.native
  def apply(doc: js.Any, callback: Callback): Unit = js.native
  def apply(doc: js.Any, params: OperationOptions): js.Promise[_] = js.native
  def apply(doc: js.Any, params: OperationOptions, callback: Callback): Unit = js.native
}
