package typingsSlinky.amapJsApiRiding

import typingsSlinky.amapJsApiRiding.AMap.Riding.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object AMap extends js.Object {
    @js.native
    class Riding ()
      extends typingsSlinky.amapJsApiRiding.AMap.Riding {
      def this(options: Options) = this()
    }
    
    @js.native
    object RidingPolicy extends js.Object {
      /* 0 */ val DEFAULT: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.DEFAULT with Double = js.native
      /* 2 */ val FASTEST: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.FASTEST with Double = js.native
      /* 1 */ val RECOMMENDED: typingsSlinky.amapJsApiRiding.AMap.RidingPolicy.RECOMMENDED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.amapJsApiRiding.AMap.RidingPolicy with Double] = js.native
    }
    
  }
  
}

