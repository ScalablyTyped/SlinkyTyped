package typingsSlinky.promiseFtpCommon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-ftp-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class FtpConnectionError () extends Error
  
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
  sealed trait STATUSES extends js.Object
  @js.native
  object STATUSES extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES with String] = js.native
    
    @js.native
    sealed trait CONNECTED extends STATUSES
    /* "connected" */ @js.native
    object CONNECTED extends TopLevel[CONNECTED with String]
    
    @js.native
    sealed trait CONNECTING extends STATUSES
    /* "connecting" */ @js.native
    object CONNECTING extends TopLevel[CONNECTING with String]
    
    @js.native
    sealed trait DISCONNECTED extends STATUSES
    /* "disconnected" */ @js.native
    object DISCONNECTED extends TopLevel[DISCONNECTED with String]
    
    @js.native
    sealed trait DISCONNECTING extends STATUSES
    /* "disconnecting" */ @js.native
    object DISCONNECTING extends TopLevel[DISCONNECTING with String]
    
    @js.native
    sealed trait LOGGING_OUT extends STATUSES
    /* "logging out" */ @js.native
    object LOGGING_OUT extends TopLevel[LOGGING_OUT with String]
    
    @js.native
    sealed trait NOT_YET_CONNECTED extends STATUSES
    /* "not yet connected" */ @js.native
    object NOT_YET_CONNECTED extends TopLevel[NOT_YET_CONNECTED with String]
    
    @js.native
    sealed trait RECONNECTING extends STATUSES
    /* "reconnecting" */ @js.native
    object RECONNECTING extends TopLevel[RECONNECTING with String]
  }
}
