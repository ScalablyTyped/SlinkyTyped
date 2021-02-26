package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.ITextboxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Textbox")
@js.native
class Textbox protected ()
  extends typingsSlinky.fabric.fabricImplMod.Textbox {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: ITextboxOptions) = this()
}
/* static members */
object Textbox {
  
  /**
    * Returns fabric.Textbox instance from an object representation
    * @static
    * @memberOf fabric.Textbox
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
    */
  @JSImport("fabric", "fabric.Textbox.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Textbox = js.native
  @JSImport("fabric", "fabric.Textbox.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Textbox = js.native
}
