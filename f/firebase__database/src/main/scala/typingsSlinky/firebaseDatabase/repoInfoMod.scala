package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/RepoInfo", JSImport.Namespace)
@js.native
object repoInfoMod extends js.Object {
  
  @js.native
  class RepoInfo protected () extends js.Object {
    /**
      * @param {string} host Hostname portion of the url for the repo
      * @param {boolean} secure Whether or not this repo is accessed over ssl
      * @param {string} namespace The namespace represented by the repo
      * @param {boolean} webSocketOnly Whether to prefer websockets over all other transports (used by Nest).
      * @param {string=} persistenceKey Override the default session persistence storage key
      */
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean) = this()
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean, persistenceKey: String) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      persistenceKey: js.UndefOr[scala.Nothing],
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    
    /**
      * Returns the websocket URL for this repo
      * @param {string} type of connection
      * @param {Object} params list
      * @return {string} The URL for this repo
      */
    def connectionURL(`type`: String, params: StringDictionary[String]): String = js.native
    
    var domain: String = js.native
    
    var host: String = js.native
    
    var includeNamespaceInQueryParams: Boolean = js.native
    
    var internalHost: String = js.native
    
    def isCacheableHost(): Boolean = js.native
    
    def isCustomHost(): Boolean = js.native
    
    def isDemoHost(): Boolean = js.native
    
    var namespace: String = js.native
    
    def needsQueryParam(): Boolean = js.native
    
    var persistenceKey: String = js.native
    
    var secure: Boolean = js.native
    
    /** @return {string} */
    def toURLString(): String = js.native
    
    def updateHost(newHost: String): Unit = js.native
    
    var webSocketOnly: Boolean = js.native
  }
}
