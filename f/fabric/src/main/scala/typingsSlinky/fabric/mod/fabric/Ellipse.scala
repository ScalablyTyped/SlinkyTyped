package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.IEllipseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Ellipse")
@js.native
class Ellipse ()
  extends typingsSlinky.fabric.fabricImplMod.Ellipse {
  def this(options: IEllipseOptions) = this()
}
/* static members */
object Ellipse {
  
  @JSImport("fabric", "fabric.Ellipse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    */
  @JSImport("fabric", "fabric.Ellipse.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Ellipse instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric", "fabric.Ellipse.fromElement")
  @js.native
  def fromElement(element: SVGElement): typingsSlinky.fabric.fabricImplMod.Ellipse = js.native
  @JSImport("fabric", "fabric.Ellipse.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: IEllipseOptions): typingsSlinky.fabric.fabricImplMod.Ellipse = js.native
  
  /**
    * Returns Ellipse instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric", "fabric.Ellipse.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Ellipse = js.native
}
