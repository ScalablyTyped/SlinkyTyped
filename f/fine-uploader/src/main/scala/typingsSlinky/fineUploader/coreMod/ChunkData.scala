package typingsSlinky.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkData extends StObject {
  
  /**
    * the last byte of the current chunk
    */
  var endByte: Double = js.native
  
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: Double = js.native
  
  /**
    * the byte offset of the current chunk
    */
  var startByte: Double = js.native
  
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: Double = js.native
}
object ChunkData {
  
  @scala.inline
  def apply(endByte: Double, partIndex: Double, startByte: Double, totalParts: Double): ChunkData = {
    val __obj = js.Dynamic.literal(endByte = endByte.asInstanceOf[js.Any], partIndex = partIndex.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any], totalParts = totalParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkData]
  }
  
  @scala.inline
  implicit class ChunkDataMutableBuilder[Self <: ChunkData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndByte(value: Double): Self = StObject.set(x, "endByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartIndex(value: Double): Self = StObject.set(x, "partIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartByte(value: Double): Self = StObject.set(x, "startByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalParts(value: Double): Self = StObject.set(x, "totalParts", value.asInstanceOf[js.Any])
  }
}
