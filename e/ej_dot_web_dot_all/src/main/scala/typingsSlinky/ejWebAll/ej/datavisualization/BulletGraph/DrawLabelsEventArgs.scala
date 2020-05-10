package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawLabelsEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the label type.
    */
  var labelType: js.UndefOr[String] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
  /** returns the current label element.
    */
  var tickElement: js.UndefOr[HTMLElement] = js.native
}

object DrawLabelsEventArgs {
  @scala.inline
  def apply(): DrawLabelsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawLabelsEventArgs]
  }
  @scala.inline
  implicit class DrawLabelsEventArgsOps[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelType")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTickElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickElement")(js.undefined)
        ret
    }
  }
  
}

