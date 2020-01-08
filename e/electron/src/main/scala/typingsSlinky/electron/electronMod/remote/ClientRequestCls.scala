package typingsSlinky.electron.electronMod.remote

import typingsSlinky.electron.Electron.ClientRequest
import typingsSlinky.electron.electronStrings.host
import typingsSlinky.electron.electronStrings.hostname
import typingsSlinky.electron.electronStrings.method
import typingsSlinky.electron.electronStrings.partition
import typingsSlinky.electron.electronStrings.path
import typingsSlinky.electron.electronStrings.port
import typingsSlinky.electron.electronStrings.protocol
import typingsSlinky.electron.electronStrings.redirect
import typingsSlinky.electron.electronStrings.session
import typingsSlinky.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote.ClientRequest")
@js.native
class ClientRequestCls protected () extends ClientRequest {
  def this(options: method | url | session | partition | protocol | host | hostname | port | path | redirect) = this()
}

