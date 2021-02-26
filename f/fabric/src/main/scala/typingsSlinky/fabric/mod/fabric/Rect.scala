package typingsSlinky.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.fabricImplMod.IRectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Rect")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Rect ()
  extends typingsSlinky.fabric.fabricImplMod.Rect {
  def this(options: IRectOptions) = this()
}
/* static members */
object Rect {
  
  @JSImport("fabric", "fabric.Rect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  @JSImport("fabric", "fabric.Rect.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Rect instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric", "fabric.Rect.fromElement")
  @js.native
  def fromElement(element: SVGElement): typingsSlinky.fabric.fabricImplMod.Rect = js.native
  @JSImport("fabric", "fabric.Rect.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: IRectOptions): typingsSlinky.fabric.fabricImplMod.Rect = js.native
  
  /**
    * Returns Rect instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric", "fabric.Rect.fromObject")
  @js.native
  def fromObject(`object`: js.Any): typingsSlinky.fabric.fabricImplMod.Rect = js.native
}
