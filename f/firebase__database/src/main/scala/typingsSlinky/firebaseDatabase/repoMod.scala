package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typingsSlinky.firebaseDatabase.databaseMod.Database
import typingsSlinky.firebaseDatabase.eventRegistrationMod.EventRegistration
import typingsSlinky.firebaseDatabase.miscMod.Indexable
import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.persistentConnectionMod.PersistentConnection
import typingsSlinky.firebaseDatabase.queryMod.Query
import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/Repo", JSImport.Namespace)
@js.native
object repoMod extends js.Object {
  
  @js.native
  class Repo protected () extends js.Object {
    def this(
      repoInfo_ : RepoInfo,
      forceRestClient: Boolean,
      app: FirebaseApp,
      authTokenProvider: AuthTokenProvider
    ) = this()
    
    var __database: js.Any = js.native
    
    var abortTransactions_ : js.Any = js.native
    
    def addEventCallbackForQuery(query: Query, eventRegistration: EventRegistration): Unit = js.native
    
    var app: FirebaseApp = js.native
    
    def callOnCompleteCallback(
      callback: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit],
      status: String
    ): Unit = js.native
    def callOnCompleteCallback(
      callback: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit],
      status: String,
      errorReason: String
    ): Unit = js.native
    def callOnCompleteCallback(callback: Null, status: String): Unit = js.native
    def callOnCompleteCallback(callback: Null, status: String, errorReason: String): Unit = js.native
    
    var dataUpdateCount: Double = js.native
    
    def database: Database = js.native
    
    var eventQueue_ : js.Any = js.native
    
    /**
      * Generate ServerValues using some variables from the repo object.
      */
    def generateServerValues(): Indexable = js.native
    
    var getNextWriteId_ : js.Any = js.native
    
    var infoData_ : js.Any = js.native
    
    var infoSyncTree_ : js.Any = js.native
    
    var interceptServerDataCallback_ : js.Any = js.native
    
    def interceptServerData_(): Unit = js.native
    def interceptServerData_(callback: js.Function2[/* a */ String, /* b */ js.Any, _]): Unit = js.native
    
    def interrupt(): Unit = js.native
    
    var log_ : js.Any = js.native
    
    /**
      * @return The namespace represented by the repo.
      */
    def name(): String = js.native
    
    var nextWriteId_ : js.Any = js.native
    
    var onConnectStatus_ : js.Any = js.native
    
    /**
      * Called by realtime when we get new messages from the server.
      */
    var onDataUpdate_ : js.Any = js.native
    
    def onDisconnectCancel(path: Path): Unit = js.native
    def onDisconnectCancel(
      path: Path,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def onDisconnectSet(path: Path, value: js.Any): Unit = js.native
    def onDisconnectSet(
      path: Path,
      value: js.Any,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def onDisconnectSetWithPriority(path: Path, value: js.Any, priority: js.Any): Unit = js.native
    def onDisconnectSetWithPriority(
      path: Path,
      value: js.Any,
      priority: js.Any,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def onDisconnectUpdate(path: Path, childrenToMerge: StringDictionary[js.Any]): Unit = js.native
    def onDisconnectUpdate(
      path: Path,
      childrenToMerge: StringDictionary[js.Any],
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    /** A list of data pieces and paths to be set when this client disconnects. */
    var onDisconnect_ : js.Any = js.native
    
    var onServerInfoUpdate_ : js.Any = js.native
    
    var persistentConnection_ : PersistentConnection | Null = js.native
    
    def removeEventCallbackForQuery(query: Query, eventRegistration: EventRegistration): Unit = js.native
    
    var repoInfo_ : RepoInfo = js.native
    
    var rerunTransactions_ : js.Any = js.native
    
    def resume(): Unit = js.native
    
    /**
      * Applies all of the changes stored up in the onDisconnect_ tree.
      */
    var runOnDisconnectEvents_ : js.Any = js.native
    
    var serverSyncTree_ : js.Any = js.native
    
    /**
      * @return The time in milliseconds, taking the server offset into account if we have one.
      */
    def serverTime(): Double = js.native
    
    var server_ : js.Any = js.native
    
    def setWithPriority(path: Path, newVal: js.Any): Unit = js.native
    def setWithPriority(path: Path, newVal: js.Any, newPriority: String): Unit = js.native
    def setWithPriority(
      path: Path,
      newVal: js.Any,
      newPriority: String,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def setWithPriority(path: Path, newVal: js.Any, newPriority: Double): Unit = js.native
    def setWithPriority(
      path: Path,
      newVal: js.Any,
      newPriority: Double,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def setWithPriority(
      path: Path,
      newVal: js.Any,
      newPriority: Null,
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def startTransaction(
      path: Path,
      transactionUpdate: js.Function1[/* a */ js.Any, Unit],
      onComplete: js.Function3[/* a */ js.Error, /* b */ Boolean, /* c */ DataSnapshot, Unit],
      applyLocally: Boolean
    ): Unit = js.native
    def startTransaction(
      path: Path,
      transactionUpdate: js.Function1[/* a */ js.Any, Unit],
      onComplete: Null,
      applyLocally: Boolean
    ): Unit = js.native
    
    def stats(): Unit = js.native
    def stats(showDelta: Boolean): Unit = js.native
    
    def statsIncrementCounter(metric: String): Unit = js.native
    
    var statsListener_ : js.Any = js.native
    
    var statsReporter_ : js.Any = js.native
    
    var stats_ : js.Any = js.native
    
    var transactionsInit_ : js.Any = js.native
    
    def update(path: Path, childrenToMerge: StringDictionary[js.Any]): Unit = js.native
    def update(
      path: Path,
      childrenToMerge: StringDictionary[js.Any],
      onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    var updateInfo_ : js.Any = js.native
  }
}
