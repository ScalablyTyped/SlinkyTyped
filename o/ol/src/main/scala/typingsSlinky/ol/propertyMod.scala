package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Property", JSImport.Namespace)
@js.native
object propertyMod extends js.Object {
  
  @js.native
  sealed trait Property extends js.Object
  @js.native
  object Property extends js.Object {
    
    @js.native
    sealed trait ACTIVE extends Property
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Property with String] = js.native
    
    /* "active" */ val ACTIVE: typingsSlinky.ol.propertyMod.Property.ACTIVE with String = js.native
  }
}
