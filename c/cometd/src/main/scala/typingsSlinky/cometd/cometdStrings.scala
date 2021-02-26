package typingsSlinky.cometd

import typingsSlinky.cometd.mod.ConnectionType
import typingsSlinky.cometd.mod.ReconnectAdvice
import typingsSlinky.cometd.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cometdStrings {
  
  @js.native
  sealed trait `callback-polling` extends ConnectionType
  @scala.inline
  def `callback-polling`: `callback-polling` = "callback-polling".asInstanceOf[`callback-polling`]
  
  @js.native
  sealed trait connected extends Status
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting extends Status
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait debug extends StObject
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait disconnected extends Status
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting extends Status
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait flash extends ConnectionType
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  
  @js.native
  sealed trait handshake extends ReconnectAdvice
  @scala.inline
  def handshake: handshake = "handshake".asInstanceOf[handshake]
  
  @js.native
  sealed trait handshaking extends Status
  @scala.inline
  def handshaking: handshaking = "handshaking".asInstanceOf[handshaking]
  
  @js.native
  sealed trait iframe extends ConnectionType
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait info extends StObject
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `long-polling` extends ConnectionType
  @scala.inline
  def `long-polling`: `long-polling` = "long-polling".asInstanceOf[`long-polling`]
  
  @js.native
  sealed trait none extends ReconnectAdvice
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait retry extends ReconnectAdvice
  @scala.inline
  def retry: retry = "retry".asInstanceOf[retry]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
