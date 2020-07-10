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
  def this(options: host) = this()
  def this(options: hostname) = this()
  def this(options: method) = this()
  def this(options: partition) = this()
  def this(options: path) = this()
  def this(options: port) = this()
  def this(options: typingsSlinky.electron.electronStrings.protocol) = this()
  def this(options: redirect) = this()
  def this(options: typingsSlinky.electron.electronStrings.session) = this()
  def this(options: url) = this()
}

