package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.tcp
  - typingsSlinky.fridaGum.fridaGumStrings.udp
  - typingsSlinky.fridaGum.fridaGumStrings.tcp6
  - typingsSlinky.fridaGum.fridaGumStrings.udp6
  - typingsSlinky.fridaGum.fridaGumStrings.unixColonstream
  - typingsSlinky.fridaGum.fridaGumStrings.unixColondgram
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsSlinky.fridaGum.fridaGumStrings.tcp = this.cast("tcp")
  @scala.inline
  def tcp6: typingsSlinky.fridaGum.fridaGumStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def udp: typingsSlinky.fridaGum.fridaGumStrings.udp = this.cast("udp")
  @scala.inline
  def udp6: typingsSlinky.fridaGum.fridaGumStrings.udp6 = this.cast("udp6")
  @scala.inline
  def unixColondgram: typingsSlinky.fridaGum.fridaGumStrings.unixColondgram = this.cast("unix:dgram")
  @scala.inline
  def unixColonstream: typingsSlinky.fridaGum.fridaGumStrings.unixColonstream = this.cast("unix:stream")
}

