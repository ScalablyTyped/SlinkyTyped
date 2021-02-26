package typingsSlinky.amapJsApiRiding

import typingsSlinky.amapJsApiRiding.AMap.Riding.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Riding")
    @js.native
    class Riding ()
      extends typingsSlinky.amapJsApiRiding.AMap.Riding {
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.RidingPolicy")
    @js.native
    object RidingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.amapJsApiRiding.AMap.RidingPolicy with Double] = js.native
      
      /* 0 */ val DEFAULT: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.DEFAULT with Double = js.native
      
      /* 2 */ val FASTEST: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.FASTEST with Double = js.native
      
      /* 1 */ val RECOMMENDED: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.RECOMMENDED with Double = js.native
    }
  }
}
