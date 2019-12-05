package typingsSlinky.fabric.fabricMod.fabric

import typingsSlinky.fabric.fabricDashImplMod.ITriangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Triangle")
@js.native
/**
	 * Constructor
	 * @param [options] Options object
	 */
class Triangle ()
  extends typingsSlinky.fabric.fabricDashImplMod.Triangle {
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
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricDashImplMod.Triangle = js.native
}

