package typingsSlinky.hapi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.catbox.mod.ClientApi
import typingsSlinky.catbox.mod.ClientOptions
import typingsSlinky.catbox.mod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptionsCache
  extends PolicyOptions[js.Any]
     with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
/* s */ StringDictionary[js.Any] {
  
  /** catbox engine object. */
  var engine: js.UndefOr[ClientApi[_]] = js.native
  
  /**
    * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    */
  var name: js.UndefOr[String] = js.native
  
  /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
  var partition: js.UndefOr[String] = js.native
  
  /**
    * a class or a prototype function
    */
  var provider: js.UndefOr[CacheProvider[ClientOptions]] = js.native
  
  /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
  var shared: js.UndefOr[Boolean] = js.native
}
object ServerOptionsCache {
  
  @scala.inline
  def apply(): ServerOptionsCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptionsCache]
  }
  
  @scala.inline
  implicit class ServerOptionsCacheMutableBuilder[Self <: ServerOptionsCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: ClientApi[_]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setProvider(value: CacheProvider[ClientOptions]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
