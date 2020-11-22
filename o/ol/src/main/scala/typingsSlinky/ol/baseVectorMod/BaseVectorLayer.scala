package typingsSlinky.ol.baseVectorMod

import typingsSlinky.ol.renderMod.OrderFunction
import typingsSlinky.ol.styleStyleMod.StyleFunction
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseVectorLayer[VectorSourceType /* <: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.sourceVectorTileMod.default */]
  extends typingsSlinky.ol.layerLayerMod.default[VectorSourceType] {
  
  def getDeclutter(): Boolean = js.native
  
  def getRenderBuffer(): js.UndefOr[Double] = js.native
  
  def getRenderOrder(): js.Function2[
    /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
    /* p1 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
    js.UndefOr[Double | Null]
  ] = js.native
  
  /**
    * Get the style for features.  This returns whatever was passed to the style
    * option at construction or to the setStyle method.
    */
  def getStyle(): js.UndefOr[StyleLike | Null] = js.native
  
  /**
    * Get the style function.
    */
  def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
  
  def getUpdateWhileAnimating(): Boolean = js.native
  
  def getUpdateWhileInteracting(): Boolean = js.native
  
  def setRenderOrder(): Unit = js.native
  def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
  
  /**
    * Set the style for features.  This can be a single style object, an array
    * of styles, or a function that takes a feature and resolution and returns
    * an array of styles. If set to null, the layer has no style (a null style),
    * so only features that have their own styles will be rendered in the layer. Call
    * setStyle() without arguments to reset to the default style. See
    * {@link module:ol/style} for information on the default style.
    */
  def setStyle(): Unit = js.native
  def setStyle(opt_style: StyleLike): Unit = js.native
}
