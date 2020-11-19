package typingsSlinky.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet-geosearch", "BaseProvider")
@js.native
class BaseProvider[ProviderOptions, Raw] () extends js.Object {
  def this(options: ProviderOptions) = this()
  
  def search(options: SearchQuery): js.Promise[js.Array[SearchResult[Raw]]] = js.native
}
