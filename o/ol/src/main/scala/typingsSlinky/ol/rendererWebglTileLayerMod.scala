package typingsSlinky.ol

import typingsSlinky.ol.rendererWebglTileLayerMod.WebGLTileLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/TileLayer", JSImport.Namespace)
@js.native
object rendererWebglTileLayerMod extends js.Object {
  @js.native
  trait WebGLTileLayerRenderer
    extends typingsSlinky.ol.rendererWebglLayerMod.default {
    def create(
      mapRenderer: typingsSlinky.ol.rendererMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ): WebGLTileLayerRenderer = js.native
    def handles(layer: typingsSlinky.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLTileLayerRenderer {
    def this(
      mapRenderer: typingsSlinky.ol.rendererWebglMapMod.default,
      tileLayer: typingsSlinky.ol.layerTileMod.default
    ) = this()
  }
  
}

