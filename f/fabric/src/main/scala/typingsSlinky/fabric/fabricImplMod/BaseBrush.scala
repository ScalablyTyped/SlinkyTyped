package typingsSlinky.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "BaseBrush")
@js.native
class BaseBrush () extends StObject {
  
  /**
    * Color of a brush
    */
  var color: String = js.native
  
  /**
    * Sets shadow of an object
    * @param [options] Options object or string (e.g. "2px 2px 10px rgba(0,0,0,0.2)")
    */
  def setShadow(options: String): BaseBrush = js.native
  def setShadow(options: js.Any): BaseBrush = js.native
  
  /**
    * Shadow object representing shadow of this shape.
    * <b>Backwards incompatibility note:</b> This property replaces "shadowColor" (String), "shadowOffsetX" (Number),
    * "shadowOffsetY" (Number) and "shadowBlur" (Number) since v1.2.12
    */
  var shadow: Shadow | String = js.native
  
  /**
    * Stroke Dash Array.
    */
  var strokeDashArray: js.Array[_] = js.native
  
  /**
    * Line endings style of a brush (one of "butt", "round", "square")
    */
  var strokeLineCap: String = js.native
  
  /**
    * Corner style of a brush (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: String = js.native
  
  /**
    * Width of a brush
    */
  var width: Double = js.native
}
