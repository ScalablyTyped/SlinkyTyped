package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.ICircleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Circle")
@js.native
class Circle ()
  extends typingsSlinky.fabric.fabricImplMod.Circle {
  def this(options: ICircleOptions) = this()
}
/* static members */
object Circle {
  
  @JSImport("fabric", "fabric.Circle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    */
  @JSImport("fabric", "fabric.Circle.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Circle instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric", "fabric.Circle.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: ICircleOptions): typingsSlinky.fabric.fabricImplMod.Circle = js.native
  
  /**
    * Returns Circle instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric", "fabric.Circle.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Circle = js.native
}
