package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends EventEmitter {
  def request(options: String): ClientRequest = js.native
  // Docs: http://electronjs.org/docs/api/net
  /**
    * Creates a ClientRequest instance using the provided options which are directly
    * forwarded to the ClientRequest constructor. The net.request method would be used
    * to issue both secure and insecure HTTP requests according to the specified
    * protocol scheme in the options object.
    */
  def request(options: js.Any): ClientRequest = js.native
}

@JSGlobal("Electron.net")
@js.native
object net extends TopLevel[Net]

