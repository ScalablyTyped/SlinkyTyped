package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Materialbox extends Component[MaterialboxOptions] {
  /**
    * Caption if specified
    */
  var caption: String = js.native
  /**
    * If the materialbox is no longer being animated
    */
  var doneAnimating: Boolean = js.native
  /**
    * Original height of image
    */
  var originalHeight: Double = js.native
  /**
    * Original width of image
    */
  var originalWidth: Double = js.native
  /**
    * If the materialbox overlay is showing
    */
  var overlayActive: Boolean = js.native
  /**
    * Close materialbox
    */
  def close(): Unit = js.native
  /**
    * Open materialbox
    */
  def open(): Unit = js.native
}

object Materialbox {
  @scala.inline
  def apply(
    caption: String,
    close: () => Unit,
    destroy: () => Unit,
    doneAnimating: Boolean,
    el: Element,
    open: () => Unit,
    options: MaterialboxOptions,
    originalHeight: Double,
    originalWidth: Double,
    overlayActive: Boolean
  ): Materialbox = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), doneAnimating = doneAnimating.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], overlayActive = overlayActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Materialbox]
  }
  @scala.inline
  implicit class MaterialboxOps[Self <: Materialbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoneAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOriginalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayActive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

