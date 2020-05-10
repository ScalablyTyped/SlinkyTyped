package typingsSlinky.dojo.dojox.gfx3d

import typingsSlinky.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait objectInstance extends js.Object {
  /**
    * multiplies the existing matrix with an argument on left side
    * (matrix * this.matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyLeftTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyRightTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * a shortcut for dojox.gfx.shape.Shape.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyTransform(matrix: Matrix3D): js.Function = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param lighting
    */
  def draw(lighting: js.Any): Unit = js.native
  /**
    *
    */
  def getOutline(): js.Any = js.native
  /**
    *
    */
  def getZOrder(): Double = js.native
  /**
    *
    */
  def invalidate(): Unit = js.native
  /**
    *
    * @param camera
    */
  def render(camera: js.Any): Unit = js.native
  /**
    * sets a fill object
    * (the default implementation is to delegate to
    * the underlying 2D shape).
    *
    * @param fill a fill object(see dojox.gfx.defaultLinearGradient,dojox.gfx.defaultRadialGradient,dojox.gfx.defaultPattern,dojo._base.Coloror dojox.gfx.MODEL)
    */
  def setFill(fill: js.Object): js.Function = js.native
  /**
    * sets a Object object
    *
    * @param newObject
    */
  def setObject(newObject: js.Any): js.Function = js.native
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox.gfx.defaultStroke)
    */
  def setStroke(stroke: js.Object): js.Function = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix
    */
  def setTransform(matrix: js.Any): js.Function = js.native
  /**
    *
    * @param lighting
    * @param normal
    */
  def toStdFill(lighting: js.Any, normal: js.Any): js.Any = js.native
}

object objectInstance {
  @scala.inline
  def apply(
    applyLeftTransform: Matrix3D => js.Function,
    applyRightTransform: Matrix3D => js.Function,
    applyTransform: Matrix3D => js.Function,
    destroy: () => Unit,
    draw: js.Any => Unit,
    getOutline: () => js.Any,
    getZOrder: () => Double,
    invalidate: () => Unit,
    render: js.Any => Unit,
    setFill: js.Object => js.Function,
    setObject: js.Any => js.Function,
    setStroke: js.Object => js.Function,
    setTransform: js.Any => js.Function,
    toStdFill: (js.Any, js.Any) => js.Any
  ): objectInstance = {
    val __obj = js.Dynamic.literal(applyLeftTransform = js.Any.fromFunction1(applyLeftTransform), applyRightTransform = js.Any.fromFunction1(applyRightTransform), applyTransform = js.Any.fromFunction1(applyTransform), destroy = js.Any.fromFunction0(destroy), draw = js.Any.fromFunction1(draw), getOutline = js.Any.fromFunction0(getOutline), getZOrder = js.Any.fromFunction0(getZOrder), invalidate = js.Any.fromFunction0(invalidate), render = js.Any.fromFunction1(render), setFill = js.Any.fromFunction1(setFill), setObject = js.Any.fromFunction1(setObject), setStroke = js.Any.fromFunction1(setStroke), setTransform = js.Any.fromFunction1(setTransform), toStdFill = js.Any.fromFunction2(toStdFill))
    __obj.asInstanceOf[objectInstance]
  }
  @scala.inline
  implicit class objectInstanceOps[Self <: objectInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyLeftTransform(value: Matrix3D => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLeftTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyRightTransform(value: Matrix3D => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRightTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyTransform(value: Matrix3D => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDraw(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOutline(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetZOrder(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFill(value: js.Object => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetObject(value: js.Any => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStroke(value: js.Object => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTransform(value: js.Any => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToStdFill(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStdFill")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

