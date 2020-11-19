package typingsSlinky.nano.anon

import typingsSlinky.nano.mod.Callback
import typingsSlinky.nano.mod.DatabaseCreateResponse
import typingsSlinky.nano.mod.DatabaseGetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends js.Object {
  
  def disable(id: String, rev: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
  def disable(id: String, rev: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
  
  def enable(source: String, target: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
  def enable(source: String, target: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
  
  def query(id: String, opts0: js.Object): js.Promise[DatabaseGetResponse] = js.native
  def query(id: String, opts0: js.Object, callback0: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
}
