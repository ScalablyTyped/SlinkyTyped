package typingsSlinky.rcVirtualList

import typingsSlinky.react.mod.ReactText
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMapMod {
  
  @JSImport("rc-virtual-list/es/utils/CacheMap", JSImport.Default)
  @js.native
  class default () extends CacheMap
  
  @js.native
  trait CacheMap extends StObject {
    
    def get(key: ReactText): Double = js.native
    
    var maps: Record[String, Double] = js.native
    
    def set(key: ReactText, value: Double): Unit = js.native
  }
  object CacheMap {
    
    @scala.inline
    def apply(get: ReactText => Double, maps: Record[String, Double], set: (ReactText, Double) => Unit): CacheMap = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), maps = maps.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheMap]
    }
    
    @scala.inline
    implicit class CacheMapMutableBuilder[Self <: CacheMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: ReactText => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaps(value: Record[String, Double]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (ReactText, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
