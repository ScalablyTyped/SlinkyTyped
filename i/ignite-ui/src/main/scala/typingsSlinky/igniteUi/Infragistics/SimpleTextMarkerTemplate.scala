package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleTextMarkerTemplate extends js.Object {
  def getText(item: js.Object, textDelegate: js.Object): Unit = js.native
  def measure(measureInfo: js.Object): Unit = js.native
  def render(renderInfo: js.Object): Unit = js.native
}

object SimpleTextMarkerTemplate {
  @scala.inline
  def apply(getText: (js.Object, js.Object) => Unit, measure: js.Object => Unit, render: js.Object => Unit): SimpleTextMarkerTemplate = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction2(getText), measure = js.Any.fromFunction1(measure), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[SimpleTextMarkerTemplate]
  }
  @scala.inline
  implicit class SimpleTextMarkerTemplateOps[Self <: SimpleTextMarkerTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetText(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMeasure(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

