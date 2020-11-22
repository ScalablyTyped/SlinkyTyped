package typingsSlinky.electron.rendererMod.remote

import typingsSlinky.electron.Electron.ClientRequestConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron/renderer", "remote.ClientRequest")
@js.native
class ClientRequest protected ()
  extends typingsSlinky.electron.Electron.ClientRequest {
  def this(options: String) = this()
  /**
    * ClientRequest
    */
  def this(options: ClientRequestConstructorOptions) = this()
}
