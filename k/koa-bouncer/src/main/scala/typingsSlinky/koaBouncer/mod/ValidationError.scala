package typingsSlinky.koaBouncer.mod

import typingsSlinky.koaBouncer.anon.Key
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-bouncer", "ValidationError")
@js.native
class ValidationError protected () extends Error {
  def this(key: String, message: String) = this()
  
  var bouncer: Key = js.native
}
