package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer for Particles that is designer for speed over feature set.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait ParticleRenderer extends js.Object {
  /**
    * The default shader that is used if a sprite doesn't have a more specific one.
    *
    * @member {PIXI.Shader} PIXI.ParticleRenderer#shader
    */
  var shader: Shader = js.native
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.ParticleRenderer#state
    * @readonly
    */
  val state: State = js.native
  /**
    * Destroys the ParticleRenderer.
    */
  def destroy(): Unit = js.native
  /**
    * Renders the particle container object.
    *
    * @param {PIXI.ParticleContainer} container - The container to render using this ParticleRenderer
    */
  def render(container: ParticleContainer): Unit = js.native
  /**
    * Uploads the position.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their positions uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadPosition(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the rotiation.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadRotation(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the tint.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadTint(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the Uvs
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadUvs(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the vertices.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their vertices uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadVertices(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
}

object ParticleRenderer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    render: ParticleContainer => Unit,
    shader: Shader,
    state: State,
    uploadPosition: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadRotation: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadTint: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadUvs: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadVertices: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit
  ): ParticleRenderer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), render = js.Any.fromFunction1(render), shader = shader.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uploadPosition = js.Any.fromFunction6(uploadPosition), uploadRotation = js.Any.fromFunction6(uploadRotation), uploadTint = js.Any.fromFunction6(uploadTint), uploadUvs = js.Any.fromFunction6(uploadUvs), uploadVertices = js.Any.fromFunction6(uploadVertices))
    __obj.asInstanceOf[ParticleRenderer]
  }
  @scala.inline
  implicit class ParticleRendererOps[Self <: ParticleRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: ParticleContainer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShader(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadPosition(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadPosition")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withUploadRotation(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadRotation")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withUploadTint(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTint")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withUploadUvs(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUvs")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withUploadVertices(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadVertices")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

