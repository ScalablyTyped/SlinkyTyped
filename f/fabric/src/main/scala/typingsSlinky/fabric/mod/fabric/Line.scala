package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.ILineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Line")
@js.native
/**
  * Constructor
  * @param [points] Array of points
  * @param [options] Options object
  */
class Line ()
  extends typingsSlinky.fabric.fabricImplMod.Line {
  def this(points: js.Array[Double]) = this()
  def this(points: js.UndefOr[scala.Nothing], objObjects: ILineOptions) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Line")
@js.native
object Line extends js.Object {
  
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @memberOf fabric.Line
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  def fromElement(element: SVGElement): typingsSlinky.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: ILineOptions): typingsSlinky.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function): typingsSlinky.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typingsSlinky.fabric.fabricImplMod.Line = js.native
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Line = js.native
}
