package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import typingsSlinky.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typingsSlinky.firebaseDatabase.connectionMod.Connection
import typingsSlinky.firebaseDatabase.persistentConnectionMod.PersistentConnection
import typingsSlinky.firebaseDatabase.queryMod.Query
import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testAccessMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "ConnectionTarget")
  @js.native
  class ConnectionTarget protected () extends RepoInfo {
    /**
      * @param host Hostname portion of the url for the repo
      * @param secure Whether or not this repo is accessed over ssl
      * @param namespace The namespace represented by the repo
      * @param webSocketOnly Whether to prefer websockets over all other transports (used by Nest).
      * @param nodeAdmin Whether this instance uses Admin SDK credentials
      * @param persistenceKey Override the default session persistence storage key
      */
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean) = this()
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean, nodeAdmin: Boolean) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: js.UndefOr[scala.Nothing],
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: js.UndefOr[scala.Nothing],
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
  }
  @JSImport("@firebase/database/dist/src/api/test_access", "ConnectionTarget")
  @js.native
  val ConnectionTarget: Instantiable7[
    /* host */ String, 
    /* secure */ Boolean, 
    /* namespace */ String, 
    /* webSocketOnly */ Boolean, 
    /* nodeAdmin */ js.UndefOr[Boolean], 
    /* persistenceKey */ js.UndefOr[String], 
    /* includeNamespaceInQueryParams */ js.UndefOr[Boolean], 
    RepoInfo
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection")
  @js.native
  class DataConnection protected () extends PersistentConnection {
    /**
      * @implements {ServerActions}
      * @param repoInfo_ Data about the namespace we are connecting to
      * @param applicationId_ The Firebase App ID for this project
      * @param onDataUpdate_ A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    def this(
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      onConnectStatus_ : js.Function1[/* a */ Boolean, Unit],
      onServerInfoUpdate_ : js.Function1[/* a */ js.Any, Unit],
      authTokenProvider_ : AuthTokenProvider,
      authOverride_ : js.Object
    ) = this()
  }
  object DataConnection {
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Counter for number of connections created. Mainly used for tagging in the logs
      */
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.nextConnectionId_")
    @js.native
    def nextConnectionId: js.Any = js.native
    
    @scala.inline
    def nextConnectionId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.nextPersistentConnectionId_")
    @js.native
    def nextPersistentConnectionId: js.Any = js.native
    
    @scala.inline
    def nextPersistentConnectionId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextPersistentConnectionId_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/api/test_access", "DataConnection.warnOnListenWarnings_")
    @js.native
    def warnOnListenWarnings: js.Any = js.native
    
    @scala.inline
    def warnOnListenWarnings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warnOnListenWarnings_")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/database/dist/src/api/test_access", "RealTimeConnection")
  @js.native
  class RealTimeConnection protected () extends Connection {
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : js.UndefOr[scala.Nothing],
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    /**
      * @param id - an id for this connection
      * @param repoInfo_ - the info for the endpoint to connect to
      * @param applicationId_ - the Firebase App ID for this project
      * @param onMessage_ - the callback to be triggered when a server-push message arrives
      * @param onReady_ - the callback to be triggered when this connection is ready to send messages.
      * @param onDisconnect_ - the callback to be triggered when a connection was lost
      * @param onKill_ - the callback to be triggered when this connection has permanently shut down.
      * @param lastSessionId - last session id in persistent connection. is used to clean up old session in real-time server
      */
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit]
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : js.UndefOr[scala.Nothing],
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
    def this(
      id: String,
      repoInfo_ : RepoInfo,
      applicationId_ : String,
      onMessage_ : js.Function1[/* a */ js.Object, Unit],
      onReady_ : js.Function2[/* a */ Double, /* b */ String, Unit],
      onDisconnect_ : js.Function0[Unit],
      onKill_ : js.Function1[/* a */ String, Unit],
      lastSessionId: String
    ) = this()
  }
  @JSImport("@firebase/database/dist/src/api/test_access", "RealTimeConnection")
  @js.native
  val RealTimeConnection: Instantiable8[
    /* id */ String, 
    /* repoInfo_ */ RepoInfo, 
    /* applicationId_ */ js.UndefOr[String], 
    /* onMessage_ */ js.Function1[/* a */ js.Object, Unit], 
    /* onReady_ */ js.Function2[/* a */ Double, /* b */ String, Unit], 
    /* onDisconnect_ */ js.Function0[Unit], 
    /* onKill_ */ js.Function1[/* a */ String, Unit], 
    /* lastSessionId */ js.UndefOr[String], 
    Connection
  ] = js.native
  
  @JSImport("@firebase/database/dist/src/api/test_access", "forceRestClient")
  @js.native
  def forceRestClient(forceRestClient: Boolean): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/test_access", "hijackHash")
  @js.native
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit] = js.native
  
  @JSImport("@firebase/database/dist/src/api/test_access", "queryIdentifier")
  @js.native
  def queryIdentifier(query: Query): String = js.native
}
