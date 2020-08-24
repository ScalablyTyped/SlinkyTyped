package typingsSlinky.easeljs.global.createjs

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.easeljs.createjs.IStageGLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.StageGL")
@js.native
class StageGL protected ()
  extends typingsSlinky.easeljs.createjs.StageGL {
  def this(canvas: String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, options: IStageGLOptions) = this()
  def this(canvas: js.Object, options: IStageGLOptions) = this()
  def this(canvas: HTMLCanvasElement, options: IStageGLOptions) = this()
}

/* static members */
@JSGlobal("createjs.StageGL")
@js.native
object StageGL extends js.Object {
  var COVER_FRAGMENT_BODY: String = js.native
  var COVER_FRAGMENT_HEADER: String = js.native
  var COVER_UV: js.typedarray.Float32Array = js.native
  var COVER_UV_FLIP: js.typedarray.Float32Array = js.native
  var COVER_VARYING_HEADER: String = js.native
  var COVER_VERT: js.typedarray.Float32Array = js.native
  var COVER_VERTEX_BODY: String = js.native
  var COVER_VERTEX_HEADER: String = js.native
  var DEFAULT_MAX_BATCH_SIZE: Double = js.native
  var INDICIES_PER_CARD: Double = js.native
  var PARTICLE_FRAGMENT_BODY: String = js.native
  var PARTICLE_VERTEX_BODY: String = js.native
  var REGULAR_FRAGMENT_BODY: String = js.native
  var REGULAR_FRAGMENT_HEADER: String = js.native
  var REGULAR_FRAG_COLOR_NORMAL: String = js.native
  var REGULAR_FRAG_COLOR_PREMULTIPLY: String = js.native
  var REGULAR_VARYING_HEADER: String = js.native
  var REGULAR_VERTEX_BODY: String = js.native
  var REGULAR_VERTEX_HEADER: String = js.native
  var UV_RECT: Double = js.native
  // properties
  var VERTEX_PROPERTY_COUNT: Double = js.native
  var WEBGL_MAX_INDEX_NUM: Double = js.native
  // methods
  def buildUVRects(spritesheet: typingsSlinky.easeljs.createjs.SpriteSheet): js.Object = js.native
  def buildUVRects(
    spritesheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    target: js.UndefOr[scala.Nothing],
    onlyTarget: Boolean
  ): js.Object = js.native
  def buildUVRects(spritesheet: typingsSlinky.easeljs.createjs.SpriteSheet, target: Double): js.Object = js.native
  def buildUVRects(spritesheet: typingsSlinky.easeljs.createjs.SpriteSheet, target: Double, onlyTarget: Boolean): js.Object = js.native
  def isWebGLActive(ctx: CanvasRenderingContext2D): Boolean = js.native
}

