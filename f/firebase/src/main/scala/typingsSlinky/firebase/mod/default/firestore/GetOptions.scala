package typingsSlinky.firebase.mod.default.firestore

import typingsSlinky.firebase.firebaseStrings.cache
import typingsSlinky.firebase.firebaseStrings.default
import typingsSlinky.firebase.firebaseStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptions extends StObject {
  
  /**
    * Describes whether we should get from server or cache.
    *
    * Setting to `default` (or not setting at all), causes Firestore to try to
    * retrieve an up-to-date (server-retrieved) snapshot, but fall back to
    * returning cached data if the server can't be reached.
    *
    * Setting to `server` causes Firestore to avoid the cache, generating an
    * error if the server cannot be reached. Note that the cache will still be
    * updated if the server request succeeds. Also note that latency-compensation
    * still takes effect, so any pending write operations will be visible in the
    * returned data (merged into the server-provided data).
    *
    * Setting to `cache` causes Firestore to immediately return a value from the
    * cache, ignoring the server completely (implying that the returned value
    * may be stale with respect to the value on the server.) If there is no data
    * in the cache to satisfy the `get()` call, `DocumentReference.get()` will
    * return an error and `QuerySnapshot.get()` will return an empty
    * `QuerySnapshot` with no documents.
    */
  val source: js.UndefOr[default | server | cache] = js.native
}
object GetOptions {
  
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  @scala.inline
  implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
