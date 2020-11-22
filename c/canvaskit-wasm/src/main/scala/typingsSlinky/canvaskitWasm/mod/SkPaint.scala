package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkPaint extends EmbindObject[SkPaint] {
  
  /**
    * Returns a copy of this paint.
    */
  def copy(): SkPaint = js.native
  
  /**
    * Returns the blend mode, that is, the mode used to combine source color
    * with destination color.
    */
  def getBlendMode(): BlendMode = js.native
  
  /**
    * Retrieves the alpha and RGB unpremultiplied. RGB are extended sRGB values
    * (sRGB gamut, and encoded with the sRGB transfer function).
    */
  def getColor(): js.typedarray.Float32Array = js.native
  
  /**
    * Returns the image filtering level.
    * [deprecated] This will be removed in an upcoming release.
    */
  def getFilterQuality(): FilterQuality = js.native
  
  /**
    * Returns the geometry drawn at the beginning and end of strokes.
    */
  def getStrokeCap(): StrokeCap = js.native
  
  /**
    * Returns the geometry drawn at the corners of strokes.
    */
  def getStrokeJoin(): StrokeJoin = js.native
  
  /**
    *  Returns the limit at which a sharp corner is drawn beveled.
    */
  def getStrokeMiter(): Double = js.native
  
  /**
    * Returns the thickness of the pen used to outline the shape.
    */
  def getStrokeWidth(): Double = js.native
  
  /**
    * Replaces alpha, leaving RGBA unchanged. 0 means fully transparent, 1.0 means opaque.
    * @param alpha
    */
  def setAlphaf(alpha: Double): Unit = js.native
  
  /**
    * Requests, but does not require, that edge pixels draw opaque or with
    * partial transparency.
    * @param aa
    */
  def setAntiAlias(aa: Boolean): Unit = js.native
  
  /**
    * Sets the blend mode that is, the mode used to combine source color
    * with destination color.
    * @param mode
    */
  def setBlendMode(mode: BlendMode): Unit = js.native
  
  /**
    * Sets alpha and RGB used when stroking and filling. The color is four floating
    * point values, unpremultiplied. The color values are interpreted as being in
    * the provided colorSpace.
    * @param color
    * @param colorSpace - defaults to sRGB
    */
  def setColor(color: InputColor): Unit = js.native
  def setColor(color: InputColor, colorSpace: ColorSpace): Unit = js.native
  
  /**
    * Sets alpha and RGB used when stroking and filling. The color is four floating
    * point values, unpremultiplied. The color values are interpreted as being in
    * the provided colorSpace.
    * @param r
    * @param g
    * @param b
    * @param a
    * @param colorSpace - defaults to sRGB
    */
  def setColorComponents(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def setColorComponents(r: Double, g: Double, b: Double, a: Double, colorSpace: ColorSpace): Unit = js.native
  
  /**
    * Sets the current color filter, replacing the existing one if there was one.
    * @param filter
    */
  def setColorFilter(filter: SkColorFilter): Unit = js.native
  
  /**
    * Sets the color used when stroking and filling. The color values are interpreted as being in
    * the provided colorSpace.
    * @param color
    * @param colorSpace - defaults to sRGB.
    */
  def setColorInt(color: SkColorInt): Unit = js.native
  def setColorInt(color: SkColorInt, colorSpace: ColorSpace): Unit = js.native
  
  /**
    * Sets the image filtering level.
    * [deprecated] This will be removed in an upcoming release.
    * @param quality
    */
  def setFilterQuality(quality: FilterQuality): Unit = js.native
  
  /**
    * Sets the current image filter, replacing the existing one if there was one.
    * @param filter
    */
  def setImageFilter(filter: SkImageFilter): Unit = js.native
  
  /**
    * Sets the current mask filter, replacing the existing one if there was one.
    * @param filter
    */
  def setMaskFilter(filter: SkMaskFilter): Unit = js.native
  
  /**
    * Sets the current path effect, replacing the existing one if there was one.
    * @param effect
    */
  def setPathEffect(effect: SkPathEffect): Unit = js.native
  
  /**
    * Sets the current shader, replacing the existing one if there was one.
    * @param shader
    */
  def setShader(shader: SkShader): Unit = js.native
  
  /**
    * Sets the geometry drawn at the beginning and end of strokes.
    * @param cap
    */
  def setStrokeCap(cap: StrokeCap): Unit = js.native
  
  /**
    * Sets the geometry drawn at the corners of strokes.
    * @param join
    */
  def setStrokeJoin(join: StrokeJoin): Unit = js.native
  
  /**
    * Sets the limit at which a sharp corner is drawn beveled.
    * @param limit
    */
  def setStrokeMiter(limit: Double): Unit = js.native
  
  /**
    * Sets the thickness of the pen used to outline the shape.
    * @param width
    */
  def setStrokeWidth(width: Double): Unit = js.native
  
  /**
    * Sets whether the geometry is filled or stroked.
    * @param style
    */
  def setStyle(style: PaintStyle): Unit = js.native
}
