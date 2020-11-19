package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/TileCache", JSImport.Namespace)
@js.native
object tileCacheMod extends js.Object {
  
  @js.native
  trait TileCache
    extends typingsSlinky.ol.lrucacheMod.default[js.Any] {
    
    def expireCache(usedTiles: StringDictionary[Boolean]): Unit = js.native
    
    def pruneExceptNewestZ(): Unit = js.native
  }
  
  @js.native
  class default () extends TileCache
}
