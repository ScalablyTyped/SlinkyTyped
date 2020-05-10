package typingsSlinky.ejWebAll.ej.datavisualization.BulletGraph

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawCaptionEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the current captionSettings element.
    */
  var captionElement: js.UndefOr[HTMLElement] = js.native
  /** returns the type of the captionSettings.
    */
  var captionType: js.UndefOr[String] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
}

object DrawCaptionEventArgs {
  @scala.inline
  def apply(): DrawCaptionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawCaptionEventArgs]
  }
  @scala.inline
  implicit class DrawCaptionEventArgsOps[Self <: DrawCaptionEventArgs] (val x: Self) extends AnyVal {
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
    def withCaptionElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionElement")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionType")(js.undefined)
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
  }
  
}

