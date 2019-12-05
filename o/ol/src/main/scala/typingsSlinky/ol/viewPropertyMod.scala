package typingsSlinky.ol

import typingsSlinky.ol.viewPropertyMod.ViewProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ViewProperty", JSImport.Namespace)
@js.native
object viewPropertyMod extends js.Object {
  @js.native
  sealed trait ViewProperty extends js.Object
  
  @js.native
  object ViewProperty extends js.Object {
    @js.native
    sealed trait CENTER extends ViewProperty
    
    @js.native
    sealed trait RESOLUTION extends ViewProperty
    
    @js.native
    sealed trait ROTATION extends ViewProperty
    
  }
  
  @js.native
  object default extends js.Object {
    /* "center" */ val CENTER: typingsSlinky.ol.viewPropertyMod.ViewProperty.CENTER with String = js.native
    /* "resolution" */ val RESOLUTION: typingsSlinky.ol.viewPropertyMod.ViewProperty.RESOLUTION with String = js.native
    /* "rotation" */ val ROTATION: typingsSlinky.ol.viewPropertyMod.ViewProperty.ROTATION with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewProperty with String] = js.native
  }
  
}

