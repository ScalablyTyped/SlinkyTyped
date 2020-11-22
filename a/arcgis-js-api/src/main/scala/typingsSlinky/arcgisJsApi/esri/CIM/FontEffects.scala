package typingsSlinky.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontEffects extends js.Object
@JSGlobal("__esri.CIM.FontEffects")
@js.native
object FontEffects extends js.Object {
  
  /**
    * Normal text.
    */
  @js.native
  sealed trait Normal extends FontEffects
  
  /**
    * Subscript text
    */
  @js.native
  sealed trait Subscript extends FontEffects
  
  /**
    * Superscript text.
    */
  @js.native
  sealed trait Superscript extends FontEffects
}
