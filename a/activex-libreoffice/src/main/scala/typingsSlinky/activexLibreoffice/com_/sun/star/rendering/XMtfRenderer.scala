package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMtfRenderer extends XInterface {
  def draw(fScaleX: Double, fScaleY: Double): Unit = js.native
  def setMetafile(aMtf: SeqEquiv[Double]): Unit = js.native
}

object XMtfRenderer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    draw: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMetafile: SeqEquiv[Double] => Unit
  ): XMtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), draw = js.Any.fromFunction2(draw), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMetafile = js.Any.fromFunction1(setMetafile))
    __obj.asInstanceOf[XMtfRenderer]
  }
  @scala.inline
  implicit class XMtfRendererOps[Self <: XMtfRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMetafile(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMetafile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

