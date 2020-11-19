package typingsSlinky.ibmMobilefirst.global

import typingsSlinky.ibmMobilefirst.WLAuthorizationManager.RequestObject
import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WLAuthorizationManager")
@js.native
object WLAuthorizationManager extends js.Object {
  
  /**
    * AuthorizationPersistencePolicy possible values
    */
  var ALWAYS: String = js.native
  
  var NEVER: String = js.native
  
  def addCachedAuthorizationHeader(request: RequestObject): JQueryDeferred[RequestObject] = js.native
  
  def getAppIdentity(): JQueryDeferred[_] = js.native
  
  def getAuthorizationScope(responseAuthenticationHeader: String): String = js.native
  
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getCachedAuthorizationHeader(): JQueryDeferred[_] = js.native
  
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getDeviceIdentity(): JQueryDeferred[_] = js.native
  
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<data, error>()
    */
  def getUserIdentity(): JQueryDeferred[_] = js.native
  
  def isAuthorizationRequired(responseStatus: Double, responseAuthenticationHeader: String): Boolean = js.native
  
  /**
    * TODO: Set Promise types. Should be something like: JQueryDeferred<header, error>()
    */
  def obtainAuthorizationHeader(scope: String): JQueryDeferred[_] = js.native
  
  /**
    * See WLAuthorizarionManager.NEVER and WLAuthorizarionManager.ALWAYS
    */
  def setAuthorizationPersistencePolicy(authorizationPersistencePolicy: String): Unit = js.native
}
