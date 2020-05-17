package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MtfRenderer extends XMtfRenderer {
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): Unit = js.native
}

object MtfRenderer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithBitmapCanvas: XBitmapCanvas => Unit,
    draw: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMetafile: SeqEquiv[Double] => Unit
  ): MtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithBitmapCanvas = js.Any.fromFunction1(createWithBitmapCanvas), draw = js.Any.fromFunction2(draw), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMetafile = js.Any.fromFunction1(setMetafile))
    __obj.asInstanceOf[MtfRenderer]
  }
  @scala.inline
  implicit class MtfRendererOps[Self <: MtfRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateWithBitmapCanvas(value: XBitmapCanvas => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithBitmapCanvas")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

