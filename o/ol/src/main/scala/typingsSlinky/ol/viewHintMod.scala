package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewHintMod {
  
  @JSImport("ol/ViewHint", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ViewHint with Double] = js.native
    
    /* 0 */ val ANIMATING: typingsSlinky.ol.viewHintMod.ViewHint.ANIMATING with Double = js.native
    
    /* 1 */ val INTERACTING: typingsSlinky.ol.viewHintMod.ViewHint.INTERACTING with Double = js.native
  }
  
  @js.native
  sealed trait ViewHint extends StObject
  @JSImport("ol/ViewHint", "ViewHint")
  @js.native
  object ViewHint extends StObject {
    
    @js.native
    sealed trait ANIMATING extends ViewHint
    
    @js.native
    sealed trait INTERACTING extends ViewHint
  }
}
