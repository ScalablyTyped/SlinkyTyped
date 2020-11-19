package typingsSlinky.needle.mod.core

import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeedleResponse extends IncomingMessage {
  
  var body: js.Any = js.native
  
  var bytes: Double = js.native
  
  var cookies: js.UndefOr[Cookies] = js.native
  
  var raw: Buffer = js.native
}
