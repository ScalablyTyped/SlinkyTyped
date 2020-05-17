package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.XCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Create preview bitmaps for single slides. */
@js.native
trait SlideRenderer extends XSlideRenderer {
  /** Create a new {@link SlideRenderer} object. */
  def create(): Unit = js.native
}

object SlideRenderer {
  @scala.inline
  def apply(
    calculatePreviewSize: (Double, Size) => Size,
    create: () => Unit,
    createPreview: (XDrawPage, Size, Double) => XBitmap,
    createPreviewForCanvas: (XDrawPage, Size, Double, XCanvas) => typingsSlinky.activexLibreoffice.com_.sun.star.rendering.XBitmap
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), create = js.Any.fromFunction0(create), createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
    __obj.asInstanceOf[SlideRenderer]
  }
  @scala.inline
  implicit class SlideRendererOps[Self <: SlideRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

