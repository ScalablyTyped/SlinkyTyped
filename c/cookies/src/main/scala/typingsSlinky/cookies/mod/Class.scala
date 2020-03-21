package typingsSlinky.cookies.mod

import typingsSlinky.keygrip.mod.Keygrip
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookies", JSImport.Namespace)
@js.native
class Class protected () extends Cookies {
  def this(request: IncomingMessage, response: ServerResponse) = this()
  /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def this(request: IncomingMessage, response: ServerResponse, options: js.Array[String]) = this()
  def this(request: IncomingMessage, response: ServerResponse, options: Option) = this()
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def this(request: IncomingMessage, response: ServerResponse, options: Keygrip) = this()
}

