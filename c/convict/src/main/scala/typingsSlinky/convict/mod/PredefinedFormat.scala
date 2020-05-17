package typingsSlinky.convict.mod

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convict.convictStrings.Asterisk
  - typingsSlinky.convict.convictStrings.int
  - typingsSlinky.convict.convictStrings.port
  - typingsSlinky.convict.convictStrings.windows_named_pipe
  - typingsSlinky.convict.convictStrings.port_or_windows_named_pipe
  - typingsSlinky.convict.convictStrings.url
  - typingsSlinky.convict.convictStrings.email
  - typingsSlinky.convict.convictStrings.ipaddress
  - typingsSlinky.convict.convictStrings.duration
  - typingsSlinky.convict.convictStrings.timestamp
  - typingsSlinky.convict.convictStrings.nat
  - java.lang.String
  - js.Object
  - typingsSlinky.std.Number
  - typingsSlinky.std.RegExp
  - scala.Boolean
*/
trait PredefinedFormat extends js.Object

object PredefinedFormat {
  @scala.inline
  def Asterisk: typingsSlinky.convict.convictStrings.Asterisk = "*".asInstanceOf[typingsSlinky.convict.convictStrings.Asterisk]
  @scala.inline
  def int: typingsSlinky.convict.convictStrings.int = "int".asInstanceOf[typingsSlinky.convict.convictStrings.int]
  @scala.inline
  def port: typingsSlinky.convict.convictStrings.port = "port".asInstanceOf[typingsSlinky.convict.convictStrings.port]
  @scala.inline
  def windows_named_pipe: typingsSlinky.convict.convictStrings.windows_named_pipe = "windows_named_pipe".asInstanceOf[typingsSlinky.convict.convictStrings.windows_named_pipe]
  @scala.inline
  def port_or_windows_named_pipe: typingsSlinky.convict.convictStrings.port_or_windows_named_pipe = "port_or_windows_named_pipe".asInstanceOf[typingsSlinky.convict.convictStrings.port_or_windows_named_pipe]
  @scala.inline
  def url: typingsSlinky.convict.convictStrings.url = "url".asInstanceOf[typingsSlinky.convict.convictStrings.url]
  @scala.inline
  def email: typingsSlinky.convict.convictStrings.email = "email".asInstanceOf[typingsSlinky.convict.convictStrings.email]
  @scala.inline
  def ipaddress: typingsSlinky.convict.convictStrings.ipaddress = "ipaddress".asInstanceOf[typingsSlinky.convict.convictStrings.ipaddress]
  @scala.inline
  def duration: typingsSlinky.convict.convictStrings.duration = "duration".asInstanceOf[typingsSlinky.convict.convictStrings.duration]
  @scala.inline
  def timestamp: typingsSlinky.convict.convictStrings.timestamp = "timestamp".asInstanceOf[typingsSlinky.convict.convictStrings.timestamp]
  @scala.inline
  def nat: typingsSlinky.convict.convictStrings.nat = "nat".asInstanceOf[typingsSlinky.convict.convictStrings.nat]
  @scala.inline
  implicit def apply(value: Boolean): PredefinedFormat = value.asInstanceOf[PredefinedFormat]
  @scala.inline
  implicit def apply(value: Number): PredefinedFormat = value.asInstanceOf[PredefinedFormat]
  @scala.inline
  implicit def apply(value: js.Object): PredefinedFormat = value.asInstanceOf[PredefinedFormat]
  @scala.inline
  implicit def apply(value: js.RegExp): PredefinedFormat = value.asInstanceOf[PredefinedFormat]
  @scala.inline
  implicit def apply(value: String): PredefinedFormat = value.asInstanceOf[PredefinedFormat]
}

