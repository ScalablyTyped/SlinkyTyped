package typingsSlinky.reactRange.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRange.anon.Children
import typingsSlinky.reactRange.anon.Index
import typingsSlinky.reactRange.anon.IsDragged
import typingsSlinky.reactRange.typesMod.Direction
import typingsSlinky.reactRange.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("react-range", "Range")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRange.mod.Range] {
    
    @scala.inline
    def onFinalChange(value: /* values */ js.Array[Double] => Unit): this.type = set("onFinalChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderMark(value: /* params */ Index => ReactElement): this.type = set("renderMark", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggableTrack = draggableTrack.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProps]))
  }
}
