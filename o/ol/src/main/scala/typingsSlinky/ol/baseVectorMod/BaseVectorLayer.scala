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
  
  def getRenderBuffer(): Double = js.native
  
  def getRenderOrder(): js.Function2[
    /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
    /* p1 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
    Double
  ] = js.native
  
  def getStyle(): StyleLike = js.native
  
  def getStyleFunction(): StyleFunction = js.native
  
  def getUpdateWhileAnimating(): Boolean = js.native
  
  def getUpdateWhileInteracting(): Boolean = js.native
  
  def setRenderOrder(): Unit = js.native
  def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
  
  def setStyle(): Unit = js.native
  def setStyle(style: StyleLike): Unit = js.native
}
