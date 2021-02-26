package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute () extends StObject {
  def this(red: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double
  ) = this()
  def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  
  var componentDatatype: ComponentDatatype = js.native
  
  var componentsPerAttribute: Double = js.native
  
  var normalize: Boolean = js.native
  
  var value: js.typedarray.Uint8Array = js.native
}
object ColorGeometryInstanceAttribute {
  
  /* static member */
  @JSImport("cesium", "ColorGeometryInstanceAttribute.fromColor")
  @js.native
  def fromColor(color: Color): ColorGeometryInstanceAttribute = js.native
  
  /* static member */
  @JSImport("cesium", "ColorGeometryInstanceAttribute.toValue")
  @js.native
  def toValue(color: Color): js.typedarray.Uint8Array = js.native
  @JSImport("cesium", "ColorGeometryInstanceAttribute.toValue")
  @js.native
  def toValue(color: Color, result: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
