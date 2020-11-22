package typingsSlinky.firebase.mod.firebase.storage

import typingsSlinky.firebase.mod.firebase.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Firebase Storage service interface.
  *
  * Do not call this constructor directly. Instead, use
  * {@link firebase.storage `firebase.storage()`}.
  *
  * See
  * {@link
  *   https://firebase.google.com/docs/storage/web/start/
  *   Get Started on Web}
  * for a full guide on how to use the Firebase Storage service.
  */
@js.native
trait Storage extends js.Object {
  
  /**
    * The {@link firebase.app.App app} associated with the `Storage` service
    * instance.
    *
    * @example
    * ```javascript
    * var app = storage.app;
    * ```
    */
  var app: App = js.native
  
  /**
    * The maximum time to retry operations other than uploads or downloads in
    * milliseconds.
    */
  var maxOperationRetryTime: Double = js.native
  
  /**
    * The maximum time to retry uploads in milliseconds.
    */
  var maxUploadRetryTime: Double = js.native
  
  /**
    * Returns a reference for the given path in the default bucket.
    * @param path A relative path to initialize the reference with,
    *     for example `path/to/image.jpg`. If not passed, the returned reference
    *     points to the bucket root.
    * @return A reference for the given path.
    */
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  
  /**
    * Returns a reference for the given absolute URL.
    * @param url A URL in the form: <br />
    *     1) a gs:// URL, for example `gs://bucket/files/image.png` <br />
    *     2) a download URL taken from object metadata. <br />
    *     @see {@link firebase.storage.FullMetadata.prototype.downloadURLs}
    * @return A reference for the given URL.
    */
  def refFromURL(url: String): Reference = js.native
  
  /**
    * @param time The new maximum operation retry time in milliseconds.
    * @see {@link firebase.storage.Storage.prototype.maxOperationRetryTime}
    */
  def setMaxOperationRetryTime(time: Double): js.Any = js.native
  
  /**
    * @param time The new maximum upload retry time in milliseconds.
    * @see {@link firebase.storage.Storage.prototype.maxUploadRetryTime}
    */
  def setMaxUploadRetryTime(time: Double): js.Any = js.native
}
