package typingsSlinky.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileIndex extends StObject {
  
  var xIndex: Double = js.native
  
  var yIndex: Double = js.native
}
object TileIndex {
  
  @scala.inline
  def apply(xIndex: Double, yIndex: Double): TileIndex = {
    val __obj = js.Dynamic.literal(xIndex = xIndex.asInstanceOf[js.Any], yIndex = yIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileIndex]
  }
  
  @scala.inline
  implicit class TileIndexMutableBuilder[Self <: TileIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXIndex(value: Double): Self = StObject.set(x, "xIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYIndex(value: Double): Self = StObject.set(x, "yIndex", value.asInstanceOf[js.Any])
  }
}
