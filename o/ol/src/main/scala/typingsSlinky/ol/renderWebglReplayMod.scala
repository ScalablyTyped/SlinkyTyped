package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.renderWebglReplayMod.WebGLReplay
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/Replay", JSImport.Namespace)
@js.native
object renderWebglReplayMod extends js.Object {
  @js.native
  trait WebGLReplay
    extends typingsSlinky.ol.renderVectorContextMod.default {
    var indices: js.Array[Double] = js.native
    var indicesBuffer: typingsSlinky.ol.webglBufferMod.default = js.native
    var lineStringReplay: typingsSlinky.ol.renderWebglLineStringReplayMod.default = js.native
    var maxExtent: Extent = js.native
    var origin: Coordinate = js.native
    var startIndices: js.Array[Double] = js.native
    var startIndicesFeature: js.Array[typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default] = js.native
    var tolerance: Double = js.native
    var vertices: js.Array[Double] = js.native
    var verticesBuffer: typingsSlinky.ol.webglBufferMod.default = js.native
    /* protected */ def drawElements(
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      start: Double,
      end: Double
    ): Unit = js.native
    /* protected */ def drawHitDetectionReplay[T](
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplay[T](
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean,
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayAll[T](
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayOneByOne[T](
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayOneByOne[T](
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def drawReplay(
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      hitDetection: Boolean
    ): Unit = js.native
    def finish(context: typingsSlinky.ol.webglContextMod.default): Unit = js.native
    def getDeleteResourcesFunction(context: typingsSlinky.ol.webglContextMod.default): js.Function0[Unit] = js.native
    def replay[T](
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean
    ): js.UndefOr[T] = js.native
    def replay[T](
      context: typingsSlinky.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typingsSlinky.ol.featureMod.default | typingsSlinky.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean,
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def setUpProgram(
      gl: WebGLRenderingContext,
      context: typingsSlinky.ol.webglContextMod.default,
      size: Size,
      pixelRatio: Double
    ): typingsSlinky.ol.renderWebglCirclereplayDefaultshaderLocationsMod.default | typingsSlinky.ol.renderWebglLinestringreplayDefaultshaderLocationsMod.default | typingsSlinky.ol.renderWebglPolygonreplayDefaultshaderLocationsMod.default | typingsSlinky.ol.renderWebglTexturereplayDefaultshaderLocationsMod.default = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typingsSlinky.ol.renderWebglCirclereplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typingsSlinky.ol.renderWebglLinestringreplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typingsSlinky.ol.renderWebglPolygonreplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typingsSlinky.ol.renderWebglTexturereplayDefaultshaderLocationsMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

