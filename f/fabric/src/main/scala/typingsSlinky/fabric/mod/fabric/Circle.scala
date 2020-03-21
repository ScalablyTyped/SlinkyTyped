package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.ICircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Circle")
@js.native
class Circle ()
  extends typingsSlinky.fabric.fabricImplMod.Circle {
  def this(options: ICircleOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Circle")
@js.native
object Circle extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns Circle instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement, options: ICircleOptions): typingsSlinky.fabric.fabricImplMod.Circle = js.native
  /**
  	 * Returns Circle instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Circle = js.native
}

