package typingsSlinky.promiseDashFtpDashCommon

import typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp-common", JSImport.Namespace)
@js.native
object promiseDashFtpDashCommonMod extends js.Object {
  @js.native
  class FtpConnectionError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class FtpReconnectError () extends Error {
    def this(disconnectError: String) = this()
    def this(disconnectError: js.Error) = this()
    def this(disconnectError: String, connectError: String) = this()
    def this(disconnectError: String, connectError: js.Error) = this()
    def this(disconnectError: js.Error, connectError: String) = this()
    def this(disconnectError: js.Error, connectError: js.Error) = this()
    def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.Error, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: js.Error, onCwd: Boolean) = this()
    var connectError: String | js.Error = js.native
    var disconnectError: String | js.Error = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  sealed trait STATUSES extends js.Object
  
  @js.native
  object STATUSES extends js.Object {
    @js.native
    sealed trait CONNECTED extends STATUSES
    
    @js.native
    sealed trait CONNECTING extends STATUSES
    
    @js.native
    sealed trait DISCONNECTED extends STATUSES
    
    @js.native
    sealed trait DISCONNECTING extends STATUSES
    
    @js.native
    sealed trait LOGGING_OUT extends STATUSES
    
    @js.native
    sealed trait NOT_YET_CONNECTED extends STATUSES
    
    @js.native
    sealed trait RECONNECTING extends STATUSES
    
    /* "connected" */ val CONNECTED: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.CONNECTED with String = js.native
    /* "connecting" */ val CONNECTING: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.CONNECTING with String = js.native
    /* "disconnected" */ val DISCONNECTED: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.DISCONNECTED with String = js.native
    /* "disconnecting" */ val DISCONNECTING: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.DISCONNECTING with String = js.native
    /* "logging out" */ val LOGGING_OUT: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.LOGGING_OUT with String = js.native
    /* "not yet connected" */ val NOT_YET_CONNECTED: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.NOT_YET_CONNECTED with String = js.native
    /* "reconnecting" */ val RECONNECTING: typingsSlinky.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.RECONNECTING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES with String] = js.native
  }
  
}

