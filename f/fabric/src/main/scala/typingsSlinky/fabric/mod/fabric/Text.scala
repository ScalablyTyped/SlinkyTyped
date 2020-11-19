package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Text")
@js.native
class Text protected ()
  extends typingsSlinky.fabric.fabricImplMod.Text {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: TextOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Text")
@js.native
object Text extends js.Object {
  
  var DEFAULT_SVG_FONT_SIZE: Double = js.native
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  def fromElement(element: SVGElement): typingsSlinky.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: TextOptions): typingsSlinky.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typingsSlinky.fabric.fabricImplMod.Text = js.native
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Text = js.native
  def fromObject(`object`: js.Any, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Text = js.native
}
