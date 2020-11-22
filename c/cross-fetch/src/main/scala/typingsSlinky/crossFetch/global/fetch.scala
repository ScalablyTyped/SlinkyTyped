package typingsSlinky.crossFetch.global

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_fetch")
@js.native
object fetch extends js.Object {
  
  def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
}
