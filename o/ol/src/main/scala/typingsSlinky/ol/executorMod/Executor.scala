package typingsSlinky.ol.executorMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.canvasMod.DeclutterGroup
import typingsSlinky.ol.canvasMod.Label
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executor extends js.Object {
  
  var coordinates: js.Array[Double] = js.native
  
  def createLabel(text: String, textKey: String, fillKey: String, strokeKey: String): Label = js.native
  
  def execute(
    context: CanvasRenderingContext2D,
    contextScale: Double,
    transform: Transform,
    viewRotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
  
  def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.UndefOr[scala.Nothing],
    opt_hitExtent: Extent
  ): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit]
  ): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit],
    opt_hitExtent: Extent
  ): js.UndefOr[T] = js.native
  
  var hitDetectionInstructions: js.Array[_] = js.native
  
  var instructions: js.Array[_] = js.native
  
  var overlaps: Boolean = js.native
  
  var pixelRatio: Double = js.native
  
  def renderDeclutter(declutterGroup: DeclutterGroup, feature: FeatureLike, opacity: Double, declutterTree: js.Any): js.Any = js.native
  
  def replayTextBackground_(
    context: CanvasRenderingContext2D,
    p1: Coordinate,
    p2: Coordinate,
    p3: Coordinate,
    p4: Coordinate,
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_],
    declutter: Boolean
  ): Unit = js.native
  
  var resolution: Double = js.native
}
