package typingsSlinky.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-storage", "CrossStorageClient")
@js.native
class CrossStorageClient protected () extends js.Object {
  /**
    * Constructs a new cross storage client given the url to a hub. By default, an iframe is created 
    * within the document body that points to the url. It also accepts an options object, which may include 
    * a timeout, frameId, and promise. The timeout, in milliseconds, is applied to each request and defaults 
    * to 5000ms. The options object may also include a frameId, identifying an existing frame on which to 
    * install its listeners. If the promise key is supplied the constructor for a Promise, that Promise 
    * library will be used instead of the default window.Promise.
    */
  def this(hubUrl: String, opts: CrossStorageClientOptions) = this()
  
  /**
    * Returns a promise that, when resolved, passes an array of keys currently in storage.
    */
  def clear(): js.Promise[Unit] = js.native
  
  /**
    * Deletes the iframe and sets the connected state to false. The client can no longer be used after 
    * being invoked.
    */
  def close(): Unit = js.native
  
  /**
    * Accepts one or more keys for deletion. Returns a promise that is settled on hub response or timeout.
    */
  def del(keys: String*): js.Promise[Unit] = js.native
  
  /**
    * Accepts one or more keys for which to retrieve their values. Returns a promise that is settled on 
    * hub response or timeout. On success, it is fulfilled with the value of the key if only passed a 
    * single argument. Otherwise it's resolved with an array of values. On failure, it is rejected with 
    * the corresponding error message.
    */
  def get(key: String): js.Promise[_] = js.native
  def get(keys: String*): js.Promise[js.Array[_]] = js.native
  
  /**
    * Returns a promise that, when resolved, passes an array of keys currently in storage.
    */
  def getKeys(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Returns a promise that is fulfilled when a connection has been established with the cross storage 
    * hub. Its use is required to avoid sending any requests prior to initialization being complete.
    */
  def onConnect(): js.Promise[Unit] = js.native
  
  /**
    * Sets a key to the specified value, optionally accepting a ttl to passively expire the key after a 
    * number of milliseconds. Returns a promise that is fulfilled on success, or rejected if any errors 
    * setting the key occurred, or the request timed out.
    */
  def set(key: String, value: js.Any): js.Promise[Unit] = js.native
  def set(key: String, value: js.Any, ttl: Double): js.Promise[Unit] = js.native
}
