package typingsSlinky.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.tcp
  - typings.fridaDashGum.fridaDashGumStrings.udp
  - typings.fridaDashGum.fridaDashGumStrings.tcp6
  - typings.fridaDashGum.fridaDashGumStrings.udp6
  - typings.fridaDashGum.fridaDashGumStrings.unixColonstream
  - typings.fridaDashGum.fridaDashGumStrings.unixColondgram
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsSlinky.fridaDashGum.fridaDashGumStrings.tcp = this.cast("tcp")
  @scala.inline
  def tcp6: typingsSlinky.fridaDashGum.fridaDashGumStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def udp: typingsSlinky.fridaDashGum.fridaDashGumStrings.udp = this.cast("udp")
  @scala.inline
  def udp6: typingsSlinky.fridaDashGum.fridaDashGumStrings.udp6 = this.cast("udp6")
  @scala.inline
  def unixColondgram: typingsSlinky.fridaDashGum.fridaDashGumStrings.unixColondgram = this.cast("unix:dgram")
  @scala.inline
  def unixColonstream: typingsSlinky.fridaDashGum.fridaDashGumStrings.unixColonstream = this.cast("unix:stream")
}

