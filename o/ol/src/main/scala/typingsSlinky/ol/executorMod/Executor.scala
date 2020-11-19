package typingsSlinky.ol.executorMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
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
    transform: Transform,
    viewRotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
  
  def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): T = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.UndefOr[scala.Nothing],
    opt_hitExtent: Extent
  ): T = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit]
  ): T = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit],
    opt_hitExtent: Extent
  ): T = js.native
  
  var hitDetectionInstructions: js.Array[_] = js.native
  
  var instructions: js.Array[_] = js.native
  
  var overlaps: Boolean = js.native
  
  var pixelRatio: Double = js.native
  
  def renderDeclutter(declutterGroup: DeclutterGroup, feature: FeatureLike, opacity: Double, declutterTree: js.Any): js.Any = js.native
  
  def replayImageOrLabel_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    imageOrLabel: Label,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayImageOrLabel_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    imageOrLabel: HTMLCanvasElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayImageOrLabel_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    imageOrLabel: HTMLImageElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayImageOrLabel_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    imageOrLabel: HTMLVideoElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  
  def replayTextBackground_(
    context: CanvasRenderingContext2D,
    p1: Coordinate,
    p2: Coordinate,
    p3: Coordinate,
    p4: Coordinate,
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  
  var resolution: Double = js.native
}
