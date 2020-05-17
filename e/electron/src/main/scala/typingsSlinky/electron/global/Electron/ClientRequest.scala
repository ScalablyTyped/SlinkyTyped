package typingsSlinky.electron.global.Electron

import typingsSlinky.electron.electronStrings.host
import typingsSlinky.electron.electronStrings.hostname
import typingsSlinky.electron.electronStrings.method
import typingsSlinky.electron.electronStrings.partition
import typingsSlinky.electron.electronStrings.path
import typingsSlinky.electron.electronStrings.port
import typingsSlinky.electron.electronStrings.redirect
import typingsSlinky.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.ClientRequest")
@js.native
class ClientRequest protected ()
  extends typingsSlinky.electron.Electron.ClientRequest {
  def this(options: method | url | typingsSlinky.electron.electronStrings.session | partition | typingsSlinky.electron.electronStrings.protocol | host | hostname | port | path | redirect) = this()
}

