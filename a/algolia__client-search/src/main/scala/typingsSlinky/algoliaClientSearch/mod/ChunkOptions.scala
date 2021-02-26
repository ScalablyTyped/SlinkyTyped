package typingsSlinky.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkOptions extends StObject {
  
  /**
    * The number of objects per batch.
    */
  val batchSize: js.UndefOr[Double] = js.native
}
object ChunkOptions {
  
  @scala.inline
  def apply(): ChunkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkOptions]
  }
  
  @scala.inline
  implicit class ChunkOptionsMutableBuilder[Self <: ChunkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}
