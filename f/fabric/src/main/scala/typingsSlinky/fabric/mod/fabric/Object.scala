package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.IObjectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Object")
@js.native
class Object ()
  extends typingsSlinky.fabric.fabricImplMod.Object {
  def this(options: IObjectOptions) = this()
}
/* static members */
object Object {
  
  @JSImport("fabric", "fabric.Object")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines the number of fraction digits to use when serializing object values.
    */
  @JSImport("fabric", "fabric.Object.NUM_FRACTION_DIGITS")
  @js.native
  def NUM_FRACTION_DIGITS: js.UndefOr[Double] = js.native
  @scala.inline
  def NUM_FRACTION_DIGITS_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_FRACTION_DIGITS")(x.asInstanceOf[js.Any])
  
  /**
    * Creates fabric Object instance
    * @param {string} Class name
    * @param {fabric.Object} Original object
    * @param {Function} Callback when complete
    * @param {Object} Extra parameters for fabric.Object
    * @private
    * @return {fabric.Object}
    */
  @JSImport("fabric", "fabric.Object._fromObject")
  @js.native
  def _fromObject(className: String, `object`: typingsSlinky.fabric.fabricImplMod.Object): typingsSlinky.fabric.fabricImplMod.Object = js.native
  @JSImport("fabric", "fabric.Object._fromObject")
  @js.native
  def _fromObject(
    className: String,
    `object`: typingsSlinky.fabric.fabricImplMod.Object,
    callback: js.UndefOr[scala.Nothing],
    extraParam: js.Any
  ): typingsSlinky.fabric.fabricImplMod.Object = js.native
  @JSImport("fabric", "fabric.Object._fromObject")
  @js.native
  def _fromObject(className: String, `object`: typingsSlinky.fabric.fabricImplMod.Object, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Object = js.native
  @JSImport("fabric", "fabric.Object._fromObject")
  @js.native
  def _fromObject(
    className: String,
    `object`: typingsSlinky.fabric.fabricImplMod.Object,
    callback: js.Function,
    extraParam: js.Any
  ): typingsSlinky.fabric.fabricImplMod.Object = js.native
}
