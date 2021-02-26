package typingsSlinky.fabric.mod.fabric

import typingsSlinky.fabric.fabricImplMod.ITextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.IText")
@js.native
class IText protected ()
  extends typingsSlinky.fabric.fabricImplMod.IText {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: ITextOptions) = this()
}
/* static members */
object IText {
  
  /**
    * Returns fabric.IText instance from an object representation
    * @static
    * @memberOf fabric.IText
    * @param {Object} object Object to create an instance from
    * @param {function} [callback] invoked with new instance as argument
    */
  @JSImport("fabric", "fabric.IText.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.IText = js.native
  @JSImport("fabric", "fabric.IText.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): typingsSlinky.fabric.fabricImplMod.IText = js.native
}
