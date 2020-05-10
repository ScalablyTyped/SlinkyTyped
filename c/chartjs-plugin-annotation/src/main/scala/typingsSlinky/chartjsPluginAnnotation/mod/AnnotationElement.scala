package typingsSlinky.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: classes and enums need to be outside the namespace,
// otherwise the merge with the constant ChartJsAnnotation fails
@js.native
trait AnnotationElement extends js.Object {
  var _model: js.Any = js.native
  // TODO: this should extend Chart.Element, but that typing is not defined in chart.js
  var hidden: Boolean = js.native
  var hovering: Boolean = js.native
  def configure(): Unit = js.native
  def destroy(): Unit = js.native
  def draw(): Unit = js.native
  def getArea(): Unit = js.native
  def getCenterPoint(): Unit = js.native
  def getHeight(): Unit = js.native
  def getWidth(): Unit = js.native
  def inRange(): Unit = js.native
  def initialize(): Unit = js.native
  def setDataLimits(): Unit = js.native
}

object AnnotationElement {
  @scala.inline
  def apply(
    _model: js.Any,
    configure: () => Unit,
    destroy: () => Unit,
    draw: () => Unit,
    getArea: () => Unit,
    getCenterPoint: () => Unit,
    getHeight: () => Unit,
    getWidth: () => Unit,
    hidden: Boolean,
    hovering: Boolean,
    inRange: () => Unit,
    initialize: () => Unit,
    setDataLimits: () => Unit
  ): AnnotationElement = {
    val __obj = js.Dynamic.literal(_model = _model.asInstanceOf[js.Any], configure = js.Any.fromFunction0(configure), destroy = js.Any.fromFunction0(destroy), draw = js.Any.fromFunction0(draw), getArea = js.Any.fromFunction0(getArea), getCenterPoint = js.Any.fromFunction0(getCenterPoint), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hidden = hidden.asInstanceOf[js.Any], hovering = hovering.asInstanceOf[js.Any], inRange = js.Any.fromFunction0(inRange), initialize = js.Any.fromFunction0(initialize), setDataLimits = js.Any.fromFunction0(setDataLimits))
    __obj.asInstanceOf[AnnotationElement]
  }
  @scala.inline
  implicit class AnnotationElementOps[Self <: AnnotationElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_model(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetArea(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArea")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCenterPoint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInRange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataLimits(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataLimits")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

