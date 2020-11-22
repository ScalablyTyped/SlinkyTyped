package typingsSlinky.reactRange.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactRange.anon.Children
import typingsSlinky.reactRange.anon.Index
import typingsSlinky.reactRange.anon.IsDragged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProps extends js.Object {
  
  var allowOverlap: Boolean = js.native
  
  var direction: Direction = js.native
  
  var disabled: Boolean = js.native
  
  var draggableTrack: Boolean = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  def onChange(values: js.Array[Double]): Unit = js.native
  
  var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  
  var renderMark: js.UndefOr[js.Function1[/* params */ Index, ReactElement]] = js.native
  
  def renderThumb(params: IsDragged): ReactElement = js.native
  
  def renderTrack(params: Children): ReactElement = js.native
  
  var rtl: Boolean = js.native
  
  var step: Double = js.native
  
  var values: js.Array[Double] = js.native
}
object IProps {
  
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    draggableTrack: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Unit,
    renderThumb: IsDragged => ReactElement,
    renderTrack: Children => ReactElement,
    rtl: Boolean,
    step: Double,
    values: js.Array[Double]
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggableTrack = draggableTrack.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
  
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableTrack(value: Boolean): Self = this.set("draggableTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderThumb(value: IsDragged => ReactElement): Self = this.set("renderThumb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTrack(value: Children => ReactElement): Self = this.set("renderTrack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFinalChange(value: /* values */ js.Array[Double] => Unit): Self = this.set("onFinalChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinalChange: Self = this.set("onFinalChange", js.undefined)
    
    @scala.inline
    def setRenderMark(value: /* params */ Index => ReactElement): Self = this.set("renderMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderMark: Self = this.set("renderMark", js.undefined)
  }
}
