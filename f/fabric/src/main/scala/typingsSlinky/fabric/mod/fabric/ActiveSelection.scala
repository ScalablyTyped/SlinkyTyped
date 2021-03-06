package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.IObjectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.ActiveSelection")
@js.native
/**
  * Constructor
  * @param objects ActiveSelection objects
  * @param [options] Options object
  */
class ActiveSelection ()
  extends typingsSlinky.fabric.fabricImplMod.ActiveSelection {
  def this(objects: js.Array[typingsSlinky.fabric.fabricImplMod.Object]) = this()
  def this(objects: js.UndefOr[scala.Nothing], options: IObjectOptions) = this()
  def this(objects: js.Array[typingsSlinky.fabric.fabricImplMod.Object], options: IObjectOptions) = this()
}
/* static members */
object ActiveSelection {
  
  /**
    * Returns {@link fabric.ActiveSelection} instance from an object representation
    * @memberOf fabric.ActiveSelection
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an ActiveSelection instance is created
    */
  @JSImport("fabric", "fabric.ActiveSelection.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): Unit = js.native
}
