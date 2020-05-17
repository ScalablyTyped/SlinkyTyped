package typingsSlinky.reactPlotlyJs.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.mod.Annotations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.ClickAnnotationEvent> */
@js.native
trait ReadonlyClickAnnotationEv extends js.Object {
  val annotation: Annotations = js.native
  val event: MouseEvent = js.native
  val fullAnnotation: Annotations = js.native
  val index: Double = js.native
}

object ReadonlyClickAnnotationEv {
  @scala.inline
  def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ReadonlyClickAnnotationEv = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyClickAnnotationEv]
  }
  @scala.inline
  implicit class ReadonlyClickAnnotationEvOps[Self <: ReadonlyClickAnnotationEv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: Annotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullAnnotation(value: Annotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

