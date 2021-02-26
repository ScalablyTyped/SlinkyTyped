package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByKeysResults[K, D] extends StObject {
  
  var fetchParameters: FetchByKeysParameters[K] = js.native
  
  var results: Map[K, Item[K, D]] = js.native
}
object FetchByKeysResults {
  
  @scala.inline
  def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
  
  @scala.inline
  implicit class FetchByKeysResultsMutableBuilder[Self <: FetchByKeysResults[_, _], K, D] (val x: Self with (FetchByKeysResults[K, D])) extends AnyVal {
    
    @scala.inline
    def setFetchParameters(value: FetchByKeysParameters[K]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: Map[K, Item[K, D]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
