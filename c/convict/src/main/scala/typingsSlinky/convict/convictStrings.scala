package typingsSlinky.convict

import typingsSlinky.convict.mod.PredefinedFormat
import typingsSlinky.convict.mod.ValidationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object convictStrings {
  @js.native
  sealed trait Asterisk extends PredefinedFormat
  
  @js.native
  sealed trait InternalSchema extends js.Object
  
  @js.native
  sealed trait Overwrite extends js.Object
  
  @js.native
  sealed trait Schema extends js.Object
  
  @js.native
  sealed trait duration extends PredefinedFormat
  
  @js.native
  sealed trait email extends PredefinedFormat
  
  @js.native
  sealed trait int extends PredefinedFormat
  
  @js.native
  sealed trait ipaddress extends PredefinedFormat
  
  @js.native
  sealed trait nat extends PredefinedFormat
  
  @js.native
  sealed trait port extends PredefinedFormat
  
  @js.native
  sealed trait port_or_windows_named_pipe extends PredefinedFormat
  
  @js.native
  sealed trait strict extends ValidationMethod
  
  @js.native
  sealed trait timestamp extends PredefinedFormat
  
  @js.native
  sealed trait url extends PredefinedFormat
  
  @js.native
  sealed trait warn extends ValidationMethod
  
  @js.native
  sealed trait windows_named_pipe extends PredefinedFormat
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def InternalSchema: InternalSchema = "InternalSchema".asInstanceOf[InternalSchema]
  @scala.inline
  def Overwrite: Overwrite = "Overwrite".asInstanceOf[Overwrite]
  @scala.inline
  def Schema: Schema = "Schema".asInstanceOf[Schema]
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def ipaddress: ipaddress = "ipaddress".asInstanceOf[ipaddress]
  @scala.inline
  def nat: nat = "nat".asInstanceOf[nat]
  @scala.inline
  def port: port = "port".asInstanceOf[port]
  @scala.inline
  def port_or_windows_named_pipe: port_or_windows_named_pipe = "port_or_windows_named_pipe".asInstanceOf[port_or_windows_named_pipe]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def windows_named_pipe: windows_named_pipe = "windows_named_pipe".asInstanceOf[windows_named_pipe]
}

