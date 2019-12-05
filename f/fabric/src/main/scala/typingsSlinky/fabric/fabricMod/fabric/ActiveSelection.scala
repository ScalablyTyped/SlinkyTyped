package typingsSlinky.fabric.fabricMod.fabric

import typingsSlinky.fabric.fabricDashImplMod.IObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.ActiveSelection")
@js.native
/**
	 * Constructor
	 * @param objects ActiveSelection objects
	 * @param [options] Options object
	 */
class ActiveSelection ()
  extends typingsSlinky.fabric.fabricDashImplMod.ActiveSelection {
  def this(objects: js.Array[typingsSlinky.fabric.fabricDashImplMod.Object]) = this()
  def this(objects: js.Array[typingsSlinky.fabric.fabricDashImplMod.Object], options: IObjectOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.ActiveSelection")
@js.native
object ActiveSelection extends js.Object {
  /**
  	 * Returns {@link fabric.ActiveSelection} instance from an object representation
  	 * @memberOf fabric.ActiveSelection
  	 * @param object Object to create a group from
  	 * @param [callback] Callback to invoke when an ActiveSelection instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function): Unit = js.native
}

