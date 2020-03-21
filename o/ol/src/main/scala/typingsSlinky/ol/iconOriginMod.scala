package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconOrigin", JSImport.Namespace)
@js.native
object iconOriginMod extends js.Object {
  @js.native
  sealed trait IconOrigin extends js.Object
  
  @js.native
  object IconOrigin extends js.Object {
    @js.native
    sealed trait BOTTOM_LEFT extends IconOrigin
    
    @js.native
    sealed trait BOTTOM_RIGHT extends IconOrigin
    
    @js.native
    sealed trait TOP_LEFT extends IconOrigin
    
    @js.native
    sealed trait TOP_RIGHT extends IconOrigin
    
  }
  
  @js.native
  object default extends js.Object {
    /* "bottom-left" */ val BOTTOM_LEFT: typingsSlinky.ol.iconOriginMod.IconOrigin.BOTTOM_LEFT with String = js.native
    /* "bottom-right" */ val BOTTOM_RIGHT: typingsSlinky.ol.iconOriginMod.IconOrigin.BOTTOM_RIGHT with String = js.native
    /* "top-left" */ val TOP_LEFT: typingsSlinky.ol.iconOriginMod.IconOrigin.TOP_LEFT with String = js.native
    /* "top-right" */ val TOP_RIGHT: typingsSlinky.ol.iconOriginMod.IconOrigin.TOP_RIGHT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconOrigin with String] = js.native
  }
  
}

