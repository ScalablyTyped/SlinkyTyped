package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform that takes care about its versions
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Transform extends js.Object {
  /**
    * The locally unique ID of the local transform
    * used to calculate the current local transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_currentLocalID
    */
  var _currentLocalID: Double = js.native
  /**
    * The X-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cx
    */
  var _cx: Double = js.native
  /**
    * The X-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_cy
    */
  var _cy: Double = js.native
  /**
    * The locally unique ID of the local transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_localID
    */
  var _localID: Double = js.native
  /**
    * The locally unique ID of the parent's world transform
    * used to calculate the current world transformation matrix.
    *
    * @protected
    * @member {number} PIXI.Transform#_parentID
    */
  var _parentID: Double = js.native
  /**
    * The rotation amount.
    *
    * @protected
    * @member {number} PIXI.Transform#_rotation
    */
  var _rotation: Double = js.native
  /**
    * The Y-coordinate value of the normalized local X axis,
    * the first column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sx
    */
  var _sx: Double = js.native
  /**
    * The Y-coordinate value of the normalized local Y axis,
    * the second column of the local transformation matrix without a scale.
    *
    * @protected
    * @member {number} PIXI.Transform#_sy
    */
  var _sy: Double = js.native
  /**
    * The locally unique ID of the world transform.
    *
    * @protected
    * @member {number} PIXI.Transform#_worldID
    */
  var _worldID: Double = js.native
  /**
    * The local transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#localTransform
    */
  var localTransform: Matrix = js.native
  /**
    * The pivot point of the displayObject that it rotates around.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#pivot
    */
  var pivot: ObservablePoint = js.native
  /**
    * The coordinate of the object relative to the local coordinates of the parent.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#position
    */
  var position: ObservablePoint = js.native
  /**
    * The rotation of the object in radians.
    *
    * @member {number}
    */
  var rotation: Double = js.native
  /**
    * The scale factor of the object.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#scale
    */
  var scale: ObservablePoint = js.native
  /**
    * The skew amount, on the x and y axis.
    *
    * @member {PIXI.ObservablePoint} PIXI.Transform#skew
    */
  var skew: ObservablePoint = js.native
  /**
    * The world transformation matrix.
    *
    * @member {PIXI.Matrix} PIXI.Transform#worldTransform
    */
  var worldTransform: Matrix = js.native
  /**
    * Called when a value changes.
    *
    * @protected
    */
  /* protected */ def onChange(): Unit = js.native
  /**
    * Decomposes a matrix and sets the transforms properties based on it.
    *
    * @param {PIXI.Matrix} matrix - The matrix to decompose
    */
  def setFromMatrix(matrix: Matrix): Unit = js.native
  /**
    * Updates the local transformation matrix.
    */
  def updateLocalTransform(): Unit = js.native
  /**
    * Called when the skew or the rotation changes.
    *
    * @protected
    */
  /* protected */ def updateSkew(): Unit = js.native
  /**
    * Updates the local and the world transformation matrices.
    *
    * @param {PIXI.Transform} parentTransform - The parent transform
    */
  def updateTransform(parentTransform: Transform): Unit = js.native
}

object Transform {
  @scala.inline
  def apply(
    _currentLocalID: Double,
    _cx: Double,
    _cy: Double,
    _localID: Double,
    _parentID: Double,
    _rotation: Double,
    _sx: Double,
    _sy: Double,
    _worldID: Double,
    localTransform: Matrix,
    onChange: () => Unit,
    pivot: ObservablePoint,
    position: ObservablePoint,
    rotation: Double,
    scale: ObservablePoint,
    setFromMatrix: Matrix => Unit,
    skew: ObservablePoint,
    updateLocalTransform: () => Unit,
    updateSkew: () => Unit,
    updateTransform: Transform => Unit,
    worldTransform: Matrix
  ): Transform = {
    val __obj = js.Dynamic.literal(_currentLocalID = _currentLocalID.asInstanceOf[js.Any], _cx = _cx.asInstanceOf[js.Any], _cy = _cy.asInstanceOf[js.Any], _localID = _localID.asInstanceOf[js.Any], _parentID = _parentID.asInstanceOf[js.Any], _rotation = _rotation.asInstanceOf[js.Any], _sx = _sx.asInstanceOf[js.Any], _sy = _sy.asInstanceOf[js.Any], _worldID = _worldID.asInstanceOf[js.Any], localTransform = localTransform.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), pivot = pivot.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setFromMatrix = js.Any.fromFunction1(setFromMatrix), skew = skew.asInstanceOf[js.Any], updateLocalTransform = js.Any.fromFunction0(updateLocalTransform), updateSkew = js.Any.fromFunction0(updateSkew), updateTransform = js.Any.fromFunction1(updateTransform), worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentLocalID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentLocalID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_cx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_cy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_localID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_localID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_parentID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_worldID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_worldID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPivot(value: ObservablePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: ObservablePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: ObservablePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFromMatrix(value: Matrix => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkew(value: ObservablePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateLocalTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLocalTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateSkew(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSkew")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateTransform(value: Transform => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWorldTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

