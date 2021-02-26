package typingsSlinky.promiseFtpCommon

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-ftp-common", "FtpConnectionError")
  @js.native
  class FtpConnectionError () extends Error
  
  @JSImport("promise-ftp-common", "FtpReconnectError")
  @js.native
  class FtpReconnectError () extends Error {
    def this(disconnectError: String) = this()
    def this(disconnectError: js.Error) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: js.Error) = this()
    def this(disconnectError: String, connectError: String) = this()
    def this(disconnectError: String, connectError: js.Error) = this()
    def this(disconnectError: js.Error, connectError: String) = this()
    def this(disconnectError: js.Error, connectError: js.Error) = this()
    def this(
      disconnectError: js.UndefOr[scala.Nothing],
      connectError: js.UndefOr[scala.Nothing],
      onCwd: Boolean
    ) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: js.Error, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.Error, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: js.Error, onCwd: Boolean) = this()
    
    var connectError: String | js.Error = js.native
    
    var disconnectError: String | js.Error = js.native
  }
  
  @js.native
  sealed trait STATUSES extends StObject
  @JSImport("promise-ftp-common", "STATUSES")
  @js.native
  object STATUSES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES with String] = js.native
    
    @js.native
    sealed trait CONNECTED extends STATUSES
    /* "connected" */ val CONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.CONNECTED with String = js.native
    
    @js.native
    sealed trait CONNECTING extends STATUSES
    /* "connecting" */ val CONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.CONNECTING with String = js.native
    
    @js.native
    sealed trait DISCONNECTED extends STATUSES
    /* "disconnected" */ val DISCONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.DISCONNECTED with String = js.native
    
    @js.native
    sealed trait DISCONNECTING extends STATUSES
    /* "disconnecting" */ val DISCONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.DISCONNECTING with String = js.native
    
    @js.native
    sealed trait LOGGING_OUT extends STATUSES
    /* "logging out" */ val LOGGING_OUT: typingsSlinky.promiseFtpCommon.mod.STATUSES.LOGGING_OUT with String = js.native
    
    @js.native
    sealed trait NOT_YET_CONNECTED extends STATUSES
    /* "not yet connected" */ val NOT_YET_CONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED with String = js.native
    
    @js.native
    sealed trait RECONNECTING extends STATUSES
    /* "reconnecting" */ val RECONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.RECONNECTING with String = js.native
  }
}
