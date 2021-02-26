package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typingsSlinky.firebaseDatabase.queryMod.Query
import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import typingsSlinky.firebaseDatabase.serverActionsMod.ServerActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyRestClientMod {
  
  @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient")
  @js.native
  class ReadonlyRestClient protected () extends ServerActions {
    /**
      * @param {!RepoInfo} repoInfo_ Data about the namespace we are connecting to
      * @param {function(string, *, boolean, ?number)} onDataUpdate_ A callback for new data from the server
      * @param {AuthTokenProvider} authTokenProvider_
      * @implements {ServerActions}
      */
    def this(
      repoInfo_ : RepoInfo,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    
    var authTokenProvider_ : js.Any = js.native
    
    /**
      * We don't actually need to track listens, except to prevent us calling an onComplete for a listen
      * that's been removed. :-/
      *
      * @private {!Object.<string, !Object>}
      */
    var listens_ : js.Any = js.native
    
    /** @private {function(...[*])} */
    var log_ : js.Any = js.native
    
    var onDataUpdate_ : js.Any = js.native
    
    var repoInfo_ : js.Any = js.native
    
    /**
      * Performs a REST request to the given path, with the provided query string parameters,
      * and any auth credentials we have.
      *
      * @param {!string} pathString
      * @param {!Object.<string, *>} queryStringParameters
      * @param {?function(?number, *=)} callback
      * @private
      */
    var restRequest_ : js.Any = js.native
  }
  /* static members */
  object ReadonlyRestClient {
    
    /**
      * @param {!Query} query
      * @param {?number=} tag
      * @return {string}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient.getListenId_")
    @js.native
    def getListenId_(query: Query): String = js.native
    @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient.getListenId_")
    @js.native
    def getListenId_(query: Query, tag: Double): String = js.native
  }
}
