package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebSocket
import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import typingsSlinky.firebaseDatabase.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketConnectionMod {
  
  @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection")
  @js.native
  class WebSocketConnection protected () extends Transport {
    /**
      * @param connId identifier for this transport
      * @param repoInfo The info for the websocket endpoint.
      * @param applicationId The Firebase App ID for this project.
      * @param transportSessionId Optional transportSessionId if this is connecting to an existing transport
      *                                         session
      * @param lastSessionId Optional lastSessionId if there was a previous connection
      */
    def this(connId: String, repoInfo: RepoInfo) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: String
    ) = this()
    def this(connId: String, repoInfo: RepoInfo, applicationId: String, transportSessionId: String) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: js.UndefOr[scala.Nothing],
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: js.UndefOr[scala.Nothing],
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      transportSessionId: js.UndefOr[scala.Nothing],
      lastSessionId: String
    ) = this()
    def this(
      connId: String,
      repoInfo: RepoInfo,
      applicationId: String,
      transportSessionId: String,
      lastSessionId: String
    ) = this()
    
    var appendFrame_ : js.Any = js.native
    
    var applicationId: js.Any = js.native
    
    var connURL: String = js.native
    
    var everConnected_ : js.Any = js.native
    
    /**
      * Attempts to parse a frame count out of some text. If it can't, assumes a value of 1
      * @param {!String} data
      * @return {?String} Any remaining data to be process, or null if there is none
      * @private
      */
    var extractFrameCount_ : js.Any = js.native
    
    var frames: js.Array[String] | Null = js.native
    
    /**
      * Process a websocket frame that has arrived from the server.
      * @param mess The frame data
      */
    def handleIncomingFrame(mess: StringDictionary[js.Any]): Unit = js.native
    
    /**
      * @param {number} frameCount The number of frames we are expecting from the server
      * @private
      */
    var handleNewFrameCount_ : js.Any = js.native
    
    var isClosed_ : js.Any = js.native
    
    var keepaliveTimer: Double | Null = js.native
    
    var log_ : js.Any = js.native
    
    var mySock: WebSocket | Null = js.native
    
    var nodeAdmin: js.Any = js.native
    
    var onClosed_ : js.Any = js.native
    
    def onDisconnect(): Unit = js.native
    def onDisconnect(a: Boolean): Unit = js.native
    
    def onMessage(msg: js.Object): Unit = js.native
    
    /**
      * Kill the current keepalive timer and start a new one, to ensure that it always fires N seconds after
      * the last activity.
      */
    def resetKeepAlive(): Unit = js.native
    
    /**
      * Send a string over the websocket.
      *
      * @param {string} str String to send.
      * @private
      */
    var sendString_ : js.Any = js.native
    
    var shutdown_ : js.Any = js.native
    
    var stats_ : js.Any = js.native
    
    var totalFrames: Double = js.native
  }
  /* static members */
  object WebSocketConnection {
    
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {RepoInfo} repoInfo The info for the websocket endpoint.
      * @param {string=} transportSessionId Optional transportSessionId if this is connecting to an existing transport
      *                                         session
      * @param {string=} lastSessionId Optional lastSessionId if there was a previous connection
      * @return {string} connection url
      * @private
      */
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.connectionURL_")
    @js.native
    def connectionURL_ : js.Any = js.native
    @scala.inline
    def connectionURL__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionURL_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.forceDisallow")
    @js.native
    def forceDisallow(): Unit = js.native
    
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.forceDisallow_")
    @js.native
    def forceDisallow_ : Boolean = js.native
    @scala.inline
    def forceDisallow__=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceDisallow_")(x.asInstanceOf[js.Any])
    
    /**
      * Time to wait for the connection te become healthy before giving up.
      * @type {number}
      */
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.healthyTimeout")
    @js.native
    def healthyTimeout: Double = js.native
    @scala.inline
    def healthyTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("healthyTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
    
    /**
      * Returns true if we previously failed to connect with this transport.
      * @return {boolean}
      */
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.previouslyFailed")
    @js.native
    def previouslyFailed(): Boolean = js.native
    
    /**
      * Number of response before we consider the connection "healthy."
      * @type {number}
      */
    @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "WebSocketConnection.responsesRequiredToBeHealthy")
    @js.native
    def responsesRequiredToBeHealthy: Double = js.native
    @scala.inline
    def responsesRequiredToBeHealthy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("responsesRequiredToBeHealthy")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/realtime/WebSocketConnection", "setWebSocketImpl")
  @js.native
  def setWebSocketImpl(impl: js.Any): Unit = js.native
}
