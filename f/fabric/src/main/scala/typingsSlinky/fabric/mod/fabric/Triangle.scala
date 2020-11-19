package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.ITriangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Triangle")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Triangle ()
  extends typingsSlinky.fabric.fabricImplMod.Triangle {
  def this(options: ITriangleOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Triangle")
@js.native
object Triangle extends js.Object {
  
  /**
    * Returns Triangle instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Triangle = js.native
}
