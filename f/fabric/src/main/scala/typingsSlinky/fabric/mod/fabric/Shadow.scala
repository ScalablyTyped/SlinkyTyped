package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.IShadowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Shadow")
@js.native
class Shadow ()
  extends typingsSlinky.fabric.fabricImplMod.Shadow {
  def this(options: String) = this()
  def this(options: IShadowOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Shadow")
@js.native
object Shadow extends js.Object {
  
  /**
    * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
    * @static
    * @field
    * @memberOf fabric.Shadow
    */
  var reOffsetsAndBlur: js.RegExp = js.native
}
