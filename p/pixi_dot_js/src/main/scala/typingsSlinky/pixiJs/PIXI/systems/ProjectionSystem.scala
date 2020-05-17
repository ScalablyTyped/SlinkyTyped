package typingsSlinky.pixiJs.PIXI.systems

import typingsSlinky.pixiJs.PIXI.Matrix
import typingsSlinky.pixiJs.PIXI.Rectangle
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage the projection matrix.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait ProjectionSystem extends System {
  /**
    * Default destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
    * @readonly
    */
  val defaultFrame: Rectangle = js.native
  /**
    * Destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
    * @readonly
    */
  val destinationFrame: Rectangle = js.native
  /**
    * Project matrix
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
    * @readonly
    */
  val projectionMatrix: Matrix = js.native
  /**
    * Source frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
    * @readonly
    */
  val sourceFrame: Rectangle = js.native
  /**
    * A transform that will be appended to the projection matrix
    * if null, nothing will be applied
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
    */
  var transform: Matrix = js.native
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle)
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
  /**
    * Sets the transform of the active render target to the given matrix
    *
    * @param {PIXI.Matrix} matrix - The transformation matrix
    */
  def setTransform(matrix: Matrix): Unit = js.native
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle)
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
}

object ProjectionSystem {
  @scala.inline
  def apply(
    calculateProjection: (Rectangle, Rectangle, Double, Boolean) => Unit,
    defaultFrame: Rectangle,
    destinationFrame: Rectangle,
    destroy: () => Unit,
    projectionMatrix: Matrix,
    renderer: Renderer,
    setTransform: Matrix => Unit,
    sourceFrame: Rectangle,
    transform: Matrix,
    update: (Rectangle, Rectangle, Double, Boolean) => Unit
  ): ProjectionSystem = {
    val __obj = js.Dynamic.literal(calculateProjection = js.Any.fromFunction4(calculateProjection), defaultFrame = defaultFrame.asInstanceOf[js.Any], destinationFrame = destinationFrame.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), projectionMatrix = projectionMatrix.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setTransform = js.Any.fromFunction1(setTransform), sourceFrame = sourceFrame.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[ProjectionSystem]
  }
  @scala.inline
  implicit class ProjectionSystemOps[Self <: ProjectionSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateProjection(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateProjection")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefaultFrame(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationFrame(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTransform(value: Matrix => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceFrame(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

