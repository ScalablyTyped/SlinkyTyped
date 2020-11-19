package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/extent/Corner", JSImport.Namespace)
@js.native
object cornerMod extends js.Object {
  
  @js.native
  sealed trait Corner extends js.Object
  @js.native
  object Corner extends js.Object {
    
    @js.native
    sealed trait BOTTOM_LEFT extends Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT extends Corner
    
    @js.native
    sealed trait TOP_LEFT extends Corner
    
    @js.native
    sealed trait TOP_RIGHT extends Corner
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Corner with String] = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typingsSlinky.ol.cornerMod.Corner.BOTTOM_LEFT with String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typingsSlinky.ol.cornerMod.Corner.BOTTOM_RIGHT with String = js.native
    
    /* "top-left" */ val TOP_LEFT: typingsSlinky.ol.cornerMod.Corner.TOP_LEFT with String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typingsSlinky.ol.cornerMod.Corner.TOP_RIGHT with String = js.native
  }
}
