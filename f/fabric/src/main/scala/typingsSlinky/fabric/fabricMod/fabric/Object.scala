package typingsSlinky.fabric.fabricMod.fabric

import typingsSlinky.fabric.fabricDashImplMod.IObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Object")
@js.native
class Object ()
  extends typingsSlinky.fabric.fabricDashImplMod.Object {
  def this(options: IObjectOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Object")
@js.native
object Object extends js.Object {
  /**
  	 * Creates fabric Object instance
  	 * @param {string} Class name
  	 * @param {fabric.Object} Original object
  	 * @param {Function} Callback when complete
  	 * @param {Object} Extra parameters for fabric.Object
  	 * @private
  	 * @return {fabric.Object}
  	 */
  def _fromObject(className: String, `object`: typingsSlinky.fabric.fabricDashImplMod.Object): typingsSlinky.fabric.fabricDashImplMod.Object = js.native
  def _fromObject(className: String, `object`: typingsSlinky.fabric.fabricDashImplMod.Object, callback: js.Function): typingsSlinky.fabric.fabricDashImplMod.Object = js.native
  def _fromObject(
    className: String,
    `object`: typingsSlinky.fabric.fabricDashImplMod.Object,
    callback: js.Function,
    extraParam: js.Any
  ): typingsSlinky.fabric.fabricDashImplMod.Object = js.native
}

